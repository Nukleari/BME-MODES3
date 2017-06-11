package hu.bme.mit.inf.modes3.components.occupancyquery;

import java.math.BigInteger;

import org.eclipse.xtend.lib.annotations.ToString;


public class ByteArrayHelper {
	
	static byte[] bytes = new byte[]{0,0,0,1};
	static int[] byteint=new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};

	public static byte[] read() {
		return bytes;
	}
	

	
	public static byte[] shift(){
		
		
		byte b0 = bytes[0];
		System.arraycopy(bytes, 1, bytes, 0, bytes.length -1);
		bytes[bytes.length -1] = b0;
		for (byte b : bytes) {
			System.out.print(String.format("%x", b));
		}
		return bytes;
	}
	
	public static byte[] shiftint(){
		
		int b0 = byteint[0];
		System.arraycopy(byteint, 1, byteint, 0, byteint.length -1);
		byteint[byteint.length -1] = b0;
		
		for (int b : byteint) {
			System.out.print(String.format("%x", b));
		}
		
		
		//első 8 számjegy
		String b1= "";
		for(int i = 0; i < 8; i++){
			b1 += Integer.toString(byteint[i]);
		}
		
		//convert binary to decimal
		int b1dec = Integer.parseInt(b1,2);
		b1 = Integer.toString(b1dec);
		
		//convert to byte
		bytes[0] = Byte.parseByte(b1);
		
		
		String b2 = "";
		for(int i = 8; i < 16; i++){
			b2 += Integer.toString(byteint[i]);
		}
		
		//convert binary to decimal
		int b2dec = Integer.parseInt(b2,2);
		b2 = Integer.toString(b2dec);
		
		bytes[1] = Byte.parseByte(b2);
		
		
		String b3 = "";
		for(int i = 16; i < 24; i++){
			b3 += Integer.toString(byteint[i]);
		}
		
		//convert binary to decimal
		int b3dec = Integer.parseInt(b3,2);
		b3 = Integer.toString(b3dec);
	
		bytes[2] = Byte.parseByte(b3);
		
		
		String b4 = "";
		for(int i = 24; i < 32; i++){
			b4 += Integer.toString(byteint[i]);
		}
		
		//convert binary to decimal
		int b4dec = Integer.parseInt(b4,2);
		b4 = Integer.toString(b4dec);
	
		bytes[3] = Byte.parseByte(b4);
		
		
		for (byte b : bytes) {
			System.out.print(String.format("%x", b));
		}
		
		
		return bytes;
	}
	
	}
	

