// 4. Queues
// A queue is a First-In-First-Out (FIFO) data structure. 
// The first element added is the first one to be removed. 
// Common operations are enqueue (add to the back) and dequeue (remove from the front).

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Peek the front element
        System.out.println("Front Element: " + queue.peek()); // Output: 10

        // Dequeue elements
        System.out.println("Dequeued: " + queue.poll()); // Output: 10
        System.out.println("Dequeued: " + queue.poll()); // Output: 20

        // Check if the queue is empty
        System.out.println("Is Queue Empty? " + queue.isEmpty()); // Output: false
    }
}
