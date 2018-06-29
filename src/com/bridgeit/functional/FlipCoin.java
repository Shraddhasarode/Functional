package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class FlipCoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         System.out.println(" enter how many times to flip  a coin");
         int count=Utility.inputInterger();
         Utility.coinFlip(count);
         
	}

}
