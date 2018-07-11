package com.bridgeit.datastructure;

class Node1<T> {

	public Node1 next;
	public T data;
	
	Node1(T data) {
		this.data = data;
		next = null;
	}
}

public class linkedListStack<T>  {

	public Node1 top;
	
	public linkedListStack() {
		top=null;
	}
	
	public boolean isEmpty() {
		return (top==null);
	}
	public void push(T data) {
		Node1 newnode = new Node1(data);
		if(top == null)
			top = newnode;
		else {
			newnode.next = top;
			top = newnode;
		}
	}
	
	public T pop() {
		T data = (T) top.data;
		top = top.next;
		return data;
	}
	
	public void display() {
		Node1 temp = top;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	
}

