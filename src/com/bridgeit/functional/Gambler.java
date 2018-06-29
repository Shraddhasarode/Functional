package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Gambler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
           System.out.println("Enter the  number of stake");
           int stake=Utility.inputInterger();
           System.out.println("Enter the number of Goal");
           int goal=Utility.inputInterger();
           System.out.println("Enter the number of times");
           int number=Utility.inputInterger();
           Utility.gambler(stake,goal,number);
	}

}
