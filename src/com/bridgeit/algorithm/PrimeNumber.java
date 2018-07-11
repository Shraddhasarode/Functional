package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter prime number range");
		int range=Utility.inputInterger();
		for(int i=2;i<=range;i++) {
			boolean value = Utility.primeNumberRange(i);
			if(value)
				System.out.println(i);
		}
	}

}
