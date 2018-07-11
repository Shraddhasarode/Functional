package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PrimeAnagramUsingQueue<T> {

	
	private class Node{
        T item;
        Node next;

        Node(T t){
            item = t;
            next = null;
        }

		public void display() {

			
			System.out.println(""+data);
		}

      
    }
    private Node first, last;
	private int  data;

    PrimeAnagramUsingQueue (){
        first = null;
        last = null;
    }


    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(T t){
        Node oldLast = last;
        last = new Node(t);
        if (isEmpty()) 
        	first = last;
        else  
        	oldLast.next = last;
    }

    public T dequeue(){
        if (isEmpty())
            return  null;

        if (first == last){
            T t = (T) first.item;
            first = last = null;
            return  t;
        }

        T t = (T) first.item;
        first = first.next;
        return t;
    }

    public void  displaylist (){
      
        Node cur = first;
        while(cur != null){
        	 //cur.display();
        	System.out.println("Anagram numbers are "+cur.item);
            cur = cur.next;
        }
   
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeAnagramUsingQueue<Integer> que=new PrimeAnagramUsingQueue<Integer>();
		
		
		String array[]=Utility.PrimeNumber();
		 String  array2[]=new String[168];
		 int[] anagram = new int [168];
		 int count =0;
		 
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(Utility.isAnagram(array[i], array[j]))
				 {
					 que.enqueue(Integer.valueOf(array[i]));
					 count++;
					 //System.out.println(anagram[i]);
					 que.enqueue(Integer.valueOf(array[j]));
					 count++;		 
				 }
			 }
		 }
		 que.displaylist();
	}

}
