package ds.singlylinkedlist;

import org.omg.CORBA.FREE_MEM;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public int lengthLL() {
		Node temp = first;
		int length=0;
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		System.out.println(length);
		return length;
		
	}
	
	public void insertKth(int count, int pos, int data) {
		if(count == lengthLL()) {
			Node newNode = new Node();
			newNode.data = data;
			Node current = first;
			Node positon = null;
			int temp = 0;
			while(current.next != null) {
				current = current.next;
				if(temp == pos-1) {
					break;
				}else {
					current = current.next;
					temp++;
				}
			}
			
			if(current.next != null) {
				positon = current.next;
			}
			
			 current.next = newNode;
			 newNode.next = positon;
			
			
		}else {
			System.out.println("The length of the linked list does not match");
		}
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void deleteLast() {
		Node current = first;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}
	
	public void displayList() {
		System.out.println("List ( first --> last )");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
}
