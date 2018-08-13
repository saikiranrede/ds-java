package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.push(100);
		
		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		
		System.out.println(reverseString("HELLO"));
		
	}
	
	public static String reverseString(String str) {
		int stackSize = str.length();
		RevStack revStack = new RevStack(stackSize);
		for(int j=0; j < stackSize; j++) {
			char ch = str.charAt(j);
			revStack.push(ch);
		}
		
		String result = "";
		while(!revStack.isEmpty()) {
			char value = revStack.pop();
			result = result + value;
		}
		
		return result;
		}

}
