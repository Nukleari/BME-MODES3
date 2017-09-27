#!/usr/bin/env python

#sudo apt install python-numpy python-scipy python-imaging libopencv-dev python-opencv
#sudo pip install imutils

#sudo apt install python-zbar

#(apt install python-pip)
#sudo pip install adafruit-io

import sys
import time
import cv2
import numpy as np
import imutils
import thread
from socket import *
from PIL import Image
from pkg_resources import parse_version

from optparse import OptionParser

parser = OptionParser()

parser.add_option("-c", "--pc",
                  action="store_true", dest="pc", default=False,
                  help="use pc webcamera")

parser.add_option("-i", "--image",
                  action="store", type="string", dest="image")

(options, args) = parser.parse_args()

if(options.image == None):
    raspi = not options.pc
    pc = options.pc
else:
    raspi = False
    pc = False
    image = cv2.imread(options.image, 1)
#######################################################

TCP_IP="192.168.1.226"
TCP_PORT = 5005
TCP_PORT2 = 5006
sock = socket()
sock2 = socket()
sock.connect((TCP_IP,TCP_PORT))
sock2.connect((TCP_IP,TCP_PORT2))

def test(stream, sock):
    lastframetime = time.time()
    while(True):
        if(pc or raspi):
            image = stream.read()
        else:
            image = stream
        encode_param = [int(cv2.IMWRITE_JPEG_QUALITY), 60]
        result, imgencode = cv2.imencode('.jpg', image, encode_param)
        data = np.array(imgencode)
        stringData = data.tostring()

        sock.send(str(len(stringData)).ljust(16))
        sock.send(stringData)
        frametime = time.time() - lastframetime
        if frametime < 0.1:
            time.sleep(0.1 - frametime)
        else:
            time.sleep(0.01)
        lastframetime = time.time()

#######################################################
if(raspi):
    from imutils.video.pivideostream import PiVideoStream
    from picamera.array import PiRGBArray
    from picamera import PiCamera

    stream = PiVideoStream((640, 480), 15).start()

if(pc):
    from imutils.video.webcamvideostream import WebcamVideoStream

    stream = WebcamVideoStream().start()

#######################################################

rail_cascade = cv2.CascadeClassifier('rail_cascade.xml')

delay = 3
notFound = delay
direction = "stop"
lastdirection = None

for i in range(101):
    time.sleep(0.03)
    sys.stdout.write("\r[%s%s] %d%%" % ("=" * (i/2), "-" * (50 - (i/2)), i))
    sys.stdout.flush()
print ""
if(pc or raspi):
    thread.start_new_thread (test, (stream, sock,))
else:
    thread.start_new_thread (test, (image, sock,))
#######################################################

lastframetime = time.time()

while(True):
    if(raspi or pc):
        image = stream.read()
    image = imutils.resize(image, width=160)

    found = False
    data = ""
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    rails = rail_cascade.detectMultiScale(gray, 1.3, 1)
    for (x,y,w,h) in rails:
        print x + (w/2), y + (h/2)
        if(x + (w/2) > 75 and x + (w/2) < 85 and y + (h/2) > 50 and y + (h/2) < 90):
            found = True
            direction = "straight"
        elif(x + (w/2) > 40 and x + (w/2) < 76 and y + (h/2) > 50 and y + (h/2) < 100):
            found = True
            direction = "left"
        elif(x + (w/2) > 84 and x + (w/2) < 120 and y + (h/2) > 50 and y + (h/2) < 100):
            found = True
            direction = "right"

    if(found):
        notFound = 0
    else:
        notFound += 1
    if(notFound > delay):
        direction = "stop"

    if(direction != lastdirection):
        sock2.send(direction)
        print direction
    lastdirection = direction

    frametime = time.time() - lastframetime
    if frametime < 0.1:
        time.sleep(0.1 - frametime)
    else:
        time.sleep(0.01)
    #print (1/(time.time()-lastframetime))
    lastframetime = time.time()

#######################################################
sock.send('quit')
sock.close()
sock2.send('quit')
sock2.close()
cv2.destroyAllWindows()
if(raspi or pc):
    stream.stop()
