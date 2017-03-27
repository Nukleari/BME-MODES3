package hu.bme.mit.inf.modes3.components.occupancyquery

class FakeOccupancyReader implements Runnable {
	def byte[] read() {
		val bytes = ByteArrayHelper.read
		
		bytes.set(0, (bytes.get(0) >>> 1) as byte);
		
		return bytes
	}

	override run() {
		// TODO generate byte array
		// Create a 4 byte array, shift a single 1 from index 0 to index 31 every 1 sec
	}
	
//	plz help, I'm stucked :(
//	howto byte tömb :(
//	ez java helper kéne legyen. de hogyan? :(
//	public static byte[] byteArray(int length) {
//  return new byte[length];
//}
}
