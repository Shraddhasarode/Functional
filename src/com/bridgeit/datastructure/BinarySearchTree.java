package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BinarySearchTree {

	
	public static void main(String[] args) {
	
		
		System.out.println("Enter the number of nodes");
		int nodes=Utility.inputInterger();
		 
		int array[]= new int[nodes];
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInterger();
		}
           	System.out.println();
           	
           	Utility.FindBinarySearchTree(array);
	}

}