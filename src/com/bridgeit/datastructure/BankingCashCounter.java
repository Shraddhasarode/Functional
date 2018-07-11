package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BankingCashCounter {

	private static int bankBalance=100000;
	 
	public static void main(String[] args) {
		

		
		System.out.println("Enter size of queue");
		int size=Utility.inputInterger();
		
		System.out.println("Enter number of people in queue");
		int people=Utility.inputInterger();
		
		Queue ob=new Queue(size,people);
		Utility.BankingCounter(ob,bankBalance,people);
		
	}
}

