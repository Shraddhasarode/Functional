package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class StopWatch {

	/**
	 * @param args
	 */
	     private long starttime=0;
	     private long stoptime=0;
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter start time");
      long start=Utility.inputInterger();
      start=System.currentTimeMillis();
      System.out.println("Enter stop time");
      long stop=Utility.inputInterger();
      stop=System.currentTimeMillis();
       
      System.out.println("elapsed time="+((stop-start)/1000));
	}

}
