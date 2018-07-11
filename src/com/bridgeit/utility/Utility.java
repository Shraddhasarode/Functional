package com.bridgeit.utility;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgeit.datastructure.Dequeue;
import com.bridgeit.datastructure.Queue;
import com.bridgeit.datastructure.Stack;

public class Utility {
	private static Scanner scanner=null;
	
	static
	{
	 scanner=new Scanner(System.in);	
	}
//................................User String.............................//
	public static String UserString(String string,String input)
	{
		String string1=string.replace("<<user name>>",input);
		//System.out.println(""+input);
		return string1;
	}

	public static String inputString() {
		
		
		return scanner.next();
		
	}
	private static boolean inputBoolean() {
		// TODO Auto-generated method stub
		return scanner.nextBoolean();
	}

	public static int inputInterger() {
			
	//	return scanner.nextInt();
		//Random  cointoss=new Random();
		return scanner.nextInt();
		
		
	}
//...............................Coin flip flop.............................//
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
//..............................Leap Year........................................//
	public static boolean checkYear(int year) {
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
		return leap;
		
		//if(year%4==0)||(year%400==0)||(year%100!==0)
	
			
		}

	

//.......................................Powe of two........................//
	public static void powerOfTwo(int number) {
		
		// TODO Auto-generated method stub
		int range=inputInterger();
		int power=1;
		 for(int i=0;i<=range;i++)
		 {
			 //power=power*2;
			 System.out.println("2^"+"="+(power*2));
			 
		 }
		//System.out.println("2^"+"="+power);
	}
//..............................Harmonic series...................................//
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

	
//.................................Prime Factor................................//
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

//.......................................Gambler..............................//
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
//............................................Coupoun .....................................//
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

	
//........................sum of three no is zero........................//
	public static void sumOfThreeZero(int[] arr, int size) {
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
						System.out.println(count);
						
					}
				}
			}
		}
		//return count;
		
	}
//.......................Distance.......................................//
	public static void Distance1(int x, int y) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the vaue of x"+"="+x);
		System.out.println("Enter the value of y"+"="+y);
		double dist=Math.sqrt(x*x+y*y);
		System.out.println("Distance from the point("+x+","+y+"="+dist );
	}

	
//...................................premute..........................//
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

	

//....................................................................///	

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
//...............................windchill.........................................//
	public static double WindChil(double t, double v) {
		// TODO Auto-generated method stub
		double w= 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.6);
		System.out.println("Windchill"+w);
		return w;
	}

//......................Algorithms Programs.............................................//
//..........................String Anagram......................................//


public static void AnagramString(String s1, String s2) {
	// TODO Auto-generated method stub

	String copyOfs1 = s1.replaceAll("\\s", "");
	 
    String copyOfs2 = s2.replaceAll("\\s", "");

    boolean status = true;

    if(copyOfs1.length() != copyOfs2.length())
    {

        status = false;
    }
    else
    {
    	char[] s1Array = copyOfs1.toLowerCase().toCharArray();

        char[] s2Array = copyOfs2.toLowerCase().toCharArray();

        Arrays.sort(s1Array);

        Arrays.sort(s2Array);

        status = Arrays.equals(s1Array, s2Array);
    }

    if(status)
    {
        System.out.println("Strings are anagrams");
    }
    else
    {
        System.out.println("Strings are not anagrams");
    }
}

//........Prime no in range...............//
public static boolean primeNumberRange(int i) {
	// TODO Auto-generated method stub
	
	int flag;
		flag=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
				
			}
			
		}
		if(flag==0)
		{
			return true;
		}
	return false;
}

//...........................prime Pallidrome............................
public static boolean PrimePallidromeNumber(int number) {
	// TODO Auto-generated method stub
	int sum=0;
	int rem;
	int temp=number;
	while(number!=0)
	{
		rem=number%10;
		sum=sum*10+rem;
		number=number/10;
	}
	if(temp==sum)
	{
		return true;		
	}
	return false;	
}



//............Insertion Sort...................//
public static  String[] InsertionSortString(String[] array,int size) {
	// TODO Auto-generated method stub
	String temp="";
	System.out.println("sorted order of array is ");
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			if(array[i].compareToIgnoreCase(array[j])<0)
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
		}
	}
	return array;
}


//...................Binary Search........................//
public static void BinaryNumber(int low, int high) {
	// TODO Auto-generated method stub
	    if(low==high)
	    {
	    	System.out.println("Enter number is "+low);
	    	System.out.println("Your number is "+(low-1)+"and"+(high+1));
	    	return;
	    }
	    int mid=(low+high)/2;
	    int choice;
	    System.out.println("press 1:"+low+"-"+mid);
	    System.out.println("press 2:"+(mid+1)+"-"+high);
	    choice=scanner.nextInt();
	    if(choice==1)
	    {
	    	BinaryNumber(low,mid);
	    	
	    }
	    else if(choice==2)
	    {
	    	BinaryNumber(mid+1,high);
	    }
	    else
	    {
	    	System.out.println("your enter number is wrong");
	    }    
	
}
//.....................Bubble sort.............................//
public static int[] BubbleSortNumber(int[] arr) {
	// TODO Auto-generated method stub
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		arr[i]=scanner.nextInt();
		
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			int temp=arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
			}
			
		}
		
	}
	return arr;	
	}

//...........................Vending Machine..................................//
public static void CalculateMoney(int money, int[] notes,int i) {
	// TODO Auto-generated method stub
	int rem;
    int total=0;
	if(money==0)
	{
	return;
	}
	else
	{
		
		
		if(money >=notes[i])
		{
			int calNotes= money/notes[i];
			rem=money%notes[i];
			money=rem;
			total=+calNotes;
			System.out.println(notes[i]+".notes ---------->"+calNotes);
			
		}
		i++;
		CalculateMoney(money,notes,i);
	}    
	
}
//..........................Days of Week...............................//
public static void DaysofWeeks(int m, int d, int y) {
	// TODO Auto-generated method stub
	int yo=y-(14-m)/12;
	System.out.println(yo);
	
	int x=yo+yo/4-yo/100+yo/400;
	System.out.println(x);
	
	int  mo= m+12*((14-m)/12)-2;
	System.out.println(mo);
	
	int do1=((d+x+31*mo)/12)% 7;
	System.out.println(do1);
	
}

//................................Temperature Conversion....................//
public static double CelsiusToFahrenheit(double value) {
	
	
	return ((value *9/5))+32;
	
	
}

public static double FahrenhetictoCelsius(double value) {
	

	return ((value-32)*5/9);
	
}

//..................................Monthly Payment..............................//
public static double PaymentMonthly(int P, double n, double r) {
	// TODO Auto-generated method stub
	double PM=((P*r)/(1-(Math.pow((1+r),(-n)))));
	System.out.println("Monthly payment is "+PM+"Rs");
	return 0;
	
}
//.........................................Search sort.................//
public static int[] inputIntegerArray(int size) {
	// TODO Auto-generated method stub
	int [] array=new int [size];
	System.out.println("Enter the array elements");
	for(int index=0;index<size;index++)
	{
		array[index]=Utility.inputInterger();
	}
	return array;
}

public static String[] inputStringArray(int size) {
	// TODO Auto-generated method stub
	String str[]=new String[size];
	System.out.println("Enter the array elements");
	for(int index=0;index<size;index++)
	{
		str[index]=Utility.inputString();
	}
	
	return str;
}

public static void printIntegerArray(int[] array1, int size) {
	// TODO Auto-generated method stub
	for(int index=0;index<size;index++)
	{
		System.out.println(array1[index]);
	}
}

public static void printStringArray(String[] str1, int size) {
	// TODO Auto-generated method stub
	for(int index=0;index<size;index++)
	{
		System.out.println(str1[index]);
	}
}

public static int binarySearchInteger(int[] array, int elem) {
    int first=0;
    int last=array.length;
    while(first<last)
    {
    	int mid=(first+last)/2;
    	if(elem<array[mid])
    		last=mid;
    	else if (elem>array[mid])
    	     first=mid+1;
    	else 
    		return mid;
    }
	return -1;
}

public static int binarySearchString(String[] str, String key) {
	
	int first =0;
	int last=str.length;
    while(first<last)
    {
      int mid=(first+last)/2;
      if(key.compareTo(str[mid])<0)
    	  last=mid;
      else if(key.compareTo(str[mid])>0)
    	  first=mid+1;
      else
    	  return mid;
    	  
    	  
    }
	return -1;
}

public static int[] InsertionSortInteger(int[] array1, int size) {
	
	int  key;
	for(int index=1;index<size;index++)
	{
		key=array1[index];
		int j=index-1;
		while(j>0 && key <array1[j])
		{
			array1[j+1]=array1[j];
			j--;
			
		}
		array1[j+1]=key;
	}
	return array1;
}

public static String[] insertionSortString(String[] str1, int size) {
	
	String key;
	for(int index=1;index<size;index++)
	{
		key=str1[index];
		int j=index-1;
		while(j>0 && key.compareTo(str1[j])<0)
		{
			str1[j+1]=str1[j];
			j--;
			
		}
		str1[j+1]=key;
	}
	return str1;	
	
}

public static int[] bubbleSortInteger(int[] array2, int size) {
	//int n=array2.length;
	int temp=0;
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size-1;j++)
		{
			if(array2[j]>array2[j+1])
			{
				temp=array2[j];
				array2[j]=array2[j+1];
				array2[j+1]=temp;
				
				
			}
		}
	}       return array2;
}

public static String[] bubbleSortString(String[] str3, int size) {
	
       String temp;
       for(int i=0;i<size;i++)
       {
    	   for(int j=0;j<size-1;j++)
    	   {
    		   if(str3[j].compareTo(str3[j+1])>0)
    		   {
    			   temp=str3[j];
    			   str3[j]=str3[j+1];
    			   str3[j+1]=temp;   
    		   }
    	   }
       } return str3;	
      
}

public static long start() {
	// TODO Auto-generated method stub
	return System.currentTimeMillis();
}

public static long stop() {
	// TODO Auto-generated method stub
	return System.currentTimeMillis();
}

public static long elapsedTime(long startTime, long stopTime) {
	long elapsedtime=startTime-stopTime;
	
	return elapsedtime;
}
//........................................Merge sort............................//

public static String[] mergeSort(String[] list) {
    String [] sorted = new String[list.length];
    if (list.length == 1) {
        sorted = list;
    } else {
        int mid = list.length/2;
        String[] left = null; 
        String[] right = null;
        if ((list.length % 2) == 0) {
            left = new String[list.length/2];
            right = new String[list.length/2];
        } else { 
            left = new String[list.length/2];
            right = new String[(list.length/2)+1];
        }
        int x=0;
        int y=0;
        for ( ; x < mid; x++) {
            left[x] = list[x];
        }
        for ( ; x < list.length; x++) {
            right[y++] = list[x];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        sorted = mergeArray(left,right);
    }

    return sorted;
}

private static String[] mergeArray(String[] left, String[] right) {
    String[] merged = new String[left.length+right.length];
    int lIndex = 0;
    int rIndex = 0;
    int mIndex = 0;
    int comp = 0;
    while (lIndex < left.length || rIndex < right.length) {
        if (lIndex == left.length) {
            merged[mIndex++] = right[rIndex++];
        } else if (rIndex == right.length) {
            merged[mIndex++] = left[lIndex++];
        } else {  
            comp = left[lIndex].compareTo(right[rIndex]);
            if (comp > 0) {
                merged[mIndex++] = right[rIndex++];
            } else if (comp < 0) {
                merged[mIndex++] = left[lIndex++];
            } else { 
                merged[mIndex++] = left[lIndex++];
            }
        }   
    }
    return merged;
}
//...........................................Square root program.....................//
public static void SqrtNumber(int c) {
	
	double t=c;
    double epsilon = 1e-15;    
   
         
    System.out.println(epsilon*t);
    
    while (Math.abs(t - c/t) > epsilon*t) {
        t = (c/t + t) / 2.0;
    }  
    System.out.println(t);
}
//.....................................to binary....................................//
public static void toBinary(int number) {
	int index=0;
	int[]  binary=new int[40];
	while(number>0)
	{
		binary[index]=number%2;
		number=number/2;
		index++;
	}
	for(int i=index-1;i>=0;i--)
	{
		System.out.print(binary[i]);
	}
}
//.............................................TicTacToe.........................
public static String TicTacToe() {
	boolean user=false;
	int array[][] = new int[3][3];
	for(int row=0;row<3;row++){
		for(int col=0;col<3;col++){
			array[row][col]=-1;
		}
	}
	
	for(int i=0;i<9;i++){
		if(user){
			System.out.println("User Turn : ");
			userTurn(array);
			user=false;
			printGameArray(array);
			if(checkWin(array, 0)){
				return "User Won";
			}
		}
		else {
			System.out.println("Computer Turn : ");
			computerTurn(array);
			user=true;
			printGameArray(array);
			if(checkWin(array, 1)){
				return "computer won";
			}
		}
	}
	return "Match draw";
}

public static void userTurn(int[][] array) {
	System.out.println("Enter row : ");
	int row = inputInterger();
	System.out.println("Enter col : ");
	int col = inputInterger();
	
	if(checkValidInput(array, row, col)){
		array[row][col] = 0;
	}
	else {
		userTurn(array);
	}
}


public static void computerTurn(int[][] array){
	Random random = new Random();
	int row = random.nextInt(3);
	int col = random.nextInt(3);
	
	if(checkValidInput(array,row,col)){
		array[row][col] = 1;
	}
	else {
		computerTurn(array);
	}
}

public static boolean checkWin(int[][] array, int value) {
	for(int i=0;i<3;i++){
		if(array[i][0] == value && array[i][1] == value && array[i][2] == value)
			return true;
		if(array[0][i] == value && array[1][i] ==value && array[2][i] ==value)
			return true;
	}
	if(array[0][0] == value && array[1][1] == value && array[2][2] == value)
		return true;
	if(array[0][2] == value && array[1][1] == value && array[2][0] == value)
		return true;
	
	return false;
}

public static void printGameArray(int[][] array) {
	for(int row=0;row<3;row++){
		for(int col=0;col<3;col++){
			if(array[row][col] == 1)
				System.out.print("| X |");
			else if(array[row][col] == 0)
				System.out.print("| O |");
			else
				System.out.print("|   |");
		}
		System.out.println();
		System.out.println("----------------");
	}
}


public static boolean checkValidInput(int[][] array, int row, int col) {
	if(array[row][col]==-1)
		return true;
	return false;
}


//...............Data structure No 3...............//
public static String isMatching(String exper) {
	// TODO Auto-generated method stub
	int len = exper.length();
	Stack <Character> stack=new Stack(len);
	 for(int i=0;i<len;i++)
	 {     char ch=exper.charAt(i);
		 if(ch=='('||ch=='{'||ch=='[')
			 stack.push(ch);
		 else if((ch==')'||ch=='}'||ch==']')&& (!stack.isEmpty()))
		 {
			 if ((stack.peek() == '(' && ch == ')')
						|| ( stack.peek() == '{' && ch == '}')
						|| ( stack.peek() == '[' && ch == ']')) {
					stack.pop();
				} else {
					return "Not Balanced";
				}
			} else {
				if ((ch == ']' || ch == '}' || ch == ')')) {
					return "Not Balanced";
				}
			}
		}
		if (stack.isEmpty())
			return "Balanced Parenthisis";
		else
			return "Not Balanced";
	}


//.........................................Banking cash Counter................//
public static void BankingCounter(Queue ob, int bankBalance, int people) {

	int count=0;
	while(count<=people){
		boolean flag;
		System.out.println("..........Banking Counter Transaction Running");
	do
	{
		System.out.println();
	
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.check Current Balance is ");
		System.out.println("4.Number of person in queue");
		System.out.println("5.Dequeue");
		System.out.println("6.Enqueue");
		System.out.println("Enter your choice");
		int choice=Utility.inputInterger();
		switch (choice)
		{
		case 1:
			System.out.println("Enter the amount you want to deposit");
			int money =Utility.inputInterger();
			bankBalance=bankBalance+money;
			System.out.println("BankBalance is"+bankBalance);
			break;
				
		case 2:
			System.out.println("Enter the amount you want to winthdraw");
			int withdraw=Utility.inputInterger();
			if(withdraw>bankBalance)
			{
				System.out.println("Insufficient balance");
			}
			else
			{
				bankBalance=bankBalance-withdraw;
				System.out.println("Balance is"+bankBalance);
			}
		
			break;
			
		case 3:
			System.out.println("current balance is"+bankBalance);
			break;
		
		case 4:
			int NumOFPeople=ob.NumofPeople();
			System.out.println("Number of People in queue"+NumOFPeople);
			break;
			
		case 5:
			ob.Dequeue();
			NumOFPeople=ob.NumofPeople();
			System.out.println("number of person in queue"+NumOFPeople);
			break;
			
		case 6:
			ob.Enqueue();
			NumOFPeople=ob.NumofPeople();
			System.out.println("number of person in queue"+NumOFPeople);
			
			break;
			
			default:
				System.out.println("you choice is invalid");
				System.exit(0);
		}	
	System.out.println("If you want to do another transaction please enter true or false");
		flag=Utility.inputBoolean();
	}while(flag);
     ob.Dequeue();
	}
}

//.............................Pallidrome Checker.............................//
public static void  PallidromeChecker(Dequeue <Character> que, String word) {
	int len=word.length();
	//String[] a=new String[len];
	for(int i=0;i<word.length();i++)
	{
		char ch=word.charAt(i);
		que.addRear(ch);
	}
	String str1="";
	for(int i=0;i<word.length();i++)
	{
		str1=str1+que.removeRear();
	}
	if(word.equals(str1))
	{
		System.out.println("new string "+str1);
		System.out.println("Pallidrome");
	}
	else
	{
		System.out.println("New string"+str1);
		System.out.println("not pallidrome");
	}
	
}


//............................Calender........................//

public static int day(int month, int day, int year) {
    int y = year - (14 - month) / 12;
    int x = y + y/4 - y/100 + y/400;
    int m = month + 12 * ((14 - month) / 12) - 2;
    int d = (day + x + (31*m)/12) % 7;
    return d;
}
public static boolean isLeapYear(int year) {
    if  ((year % 4 == 0) && (year % 100 != 0))
    	{
    	return true;
    	}
    if  (year % 400 == 0)
    	{
    	return true;
    	}
    return false;
}

public static void Calender(int month, int year) {
	
	  

	String[] months={"January","February","March","April","May","June","July",
			         "August","September","October","November","December"};
	
	int [] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	if (month == 2 && isLeapYear(year)) days[month] = 29;


    // print calendar header
    System.out.println("   " + months[month] + " " + year);
    System.out.println(" S  M Tu  W Th  F  S");

    // starting day
    int d = day(month, 1, year);

    // print the calendar
    for (int i = 0; i < d; i++)
        System.out.println("   ");
    for (int i = 1; i <= days[month]; i++) {
        System.out.printf("%2d ", i);
        if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
    }

}
//.........................Prime nos .2D Array.....................................//
public static int[][] twoDimensionalArray() {
	  int[][] prime= new int [10][25];
	  int array[]=calculatePrime();
	  int first=0,second=0,third=0,fourth=0,fifth=0;
	  int  sixth=0,seventh=0,eight=0,nineth=0,ten=0;
	  
	  for(int i=0;i<168;i++)
	  {
		  if((array[i]>0&&(array[i]<=100)))
		  {
			  prime[0][first++]=array[i];
		  }else if((array[i]>100 &&(array[i]<=200)))
		  {
			  prime[1][second++]=array[i];
		  }
		  else if((array[i]>200&&(array[i]<=300)))
		  {
			  prime[2][third++]=array[i];
		  }
		  else if((array[i]>300&&(array[i]<=400)))
		  {
			  prime[3][fourth++]=array[i];
		  }
		  else if((array[i]>400&&(array[i]<=500)))
		  {
			  prime[4][fifth++]=array[i];
		  }
		  else if((array[i]>500&&(array[i]<=600)))
		  {
			  prime[5][sixth++]=array[i];
		  }
		  else if((array[i]>600&&(array[i]<=700)))
		  {
			  prime[6][seventh++]=array[i];
		  }
		  else if((array[i]>700&&(array[i]<=800)))
		  {
			  prime[7][eight++]=array[i];
		  }
		  else if((array[i]>800&&(array[i]<=900)))
		  {
			  prime[8][nineth++]=array[i];
		  }
		  else
		  {
			  prime[9][ten++]=array[i];
		  }
	  }
	  
	return prime;
}

private static int[]  calculatePrime() {
	// TODO Auto-generated method stub

	
	int size=0;
    
	int array[]=new int[168];
	for(int i=2;i<=1000;i++)
	{
		int flag=0;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=1;
			break;
			
		}
		
	}
	if(flag==0)
	{
		array[size++]=i;
	}
}return array;

}
//..............2D array  prime number..Anagram in range..///
public static String[] PrimeNumber() {
	// TODO Auto-generated method stub
     String array[]=new String[168];
	int size=0;
    
	
	for(int i=2;i<=1000;i++)
	{
		int flag=0;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=1;
			break;
			
		}
		
	}
	if(flag==0)
	{
		array[size++]=String.valueOf(i);
	}
}return array;
	
}
//..........................Programs for 2D Anagram...........................................//
public static boolean isAnagram(String string, String string2) {
	// TODO Auto-generated method stub
	if(string.length()!=string2.length())
	{
	return false;
	
	}
	else
	{
		char[] a=string.toCharArray();
		Utility.sortAnagram(a);
		
		char []b=string2.toCharArray();
		Utility.sortAnagram(b);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}	
	
}

private static void sortAnagram(char[] a) {
	// TODO Auto-generated method stub
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i] >a[j])
			{
				char temp=a[i];
 			   a[i]=a[j];
 			   a[j]= temp;
			}
		}
	}
}

public static int[][] TwodArr(int [] array) {
	// TODO Auto-generated method stub
	int[][] prime= new int [10][36];
	 // int array[]=calculatePrime();
	  int first=0,second=0,third=0,fourth=0,fifth=0;
	  int  sixth=0,seventh=0,eight=0,nineth=0,ten=0;
	  
	  for(int i=0;i<158;i++)
	  {
		  if((array[i]>0&&(array[i]<=100)))
		  {
			  prime[0][first++]=array[i];
		  }else if((array[i]>100 &&(array[i]<=200)))
		  {
			  prime[1][second++]=array[i];
		  }
		  else if((array[i]>200&&(array[i]<=300)))
		  {
			  prime[2][third++]=array[i];
		  }
		  else if((array[i]>300&&(array[i]<=400)))
		  {
			  prime[3][fourth++]=array[i];
		  }
		  else if((array[i]>400&&(array[i]<=500)))
		  {
			  prime[4][fifth++]=array[i];
		  }
		  else if((array[i]>500&&(array[i]<=600)))
		  {
			  prime[5][sixth++]=array[i];
		  }
		  else if((array[i]>600&&(array[i]<=700)))
		  {
			  prime[6][seventh++]=array[i];
		  }
		  else if((array[i]>700&&(array[i]<=800)))
		  {
			  prime[7][eight++]=array[i];
		  }
		  else if((array[i]>800&&(array[i]<=900)))
		  {
			  prime[8][nineth++]=array[i];
		  }
		  else
		  {
			  prime[9][ten++]=array[i];
		  }
	  } 
	 return prime;
}

public static void TwoDArray(int[] anagram) {
	// TODO Auto-generated method stub
	int[][] result=TwodArr(anagram);
	System.out.println("Prime numbers which are anagram");
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<25;j++)
		{
			if(result[i][j]==0)
			{
				continue;
			}
			else
			{
				System.out.println("|"+result[i][j]+"|");
			}
		}
		System.out.println("");
	}
}


//..................................................Binary Search tree...........................//
public static void FindBinarySearchTree(int[] array) {
	
	
	
	for(int i=0;i<array.length;i++)
	{
		long a= fact((2)*(array[i]));
		long b =fact((array[i]+1));
		long c=fact(array[i]);
		long count=0;
		try{
		count= a/(b*c);
		}
		catch (ArithmeticException e)
		{
			count=0;
		}
		
		System.out.println(count);
	}
	}
private static long fact(int i) {
	long fact = 1;
	while (i > 1) {
		fact = fact * i;
		i--;
	}
	return fact;
}


//..............................................Object oriented programs................................//
public static String replaceFullName(String expression) {
   
	
	System.out.println("Enter new  name");
	String name=Utility.inputString();
	System.out.println("Enter full name");
	
	Scanner sc= new Scanner(System.in);
    String fullname=sc.nextLine();
    
    String replaceName=expression.replaceAll(" <<name>> ",name);
    String replaceFullName=replaceName.replaceAll(" <<fullname>> ", fullname);
    
    Utility.replacePattern(expression,replaceFullName);
	return replaceFullName;
}

public static String mobileNumber(String expression1) {
	
	System.out.println("Enter the mobile number");
	String number=Utility.inputString();
	String replaceNumber=expression1.replaceAll("xxxxxxxxxx", number);
	
	Utility.replacePattern(expression1,replaceNumber);
	return replaceNumber;
	
}

public static String Date(String expression2) {
	
	Calendar cal = Calendar.getInstance();
	System.out.println("new  date is ");
	String date=Utility.inputString();
	String replaceDate=expression2.replaceAll("10/05/2016",date);
	
	Utility.replacePattern(expression2,replaceDate);
	return replaceDate;
}


private static String replacePattern(String str, String replace) {
	
	Pattern pt=Pattern.compile("//s+");
	Matcher mt= pt.matcher(str);
	return mt.replaceAll(replace);
	
}
}






	
