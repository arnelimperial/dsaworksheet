package dsa;

/**
 *
 * @author arnel
 */

/*
* Exercise 2: Write a series of code that:
* Pushes three elements onto the stack - Alice, Bob, Charlie
* Pops the pushed elements
* Prints the popped elements using system.out.println (observe how LIFO is applied)
* Checks if the stack is empty (this should return true)
 */
import java.util.Stack;

public class StackExercise2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        // Pop and print the elements
        System.out.println("Popped elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
