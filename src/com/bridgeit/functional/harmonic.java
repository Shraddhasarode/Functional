package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class harmonic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(" Enter the no of harmonic series");
        //call the method input integer and take the input 
        int number= Utility.inputInterger();
        Utility.harmonicSeries(number);
	}

}
