package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class VendingMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money;
		int i=0;
		int notes[]={1000,500,100,50,20,10,5,2,1};
		 System.out.println("Enter the amount");
		 money=Utility.inputInterger();
		 Utility.CalculateMoney(money,notes,i);
		 
         
	}

}
