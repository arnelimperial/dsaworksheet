// Insertion sort in Queue

package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInsertionSort {

    // Method to perform Insertion Sort on a Queue
    public static Queue<Integer> insertionSort(Queue<Integer> queue) {
        Queue<Integer> sortedQueue = new LinkedList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll(); // Remove the front element
            // Insert into sortedQueue in sorted order
            while (!sortedQueue.isEmpty() && sortedQueue.peek() < current) {
                queue.offer(sortedQueue.poll()); // Move back to original queue
            }
            sortedQueue.offer(current); // Insert current element
            while (!queue.isEmpty()) {
                sortedQueue.offer(queue.poll()); // Move remaining elements
            }
        }
        return sortedQueue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(3);
        queue.offer(8);
        queue.offer(1);
        System.out.println("Original Queue: " + queue);
        Queue<Integer> sortedQueue = insertionSort(queue);
        System.out.println("Sorted Queue: " + sortedQueue);
    }
}
