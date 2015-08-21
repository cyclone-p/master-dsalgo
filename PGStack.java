import java.util.EmptyStackException;

class PGStack {
	
	private int [] stackArray;
	private int top;
	private int start;
	private int size;
	
	public PGStack (int sSize) {
		size = sSize;
		stackArray = new int[size];
		start = 0;
		top = -1;
	}
	
	public void push (int data) {
		if (top == start + size - 1)
			throw new StackOverflowError("Can't add " + data + " to the stack. Data overflow occured.");
		else
			stackArray[++top] = data;
	}
	
	public int pop () {
		if (top == start - 1)
			throw new EmptyStackException();
		else
			return stackArray[top--];
	}
	
	public int peek () {
		return stackArray[top];
	}
	
	public void displayStack () {
		
		System.out.println("Stack : ");
		for (int i = top; i >= 0; i--) {
			System.out.println (i + " : " + stackArray[i]);
		}
	}
	
}