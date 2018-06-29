package com.bridgeit.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	private static Scanner scanner=null;
	
	static
	{
	 scanner=new Scanner(System.in);	
	}

	public static String UserString(String string,String input)
	{
		String string1=string.replace("<<user name>>",input);
		//System.out.println(""+input);
		return string1;
	}

	public static String inputString() {
		
		
		return scanner.next();
	}

	public static int inputInterger() {
			
	//	return scanner.nextInt();
		//Random  cointoss=new Random();
		return scanner.nextInt();
		
		
	}

	public static void coinFlip(int count) {
		
		// TODO Auto-generated method stub
		double head=0;
		double tail=0;
		
		for(int i =1;i<=count;i++)
		{
			double random=Math.random();
			if(random <0.5)
			{
				head++;
			}
			else
			{
				tail++;
				
			}//percentage part remain.
			System.out.println("times head has fliped"+head);
			System.out.println("times tail has flipped"+tail);
			
		}
	}

	public static void checkYear(int year) {
		// TODO Auto-generated method stub
		//status of boolean  set to false
		boolean leap=false;
	if(year%4 ==0)
		{ 
			if(year%100==0)
			{
				if(year%400==0)
					leap=true;
				else 
					leap=false;
				
			}
			else leap=true;
			
		}else leap=false;
			
		if(leap)
			System.out.println("Is a leap year"+year);
		else
		    System.out.println("Is not a leap year"+year);
		
		//if(year%4==0)||(year%400==0)||(year%100!==0)
	
			
		}

	


	public static void powerOfTwo(int number) {
		
		// TODO Auto-generated method stub
		int range=inputInterger();
		int power=1;
		 for(int i=0;i<=range;i++)
		 {
			 power=power*2;
			 
		 }
		 System.out.println("2^"+"="+power);
	}

	public static void harmonicSeries(int number) {
		
		// TODO Auto-generated method stub
		double sum=0.0;
		for(double i=1;i<=number;i++)
		{
			sum=sum+1/i;
			//System.out.println("sum of harmonic series is" +sum);
		}
		System.out.println("sum of harmonic series is" +sum);
	}

	

	public static void PrimeFactor(int number) {
		// TODO Auto-generated method stub
		System.out.println("prime factor of"+"" +number+ " "+" is:=");
		int i=2;
		while(i<=number)
		{
			if(number%i==0)
			{
				System.out.println(""+i);
				number=number/i;
				
			}
			else if (number%i!=0)
			{
				i++;
			}
		}
	
	}


	public static void gambler(int stake, int goal, int number) {
		// TODO Auto-generated method stub
		int win=0;
		int bets=0;
		int loss=0;
		
		for(int i=0;i<=number;i++)
		{
			int cash=stake;
			while(cash >0 && cash< goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
				
		if(cash==goal)
		{
			win++;
					
		}
		else
		{
			loss--;
			
		}
		}
			System.out.println("win percentage is"+ (win/number)* 100);
			System.out.println("loss percentage is"+(loss/number)*100);
			
		}
	}

	public static int findCoupoun(int n) {
		// TODO Auto-generated method stub
		boolean[] iscollected=new boolean[n];
		int[] array=new int[n];
		int count=0;
		int distinct=0;
		int i=0;
		while(distinct<n)
		{
			 int value= (int)(Math.random()*n);
			 System.out.println("value "+value);
			 count++;
			 System.out.println("iscollected "+iscollected[value]);
			 if(!iscollected[value]){
				 array[i]=value;
				 System.out.println();
				 System.out.println();
				 System.out.println("array value "+array[i]);
				 i++;
				 distinct++;
				 iscollected[value]=true; 
				 
			 }
			 System.out.println("disting "+distinct); 
			
		}
		 
		//System.out.println(count);
		return count; 
	}

	

	public static int sumOfThreeZero(int[] arr, int size) {
		// TODO Auto-generated method stub
		int i,j,k, count=0;
		for( i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				for(k=j+1;k<size;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]+" " +arr[j]+ " " +arr[k]);
						//count++;
						
					}
				}
			}
		}
		return count;
		
	}

	public static void Distance1(int x, int y) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the vaue of x"+"="+x);
		System.out.println("Enter the value of y"+"="+y);
		double dist=Math.sqrt(x*x+y*y);
		System.out.println("Distance from the point("+x+","+y+"="+dist );
	}

	

	public static void Permute(String string, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low==high)
		          System.out.println(string);
		    else
		          {
		            for(int i=low;i<=high;i++)
		            {
		            	string=swap(string,low,i);
		            	Permute(string,low+1,high);
		            	string=swap(string,low,i);
		            	
		            }
		          }
		}

	private static String swap(String str, int i, int j) {
		// TODO Auto-generated method stub
		   char temp;
		   char[] charArray=str.toCharArray();
		   temp=charArray[i];
		   charArray[i]=charArray[j];
		   charArray[j]=temp;	      
		   return String.valueOf(charArray);
	}

	

	

	public static void QuadraticNumber(int a, int b, int c) {
		// TODO Auto-generated method stub
		double root1,root2;
		int delta;
		System.out.println("Given quadratic equation is in form"+a+"x*x+"+b+"x+"+c );
		delta=b*b -4*a*c;
		if(delta >0)
		{
			System.out.println("roots are real and unequal");
			root1=(-b+ Math.sqrt(delta))/(2*a);
			root2=(b-Math.sqrt(delta))/(2*a);
			System.out.println("First root is"+root1);
			System.out.println("Second root is"+root2);
			
		}
		else if(delta==0)
		{
			System.out.println("roots are real and equal");
			root1=(-b+Math.sqrt(delta));
			System.out.println("root:"+root1);
			
		}
		else
		{
			System.out.println("Roots are imaginary");
		}
		
	}

	public static double WindChil(double t, double v) {
		// TODO Auto-generated method stub
		double w= 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.6);
		System.out.println("Windchill"+w);
		return w;
	}
		
	}

	/*public static int[][] IntegerArray(int m, int n) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public static int[][] booleanArray(int m, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int[][] doubleArray(int m, int n) {
		// TODO Auto-generated method stub
		return null;
	}
	}
*/
