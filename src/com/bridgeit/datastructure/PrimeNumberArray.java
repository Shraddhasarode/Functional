package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PrimeNumberArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the range of prime number");
     int[][] primearray =Utility.twoDimensionalArray();
     for (int i = 0; i < 10; i++) {
     	for (int j = 0; j < 25; j++) {
     		if(primearray[i][j]!=0)
     		{
     			System.out.println("|"+primearray[i][j]+"|");
     		}else
     		{
     			continue;
     		}
     	
     	}
     	System.out.println("");
     }
	}

}
