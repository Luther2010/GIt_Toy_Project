public class Stack {
	Node top;

	public Stack() {
	}
	
	public Stack(Node t) {
		top = t;
	}
	
	public void push(int v) {
		Node curr = new Node(v);
		if (top == null)
			top = curr;
		else {
			curr.next = top;
			top = curr;
		}
	}

	public int pop() {
		Node result = top;
		top = top.next;
		return result.val;
	}

	public int peek() {
		return top.val;
	}

	public void print() {
		Node trav = top;
		while (trav != null) {
			System.out.print(trav.val + "\t");
			trav = trav.next;
		}
	}
}
