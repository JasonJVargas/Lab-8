import java.util.ArrayList;

// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}

	public void removeBottomHalf() {
		// Adding 2 instances in order to store new stacks
		LinkedStack tempStack = new LinkedStack();
		LinkedStack lastStack = new LinkedStack();
		
		int half = count / 2;
		// First loop to remove top half and store it into a new stack
		for (int i = 0; i < half; i++) {
			tempStack.push(pop());
		}
		// Second loop to re order the top half elements correctly. 
		for (int i = 0; i < half; i++) {
			lastStack.push(tempStack.pop());
		}
		System.out.println(lastStack);
	}
	
	void removeBHalf() {
		ArrayList<Integer> holder = new ArrayList<Integer>();
		int countMax = count;
		while(count > 0) {
			holder.add(pop());
		}
		for(int i = countMax / 2 - 1; i >= 0; i--) {
			push(holder.get(i));
		}
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

}
