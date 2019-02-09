package com.test.linkedlist;

class Node {
	int data;
	Node next;
	
	public Node() {
		
	}
	
	public Node(int data) {
		this.data = data;
	}
}

public class LinkedList {
	
	static Node head = null;
	
	public static void addFront(int data) {
	
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	public static void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		addFront(30);
		addFront(20);
		addFront(10);
		printList();
	}
}
