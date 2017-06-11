package hu.bme.mit.inf.modes3.components.bbb;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import hu.bme.mit.inf.modes3.messaging.communication.enums.SegmentState;


public class FileHelper {
	
	public static void fileReader(ArrayList<BBBComponent> list){
	try {
	
		File file = new File("scenario.txt");
		
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write(" #00 l1 s01\n #00 l2 s23\n #00 l3 s20\n"
				+ " #01 s01 1\n #01 s02 1\n #01 s04 0\n #01 s05 1\n #01 s06 0\n"
				+ " #01 s07 1\n #01 s08 0\n #01 s10 0\n #01 s11 1\n #01 s12 1\n"
				+ " #01 s13 1\n #01 s15 0\n #01 s17 1\n #01 s18 1\n #01 s19 1\n"
				+ " #01 s20 0\n #01 s22 1\n #01 s23 1\n #01 s24 1\n #01 s26 0\n"
				+ " #01 s27 1\n #01 s29 0\n #01 s30 1\n #01 s31 0\n"
				+ " #01 to1 1\n #01 to2 1\n #01 to3 1\n"
				+ " #01 to4 1\n #01 to5 1\n #01 to6 1\n"
				+ " #02 l1 s12\n #01 s26 1\n #02 l2 s26");
		
		writer.flush();
		writer.close();
		
		
		FileReader fr = new FileReader(file);
		char[] command = new char[500];
		fr.read(command);
		String cmstr = String.valueOf(command);
	
		String[] linesOfCmd = cmstr.split("\n");
	
		
		Map locolist = new HashMap(); 
		byte[] segments={0,0,0,0};
		
		//list.get(0).onSegmentCommand(18, SegmentState.ENABLED);
		
		
		//one line
		for(String s : linesOfCmd){
			int delay = 0;
			String[] onepart = s.split(" ");
			//Azért 1-től indexelek, mert a 0. elem üres string tömb lenne
			delay = Integer.parseInt(onepart[1].substring(1, 3));
			
			System.out.println("o0: " + onepart[1] + " o1: " + onepart[2] +  " o2: " + onepart[3] + " delay: " + delay);
			
		
			try {
				Thread.sleep(delay*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			//locomotive objects 
			if(onepart[2].startsWith("l")){
				//override location
				/*
				if(locolist.containsKey(onepart[1])){
					segments[Integer.parseInt(locolist.get(onepart[1]).toString())] = 0;
				}
				locolist.put(onepart[1], onepart[2].substring(1, 2));		
				segments[Integer.parseInt(locolist.get(onepart[1]).toString())] = 1;
				*/
				//System.out.println("onepart[2] started with l");
				
			}
			
			
			//segments
			else if(onepart[2].startsWith("s")){
				//onepart[2].substring(1, 3)
				for (BBBComponent bb : list) {
					if(onepart[3].equals("1")){
						//System.out.println("egyvolt");
						bb.onSegmentCommand(Integer.parseInt(onepart[2].substring(1, 3)), SegmentState.ENABLED);
					}else if(onepart[3].equals("0")){
						//System.out.println("nemegyvolt");
						bb.onSegmentCommand(Integer.parseInt(onepart[2].substring(1, 3)), SegmentState.DISABLED);
						}
				}
			//	System.out.println("onepart[2] started with s");
			}
			
			

		}
		
		
	
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
