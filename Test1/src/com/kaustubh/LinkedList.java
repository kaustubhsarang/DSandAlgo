package com.kaustubh;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		li.head.next=second;
		second.next=third;
		li.printList();
		Node four = new Node(4);
		third.next=four;
		li.printList();

	}
	public void printList()
	{
Node current = head;
		
		while(true)
		{
			System.out.println(current.data);
			if(current.next!=null)
				current=current.next;
			else
				break;
			
		}
	}
//	public void insert(int data, LinkedList li)
//	{
//		
//		Node current=head;
//		Node newnode = new Node(data);
//		while(true)
//		{
//			
//			if(current.next!=null)
//				current=current.next;
//			else
//				
//			
//		}
//	}
}
