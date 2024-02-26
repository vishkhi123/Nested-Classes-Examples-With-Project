package queueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<String> queue = new LinkedList<>();
		 //Allow Duplicate
		 //LinkedList Does Not Follow sorting order 
	        // Enqueue elements
		    queue.offer("D");
		    queue.offer("C");
		    queue.offer("A");
	        queue.offer("A");
	        queue.offer("B");
	        
	        queue.offer(null); 
	        
	        System.out.println(queue);

	        // Dequeue element
	        String firstElement = queue.poll();
	        System.out.println("Dequeued element: " + firstElement);

	        // Peek at the front element
	        String frontElement = queue.peek();
	        System.out.println("Front element: " + frontElement);

	}

}
