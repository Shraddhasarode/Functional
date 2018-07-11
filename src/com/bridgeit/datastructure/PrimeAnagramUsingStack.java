package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PrimeAnagramUsingStack {
	
	public static void main(String[] args) {
		linkedListStack stk = new linkedListStack<>();
		
		/*stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.pop();
		stk.display();*/
		
		String array[]=Utility.PrimeNumber();
		 String  array2[]=new String[168];
		 int[] anagram = new int [168];
		 int count =0;
		 
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(Utility.isAnagram(array[i], array[j]))
				 {
					 stk.push(Integer.valueOf(array[i]));
					 count++;
					 //System.out.println(anagram[i]);
					 stk.push(Integer.valueOf(array[j]));
					 count++;		 
				 }
			 }
		 }
		 
		 for(int i=0;i<array.length;i++) {
			 if(!stk.isEmpty()) {
				 int data = (int) stk.pop();
				 System.out.println(data);
			 }
		}
	}
}