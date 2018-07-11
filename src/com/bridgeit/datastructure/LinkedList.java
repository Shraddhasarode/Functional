package com.bridgeit.datastructure;

public class LinkedList {
     
	
	   private Node front,rear;
	   private int size;
	   
	 private class Node
     {
   	  int data;
   	  Node next;  
     }
     
     public void LinkedQueue()
     {
    	 front=null;
    	 rear=null;
    	 size=0;
    	 
     }
   public boolean isEmpty()
   {
	   return(size==0);
   }
	
   public void insert(int data)
   {
	   Node oldRear = rear;
	    rear = new Node();
	    rear.data = data;
	    rear.next = null;
	    if (isEmpty()) 
	    {
	      front = rear;
	    }
	    else 
	    {
	      oldRear.next = rear;
	    }
	    size++;
	  }
   
   public int  delete()
   {
	   int data = front.data;
	    front = front.next;
	    if (isEmpty()) 
	    {
	      rear = null;
	    }
	    size--;
	    return data;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
