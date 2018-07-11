package com.bridgeit.datastructure;

public class Dequeue<T> {
        T[] arr;
        public int size;
        public int front,rear;    
        public int count;

	public Dequeue(int size)
	{
		this.size=size;
		arr=(T[]) new Object[size];
		front=-1;
		rear=-1;	
	}
	public int getsize()
	{
		return count;
	}
	public boolean isFull()
	{
		return(rear==size);
	}
	public boolean isEmpty()
	{
		return(front==rear);
	}
	public void addFront(T item)
	{
		if(front>=0)
		{
		   rear++;
		   arr[rear]=item;
		}
		else
		{
			System.out.println("overflow");
		}
	}
	public void addRear(T item)
	{
		if(rear==size)
		{
			System.out.println("overflow");
		}else 
		{
			rear++;
			arr[rear]=item;
		}
	}
	public T removeFront()
	{
		if(front==rear)
		{
			System.out.println("overflow");
		}else
		{
			T ele= arr[front];
			front=front+1;
		}return null;
	}
	public T removeRear()
	{
		if(front!=rear)
		{
			T ele=arr[rear];
			rear--;
			return ele;
		}else
		{
			return null;
		}
	}
}


