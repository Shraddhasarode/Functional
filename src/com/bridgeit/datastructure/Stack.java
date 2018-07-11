package com.bridgeit.datastructure;

public class Stack <T>
{
	public int size;
	public int top;
	 T arr[];
	 int count=0;
	  
	 public Stack(int size)
	 {
		 this.size=size;
		 arr=(T[]) new Object[size];
		 top=-1;
	 }
	 public boolean isEmpty()
	 {
		return (top==-1);
		 
	 }
	 public boolean push(T data)
	 {
		 arr[++top]=data;
			count++;
			return false;
		 
	 }
	 public T pop()
	 {
	     count--;
		return  arr[top--];
		 
	 }
	 public T peek()
	 {
		return arr[top];
		 
	 }
	 public int size()
	 {
		 return count ;
	 }

		

}

