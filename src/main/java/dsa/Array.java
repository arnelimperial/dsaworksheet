/**
 * Implementing Add and Delete in Array
 * In an array, adding an element involves shifting elements to make space for the new element, 
 * while deleting an element requires shifting elements to fill the gap left by the removed element.
 */
package dsa;

public class Array {

    private final int[] arr;
    private int size;

    // Constructor to initialize the array
    public Array(int capacity) {
        arr = new int[capacity];
        size = 0; // Current size of the array
    }

    // Method to add an element at a specific index
    public void add(int index, int value) {
        if (index < 0 || index > size || size == arr.length) {
            System.out.println("Invalid index or array is full");
            return;
        }
        // Shift elements to the right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value; // Insert the new value
        size++; // Increase the size
    }

    // Method to delete an element at a specific index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--; // Decrease the size
    }

    // Method to display the array
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the ArrayExample class
    public static void main(String[] args) {
        Array array = new Array(10);
        array.add(0, 5); // Add 5 at index 0
        array.add(1, 10); // Add 10 at index 1
        array.add(1, 7); // Add 7 at index 1
        array.display(); // Display the array
        array.delete(1); // Delete element at index 1
        array.display(); // Display the array
    }
}
