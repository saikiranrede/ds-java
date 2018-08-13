package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);/*
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);*/
		myList.insertLast(200);
		myList.insertLast(300);
		myList.insertFirst(400);
		myList.insertKth(4, 3, 250);
		
		myList.displayList();
	}

}
