package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.out.println("Enter the no of words to be printed");
             int N=Utility.inputInterger();
             String array[]=new String[N];
             for(int i=0;i<N;i++)
             {
            	 array[i]=Utility.inputString();
            	
             }
           String  sortedarray[]= Utility.InsertionSortString(array,N);
           System.out.println("sorted array is:");
            for(int i=0;i<N;i++)
            {
           	System.out.println(sortedarray[i]);
            }
	}

}
