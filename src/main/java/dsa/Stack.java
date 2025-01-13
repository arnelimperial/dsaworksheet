// Implementing methods to add (push) and delete (pop) elements on Stack
package dsa;

// Stack implementation in Java
class Stack {

    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to hold stack elements
    private int top; // Index of the top element

    // Constructor to initialize the stack
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (top < maxSize - 1) { // Check if stack is not full
            stackArray[++top] = value; // Increment top and add value
        } else {
            System.out.println("Stack is full!");
        }
    }

    // Method to delete an element from the stack
    public int pop() {
        if (top >= 0) { // Check if stack is not empty
            return stackArray[top--]; // Return top value and decrement top
        } else {
            System.out.println("Stack is empty!");
            return -1; // Return -1 if stack is empty
        }
    }

    // Main method to test Stack implementation
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of size 5
        stack.push(10); // Add 10 to stack
        stack.push(20); // Add 20 to stack
        System.out.println("Popped: " + stack.pop()); // Remove top element
    }
}
