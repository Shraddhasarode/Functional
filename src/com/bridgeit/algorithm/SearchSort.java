package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class SearchSort {

	/**
	 * @param args
	 */
		public static int menu()
		{
			System.out.println("Menu");
			System.out.println("0.Exit");
			System.out.println("1.BinarySearch method for integer");
			System.out.println("2.BinarySearch method for string");
			System.out.println("3.Insertion sort for Integer");
			System.out.println("4.Insertion sort for string");
			System.out.println("5.Bubblesort method for Integer");
			System.out.println("6.Bubble sort method for string");
			return Utility.inputInterger();
			
		}
		public static void main(String[] args) {
	
		   int choice;
		   long startTime ,stopTime,result;
		   long [] elapsedTime =new  long[6];
		   while((choice=menu())!=0 )
		   {
			   System.out.println("Enter the size");
			   int size=Utility.inputInterger();
			   
			   switch(choice)
			   {
			   case 1:
				   startTime = Utility.start();
					int[] array = Utility.inputIntegerArray(size);
					System.out.println("Enter element to search : ");
					int elem = Utility.inputInterger();
					int pos = Utility.binarySearchInteger(array,elem);
					System.out.println(elem+" is found at "+(pos+1)+" position");
					stopTime = Utility.stop();
					result = Utility.elapsedTime(startTime,stopTime);
					elapsedTime[0] = (result/1000);
				break;
				
			case 2:			
					startTime = Utility.start();
					String[] str = Utility.inputStringArray(size);
					System.out.println("Enter string to search : ");
					String key = Utility.inputString();
					int position = Utility.binarySearchString(str,key);
					System.out.println(key+" is found at "+(position+1)+" position");
					stopTime = Utility.stop();
					result = Utility.elapsedTime(startTime,stopTime);
					elapsedTime[1] = (result/1000);
				break;
				
			case 3:
					startTime = Utility.start();
					int[] array1 = Utility.inputIntegerArray(size);
					array1 = Utility.InsertionSortInteger(array1,size);
					System.out.println("Sorted Insertion Sort Array : ");
					Utility.printIntegerArray(array1, size);
					stopTime = Utility.stop();
					result = Utility.elapsedTime(startTime,stopTime);
					elapsedTime[2] = (result/1000);
				break;
				
			case 4:
					startTime = Utility.start();
					String[] str1 = Utility.inputStringArray(size);
					str = Utility.insertionSortString(str1,size);
					System.out.println("Sorted Insertion Sort Array : ");
					Utility.printStringArray(str1, size);
					stopTime = Utility.stop();
					result = Utility.elapsedTime(startTime,stopTime);
					elapsedTime[3] = (result/1000);
				break;
				
			case 5:			
					startTime = Utility.start();
					int[] array2 = Utility.inputIntegerArray(size);
					array2 = Utility.bubbleSortInteger(array2,size);
					System.out.println("Sorted Bubble Sort Array : ");
					Utility.printIntegerArray(array2, size);
					stopTime = Utility.stop();
					result = Utility.elapsedTime(startTime,stopTime);
					elapsedTime[4] = (result/1000);
				break;
				
			case 6:
					startTime = Utility.start();
					String[] str3 = Utility.inputStringArray(size);
					System.out.println("Sorted Bubble Sort Array : ");
					str3 = Utility.bubbleSortString(str3,size);
					System.out.println("Sorted Bubble Sort Array : ");
					Utility.printStringArray(str3, size);
					stopTime = Utility.stop();
					result = Utility.elapsedTime(startTime,stopTime);
					elapsedTime[5] = (result/1000);
				break;
			}
		}
		
		System.out.println("Elapsed Time : ");
		for(int index=0;index<6;index++){
			System.out.println(elapsedTime[index]);
		}
		
		for(int i =0;i<6;i++){
			for(int j=0;j<6-1;j++){
				if(elapsedTime[j] < elapsedTime[j+1]){
					long temp = elapsedTime[j];
					elapsedTime[j] = elapsedTime[j+1];
					elapsedTime[j+1] = temp;
				}
			}
		}
		System.out.println("Performance in descending order");
		for(int i =0;i<6;i++){
			System.out.println(elapsedTime[i]);
		}
		   
		   
		}

	}

	


