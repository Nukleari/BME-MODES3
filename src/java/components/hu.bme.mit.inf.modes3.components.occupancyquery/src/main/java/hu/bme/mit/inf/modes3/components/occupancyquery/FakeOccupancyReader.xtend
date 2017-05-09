package hu.bme.mit.inf.modes3.components.occupancyquery



class FakeOccupancyReader implements Runnable {
	def byte[] read() {
		val bytes = ByteArrayHelper.read
		
	//	bytes.set(0, (bytes.get(0) >>> 1) as byte);
		
		return bytes
	}

//	def byte[] shift(){
//		val bytes = ByteArrayHelper.shift
//		bytes.set(0, (bytes.get(0) >>> 1) as byte);
//		
//		return bytes
//	}
	

	override run() {
		// generate byte array
		// Create a 4 byte array, shift a single 1 from index 0 to index 31 every 1 sec
		while(true){
			Thread.sleep(1000)		
			ByteArrayHelper.shift()
			read()
			
			}
		
	}
	

}
