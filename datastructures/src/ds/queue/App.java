package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue theQue = new Queue(5);
		theQue.insert(10);
		theQue.insert(20);
		theQue.insert(30);
		theQue.insert(40);
		theQue.insert(50);
		theQue.insert(60);
		theQue.insert(70);
		
		theQue.view();

	}

}
