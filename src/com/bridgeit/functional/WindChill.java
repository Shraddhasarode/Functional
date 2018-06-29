package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class WindChill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t= Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		double w=Utility.WindChil(t,v);
		
	}
}


	
