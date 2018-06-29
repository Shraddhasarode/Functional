package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class couponNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the coupoun numbers you want to generate");
		int N=Utility.inputInterger();
		int totalNumber=Utility.findCoupoun(N);
		
		

	}

}
