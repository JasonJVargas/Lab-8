
public class Driver {

	public static void main(String[] args) {
		// Create instances
		LinkedStack link = new LinkedStack();
		ArrayStack array = new ArrayStack();
		LinkedQueue queue = new LinkedQueue();
		ArrayQ arrayQ = new ArrayQ();

		// Push the int's onto LinkedStack.
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);

		// Print to show the int's were pushed

		System.out.println(link);

		System.out.println("We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();
		System.out.println(link + "\n" + "We will now remove: " + link.peek());
		link.pop();

		System.out.println("\nNothing left! " + link);

		// Push again for Exercise 2
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(4);
		link.push(9);
		link.push(2);
		// Removing the bottom half of the stack
		System.out.println();
		System.out.print("Here is the original LinkedStack: ");
		System.out.println(link);

		System.out.print("Top half of the stack: ");
		link.removeBottomHalf();
		System.out.println("Time complexity of method removeHalf is: O(N)");

		// Push the int's onto ArrayStack.
		array.push(1);
		array.push(7);
		array.push(3);
		array.push(4);
		array.push(9);
		array.push(2);

		// Show items are being removed in the stack
		System.out.println("\nArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		array.pop();
		System.out.println("ArrayStack now contains " + array.size() + " int's in the stack.");
		
		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(4);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);
	
		queue.enqueue(1);
		queue.enqueue(7);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(9);
		queue.enqueue(2);
			
		System.out.println("\nWe will now remove: " + queue.dequeue());
		System.out.println("We will now remove: " + queue.dequeue());
		System.out.println("We will now remove: " + queue.dequeue());
		System.out.println("We will now remove: " + queue.dequeue());
		System.out.println("We will now remove: " + queue.dequeue());
		System.out.println("We will now remove: " + queue.dequeue());

		System.out.println("\nNumber of elements left:  " + queue.size());
		queue.dequeue();
		
		System.out.println("\nWe will now remove: " + arrayQ.dequeue());
		System.out.println("We will now remove: " + arrayQ.dequeue());
		System.out.println("We will now remove: " + arrayQ.dequeue());
		System.out.println("We will now remove: " + arrayQ.dequeue());
		System.out.println("We will now remove: " + arrayQ.dequeue());
		System.out.println("We will now remove: " + arrayQ.dequeue());

		System.out.println("\nNumber of elements left:  " + arrayQ.size());
		
		queue.enqueue(1);
		queue.enqueue(7);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(9);
		queue.enqueue(2);
		
		System.out.println("\nBefore removing the middle element: " + queue);
		queue.removeMiddle();
		System.out.println("After removing the middle element: " + queue);
		
		


	}

}