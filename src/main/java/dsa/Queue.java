// For an Array, I implement methods to add and delete elements at specific indices.

package dsa;

// Queue implementation in Java
class Queue {

    private final int maxSize; // Maximum size of the queue
    private final int[] queueArray; // Array to hold queue elements
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int nItems; // Current number of items in the queue

    // Constructor to initialize the queue
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0; // Front index
        this.rear = -1; // Rear index
        this.nItems = 0; // Initially no items
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (nItems < maxSize) { // Check if queue is not full
            rear = (rear + 1) % maxSize; // Circular increment
            queueArray[rear] = value; // Add value to the rear
            nItems++; // Increment item count
        } else {
            System.out.println("Queue is full!");
        }
    }

    // Method to delete an element from the queue
    public int dequeue() {
        if (nItems > 0) { // Check if queue is not empty
            int temp = queueArray[front]; // Get front value
            front = (front + 1) % maxSize; // Circular increment
            nItems--; // Decrement item count
            return temp; // Return front value
        } else {
            System.out.println("Queue is empty!");
            return -1; // Return -1 if queue is empty
        }
    }

    // Main method to test Queue implementation
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue of size 5
        queue.enqueue(10); // Add 10 to queue
        queue.enqueue(20); // Add 20 to queue
        System.out.println("Dequeued: " + queue.dequeue()); // Remove front element
    }
}
