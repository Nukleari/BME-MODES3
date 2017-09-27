#!/usr/bin/python

from socket import *
import cv2
import numpy
import time
import thread

def recvall(sock, count):
	buf = b''
	while count:
		newbuf = sock.recv(count)
		if not newbuf: return None
		buf += newbuf
		count -= len(newbuf)
	return buf


TCP_IP = "192.168.1.226"
TCP_PORT = 5005
TCP_PORT2 = 5006

s = socket()
s2 = socket()
s.bind((TCP_IP, TCP_PORT))
s2.bind((TCP_IP, TCP_PORT2))
s.listen(True)
s2.listen(True)
print '[INFO] Server started on IP:{} port:{},{}'.format(TCP_IP, TCP_PORT, TCP_PORT2)
print '[INFO] Waiting for client to connect'
conn, addr = s.accept()
conn2, addr2 = s2.accept()
print'[INFO] Client connected from IP:{}'.format(addr[0])

stop = cv2.imread("sign/stop.png", 1)
straight = cv2.imread("sign/straight.png", 1)
left = cv2.imread("sign/left.png", 1)
right = cv2.imread("sign/right.png", 1)
rail_cascade = cv2.CascadeClassifier('rail_cascade.xml')

lastframetime = time.time()

def signdata(conn):
	while(True):
		direction = conn.recv(8)
		if(direction != None):
			if(direction == "stop"):
				cv2.imshow("Sign",stop)
			if(direction == "straight"):
				cv2.imshow("Sign",straight)
			if(direction == "left"):
				cv2.imshow("Sign",left)
			if(direction == "right"):
				cv2.imshow("Sign",right)

thread.start_new_thread (signdata, (conn2,))

while(True):
		length = recvall(conn, 16)
		print length
		if(length != None):
			stringData = recvall(conn, int(length))
			data = numpy.fromstring(stringData,dtype='uint8')
			decimg = cv2.imdecode(data,1)

			gray = cv2.cvtColor(decimg, cv2.COLOR_BGR2GRAY)
			rails = rail_cascade.detectMultiScale(gray, 1.3, 1)
			for (x,y,w,h) in rails:
				cv2.rectangle(decimg,(x,y),(x+w,y+h),(255,0,0),2)
			cv2.imshow("Server",decimg)
			print (1/(time.time()-lastframetime))
			lastframetime = time.time()

		if cv2.waitKey(1) & 0xFF == ord('q'):
			break
conn.close()
conn2.close()
cv2.destroyAllWindows()
exit(1)
