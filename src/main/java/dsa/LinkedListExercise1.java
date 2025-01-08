package dsa;

/**
 *
 * @author arnel
 */

/*
* Exercise 1: Create a list with the following elements - apple, banana, and cherry. Write code that accomplishes the following:
1. Print the list using println.
2. Add orange to the beginning of the list.
3. Print the list again.
4. Remove an element from the list.
5. Print the list again.
6. Get an element at a specific index.
7. Print the size of the list.
 */
import java.util.ArrayList;
import java.util.List;

public class LinkedListExercise1 {

    public static void main(String[] args) {
        // Create a list with the following elements - apple, banana, and cherry
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // Print the list using println
        System.out.println("Initial list: " + fruits);

        // Add orange to the beginning of the list
        fruits.add(0, "orange");

        // Print the list again
        System.out.println("List after adding orange: " + fruits);

        // Remove an element from the list
        fruits.remove(3);

        // Print the list again
        System.out.println("List after removing an element: " + fruits);

        // Get an element at a specific index
        String fruit = fruits.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Print the size of the list
        System.out.println("Size of the list: " + fruits.size());
    }

}
