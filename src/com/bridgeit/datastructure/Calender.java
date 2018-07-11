package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Calender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the month");
		int month=Utility.inputInterger();
		if(month<1||month>12)
		{
			System.out.println("Enter the range netween 1 to 12");
		}
		System.out.println("Enter year");
		int year=Utility.inputInterger();
		Utility.Calender(month,year);

	}

}
