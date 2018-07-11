package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class MonthlyPayment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P=Integer.parseInt(args[0]);
		int R=Integer.parseInt(args[1]);
		int Y=Integer.parseInt(args[2]);
		double n= 12*Y;
		double r= R/(12*100);
	    double result =Utility.PaymentMonthly(P,n,r);
	    System.out.println(result);
		

	}

}
