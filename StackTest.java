class StackTest {
	public static void main (String args[]) {
		
		PGStack myStack = new PGStack(Integer.parseInt(args[0]));
		
		myStack.push(7);
		myStack.push(3);
		myStack.push(9);
		myStack.push(2);
		myStack.push(4);
		myStack.push(1);
		myStack.displayStack();
		
		int m = myStack.peek();
		System.out.println("Peeked : " + m);
		myStack.displayStack();
		
		int j = myStack.pop();
		System.out.println("Popped : " + j);
		myStack.displayStack();
		
		int k = myStack.peek();
		System.out.println("Peeked : " + k);
		myStack.displayStack();
	}
}