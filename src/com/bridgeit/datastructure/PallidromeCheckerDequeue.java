package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PallidromeCheckerDequeue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the string");
        String word=Utility.inputString();
        int len=word.length();
        
        Dequeue que=new Dequeue(len);
        
        Utility.PallidromeChecker(que,word);
        
        
	}

}
