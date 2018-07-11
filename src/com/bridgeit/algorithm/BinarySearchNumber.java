package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class BinarySearchNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		int number=Utility.inputInterger();
		int range=(int) Math.pow(2, number);
		Utility.BinaryNumber(0,range);

	}

}
