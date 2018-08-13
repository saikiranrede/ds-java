package ds.doublylinkedlist;

public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode; // if empty, last will refer to the new node
		}else {
			first.previous = newNode;
		}
		
		newNode.next = first; // new node's next field will point to the new first
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode; // assigning old last to new node
			newNode.previous = last; // the old last will be the new node's previous node
		}
		
		last = newNode; // the linkedlist's last node should point to the new node
	}
	
	//assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		
		if(first.next == null) { // there is only one item in the list
			last = null;
		}else { // many items
			first.next.previous = null; // the list's first node points to null
		}
		
		first  = first.next; // assigning the reference of the old first node to the first field the linkedlist object
		return temp; // return the deleted old first
	}
	
	//assume non-empty list
	public Node deleteLast() {
		Node temp = last;
		
		if(first.next == null) { // there is only one item in the list
			first = null;
		}else {
			last.previous.next = null; // last node's previous node's next points to null
		}
		
		last = last.previous;
		return temp;
	}
	
	//assume non-empty list
	public boolean insertAfter(int key, int data) {
		Node current = first; // iterate from beginning
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		if(current == last) {
			current.next = null;
			last = newNode;
		}else {
			newNode.next = current.next; // new node's next field should point to the node ahead of current one
			current.next.previous = newNode; // node ahead of current, it's previous field should point to new node 
		}
		
		newNode.previous = current;
		current.next = newNode;
		return true;
	}
	
	//assume non-empty list
	public Node deleteKey(int key) {
		Node current = first;
		
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		
		if(current == first) {
			first = current.next; // make the field first point to node following current since the current will be deleted
		}else {
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous; // make the field last point to the node before current, since it's gonna be deleted 
		}else {
			current.next.previous = current.previous;
		}
		
		return current;
	}
	
	public void displayForward() {
		System.out.println("List ( first --> last )");
		Node current = first; // start from beginning
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("List ( last --> first )");
		Node current = last; // start from ending
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
}
