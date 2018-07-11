package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BlancedParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
         System.out.println("Enter the string");
         String exper=Utility.inputString();
      
         String result = Utility.isMatching(exper);
          
          System.out.println(result);
          
         
         
	}

}
