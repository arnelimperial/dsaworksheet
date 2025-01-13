/**
 * Create a Java-based program that takes an array of integers as input, 
 * sorts it in ascending order using the bubble sort algorithm, and prints the sorted array to the console.
 * 
 * 
 */

package dsa;

// BubbleSort.java
public class BubbleSort {

    public static void main(String[] args) {
        // Input: An array of integers
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Call the bubble sort method
        bubbleSort(array);

        // Output: Print the sorted array
        System.out.println("Sorted array:");
        printArray(array);
    }

    // Method to perform bubble sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Control structure: Loop through each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Control structure: Loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
