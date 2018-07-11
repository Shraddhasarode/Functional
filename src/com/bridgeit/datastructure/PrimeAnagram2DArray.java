package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PrimeAnagram2DArray {
 public static void main(String[] args) {
	 String array[]=Utility.PrimeNumber();
	/* for(int i=0;i<array.length;i++)
	 {
		 System.out.println(array[i]);
	 }*/
	 String array2[]=new String[168];
	 
	 int[] anagram = new int [168];
	 int count =0;
	 
	 for(int i=0;i<array.length;i++)
	 {
		 for(int j=i+1;j<array.length;j++)
		 {
			 if(Utility.isAnagram(array[i], array[j]))
			 {
				 anagram[count]=Integer.valueOf(array[i]);
				 count++;
				 //System.out.println(anagram[i]);
				 anagram[count]=Integer.valueOf(array[j]);
				 count++;
				
				 //Utility.TwoDArray();
			 }
		 }
	 }
 Utility.TwoDArray(anagram);
 }
 
 }
