package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class leapYear {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
          System.out.println("enter the year");
          int year=Utility.inputInterger();
          
          if(year/1000>0)
          {
        	  Utility.checkYear(year);
          }else
          {
        	  System.out.println("please enter a valid four digit number");
          }
	}

}
