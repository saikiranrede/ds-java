package ds.queue;

public class Queue {

	private int maxSize; // initializes set number of slots
	private long[] queueArray; // slots to maintain data
	private int front; // this would bee the index position for the element in the front
	private int rear; // this would be the index position for the element in the back
	private int nItems; // counter to maintain number of items in the queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0; // index position of first slot of the array
		rear = -1; // there is no item in the array yet to be considered as last item
		nItems = 0; // no elements in the array yet
	}
	
	public void insert(long j) {
		if(rear == maxSize-1) { // creating a circular queue
			rear = -1;          // if needed regular queue return queue full by changing this logic
		}
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	public long remove() { //remove item from the front
		long temp = queueArray[front];
		front++;
		nItems--;
		if(front == maxSize) {
			front = 0; // setting front 0 to re-utilize the array again
		}
		return temp;
	}
	
	public long peekFront() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i=0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}
}
