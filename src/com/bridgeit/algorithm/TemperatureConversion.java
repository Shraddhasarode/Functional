package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class TemperatureConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the teperature in Celsius");
		int c=Utility.inputInterger();
	    double result= Utility.CelsiusToFahrenheit(c);
	    System.out.println(result);
		 
		 System.out.println("Enter the temperature in Fahrenheit");
		 int f=Utility.inputInterger();
		 double result1=Utility.FahrenhetictoCelsius(f);
	
		 
		 

	}

}
