package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter the first string");
		String string1=Utility.inputString();
		System.out.println("Enter the second string");
		String string2=Utility.inputString();
		Utility.AnagramString(string1 ,string2 );
		

	}	

}
