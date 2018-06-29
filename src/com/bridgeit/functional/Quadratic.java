package com.bridgeit.functional;

import com.bridgeit.utility.Utility;
public class Quadratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Given quadratic euation is in form "+"a*x*x+b*x+c");
		System.out.println("Enter the value of a");
		int a=Utility.inputInterger();
		System.out.println("Enter the value of b");
		int b=Utility.inputInterger();
		System.out.println("Enter the value of c");
		int c=Utility.inputInterger();
		Utility.QuadraticNumber(a,b,c);
		

	}

}
