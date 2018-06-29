package com.bridgeit.functional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgeit.utility.Utility;

public class UserString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Utility utility =new Utility();
        
        String string= "hello <<user name>> how are you";

        System.out.println("string");
        System.out.print("Enter the string : ");
        
        String input=Utility.inputString();
          
        if(input.length() >3)
        {
        	String result=Utility.UserString(string, input);
        	System.out.println("Replace String : "+result);
        }
        else
        {
        	System.out.println("Enter string more than three charcters");
        }
        
        
	}

}
