package queueCollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		 Queue<Integer> queue = new PriorityQueue<>();
		 //follows sorting order(not strictly)
		 //Allow Duplicate elements
		 //The PriorityQueue doesn't follow a strict sorted order
		 // When elements are removed from a PriorityQueue, 
		 //they are removed in sorted order (according to the specified ordering),
		 //not the order they were inserted.
		 
		 // Enqueue elements
	        queue.offer(3);
	        queue.offer(1);
	        queue.offer(2);
	        queue.offer(3);
	      //  queue.offer(null);//Do not allow Null Values
	        
	        System.out.println(queue);

	        // Dequeue element
	        int firstElement = queue.poll();
	        System.out.println("Dequeued element: " + firstElement);

	        // Peek at the front element
	        int frontElement = queue.peek();
	        System.out.println("Front element: " + frontElement);
	}

}
