package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String array[]={"Mohan","Ram","John","Akashy","shradha"};
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	
		String[] sortedArray=Utility.mergeSort(array);
		System.out.println(" sorted array is ");
		for(int i=0;i<sortedArray.length;i++)
		{
			System.out.println(sortedArray[i]+"");
		}	
	}

}
