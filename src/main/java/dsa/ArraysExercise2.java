package dsa;

/**
 *
 * @author arnel
 */

/*
* Exercise 2: Write a Java program to test if an array contains a specific value. 
* Create an array with five elements.
 */
public class ArraysExercise2 {

    public static void main(String[] args) {
        int[] array = {20, 3, 99, 45, 11}; // array with five elements
        int valueToFind = 1; // define specific value to find 
        boolean found = false; // init found as false

        // check if the value is in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }
}
