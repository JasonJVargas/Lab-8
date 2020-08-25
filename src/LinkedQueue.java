import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


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
		int half = count/2;
		LinkedQueue queueNew = new LinkedQueue();
		LinkedQueue queueTemp = new LinkedQueue();
		
        for (int x = 0; x < count; x++) {
			queueNew.enqueue(dequeue());
			
			if (x==half) 
				queueTemp.enqueue(dequeue());
				
	}
        System.out.println(queueNew);
	}
	
	void removeMid() {
        Queue<Integer> queue = new LinkedList<Integer>();
        int half = count/2;
        for (int x = 0; x < count; x++) {
         queue.add(dequeue());
         if(x== half) {
        	 dequeue();
         }
        }
        System.out.println(queue);
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
}
