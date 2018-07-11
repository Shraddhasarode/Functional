package com.bridgeit.datastructure;

public class Queue <T>{
 public int front,rear,size,person;
 public int arr[];
 Queue(int size,int person)
 {
	 this.size=size;
	 this.rear=person;
	 this.front=0;
	 
	 arr=new int[size];
	 System.out.println("Queue is ready");
 }
 public void Enqueue()
 {
	 if(isFull())
	 {
		 System.out.println("Queue is full");
	 }else
	 {
		 rear=rear+1;
	 }
 }
 public void Dequeue()
 {
	 if(isEmpty())
	 {
		 System.out.println("Queue is empty");
	 }
	 else
	 {
		 front++;
	 }
 }
 public boolean isFull()
 {
	 return(rear==size);
 }
 public boolean isEmpty()
 {
	 return(front==rear);
 }
 public int NumofPeople()
 {
	 return(rear-front);
 }
}
