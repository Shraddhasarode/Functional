package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class SumThreeIntegerZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /* int array[]={0,1,2,3,-1,-2,-3};
           int length=array.length;
           System.out.println(length);
           Utility.sumOfThreeZero(array,length);*/
		
		System.out.println("Enter size of array");
		int size=Utility.inputInterger();
		int arr[] =new int [size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter " +(i+1)+"  value :");
			arr[i]=Utility.inputInterger();
		}
		Utility.sumOfThreeZero(arr,size);
		//System.out.println("sum of three nos"+sum);
           
           
           
	

	}
}

