package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class UnorderdList {

	
	public static void main(String[] args) throws IOException {
		
	
		File file = new File("/home/bridgeit/Desktop/shraddha/Javaprograms/src/d.txt");
		 
		  BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  try {
			while ((st = br.readLine()) != null)
			{
				  System.out.println(st);
				 String line=br.readLine();
				  //String[] words = line.split(" ");
				  
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}