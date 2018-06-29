package com.bridgeit.functional;

import java.io.PrintWriter;

import com.bridgeit.utility.Utility;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the no of rows");
        int m=Utility.inputInterger();
        System.out.println("Enter the no of column");
        int n=Utility.inputInterger();
        int a[][]=Utility.IntegerArray(m,n);
        int b[][]=Utility.booleanArray(m,n);
        int d[][]=Utility.doubleArray(m,n);
		
          
	}

}
