
// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void removeMiddle() {
		int var = count;
		int half = (count / 2);
		int[] queue = new int[var - 1];
		int n = 0;
		// Create a case to remove specific index for an even list
		if (var % 2 == 0) {
			for (int i = 0; i < var; i++) {
				if (i != half - 1) {
					queue[n] = dequeue();
					n++;
				} else {
					dequeue();
				}
			}
		} else { // Else statement for an odd list
			for (int i = 0; i < var; i++) {
				if (i != half) {
					queue[n] = dequeue();
					n++;
				} else {
					dequeue();
				}
			}
		}
		for (int index = 0; index < queue.length; index++) {
			enqueue(queue[index]);
		}
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

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
