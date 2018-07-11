package com.bridgeit.objectorientedprograms;

import com.bridgeit.utility.Utility;

public class RegularExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String expression ="hello <<name>> , We have your full name as <<fullname>>  in your system";
		String  sentence =Utility.replaceFullName(expression);
		System.out.println(sentence);
		
		String expression1="Your contact number is   91­xxxxxxxxxx. ";
		String sentence1=Utility.mobileNumber(expression1);
		System.out.println(sentence1);
		
		String expression2="Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		String sentence2=Utility.Date(expression2);
		System.out.println(sentence2);
		
		System.out.println("Final sentence is");
		System.out.println(sentence+"   "+sentence1+ "      "+sentence2+"   ");
		
	}

}
