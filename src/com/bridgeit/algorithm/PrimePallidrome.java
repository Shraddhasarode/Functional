package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class PrimePallidrome {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
	
           System.out.println("Enter the range to check prime and palindrome");
           int range=Utility.inputInterger();
           System.out.println("Print Pallidrome prime");
           
           for(int i=2;i<range;i++) {
        	   if(Utility.primeNumberRange(i) && (Utility.PrimePallidromeNumber(i)))
        			   System.out.println(i);
           }
           
	}

}
