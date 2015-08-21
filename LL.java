class LL {
	
	LLNode head;
	
	LL () {
		
	}
	
	public void addNode (int d) {
		LLNode n = new LLNode(d);
		
		if (head == null)
			head = n;
		else {
			n.next = head;
			head = n;
		}
	}
	
	public LL revLL () {
		LLNode current = head;
		LL retLL = new LL ();
		while (current.next != null) {
			retLL.addNode(current.data);
			current = current.next;
		}
		retLL.addNode(current.data);
		return retLL;
	}
	
	public void displayLL () {
		
		if (head != null) {
			System.out.println("Node 0 : " + head.data);
		}
	
		LLNode current = head;
		int counter = 1;
		
		while (current.next != null) {
			current = current.next;
			System.out.println("Node " + counter + " : " + current.data);
			counter++;
		}
	}
	
	public LLNode delNode (int d) {

		LLNode current = head;
		LLNode previous = null;
		
		if ((current.data == d) && (current.next == null))
			return current;

		if ((current.data == d) && (current.next != null)) {
			head = current.next;
			current.next = null;
			return current;
		}

		while ((current.data != d) || (current.next != null)) {
			previous = current;
			current = current.next;
		}
		if (current.data == d) {
			previous.next = current.next;
			current.next = null;
			return current;
		}
		else
			return null;
		
	}

}