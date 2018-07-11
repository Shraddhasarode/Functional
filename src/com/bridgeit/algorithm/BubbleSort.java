package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array size");
		int size=Utility.inputInterger();
		int arr[]=new int[size];
		
		int[] arr1 =Utility.BubbleSortNumber(arr);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+"");
			
		}
	}
}


