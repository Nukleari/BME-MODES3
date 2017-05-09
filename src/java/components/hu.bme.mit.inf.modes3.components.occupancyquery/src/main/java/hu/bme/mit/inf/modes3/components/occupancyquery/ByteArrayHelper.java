package hu.bme.mit.inf.modes3.components.occupancyquery;

import java.math.BigInteger;


public class ByteArrayHelper {
	
	static byte[] bytes = new byte[]{0,0,0,1};

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
		
		
//		
//		System.out.println(bytes.length);
//		byte[] c = null;
//		for(int i= 0; i< bytes.length; i++){
//		
//		//	start[i] << 1;
//		
//			byte b = bytes[i];
//			b = (byte) (b << 1);
//			c[i] = b;
//		}		
//		for (byte b : c) {
//	    System.out.print(String.format("%x", b));
//	}
//		return c;
		
		
		
		
		
//		
////			byte[] barray = read();
//////			for (byte b : barray) {
//////			    System.out.print(String.format("%x", b));
//////			}
////			BigInteger bigInt = new BigInteger(barray);
////
////			// shift
////			BigInteger shiftInt = bigInt.shiftRight(4);
////			
////			// back to array
////			 byte[] shifted = shiftInt.toByteArray();
////			 for (byte b : shifted) {
////				    System.out.print(String.format("%x", b));
////				}
////			return shifted;
	}
	}
	

