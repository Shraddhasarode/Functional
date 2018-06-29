package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class StringPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Enter the string");
          String string=Utility.inputString();
          int length=string.length();
          Utility.Permute(string,0,length-1);
	}

}
