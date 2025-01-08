package dsa;

/**
 *
 * @author arnel
 */

/*
 * Write a Java program that creates an array of 5 integers and prompts the user to enter 5 integer values to fill the array. 
 * The program should then find the sum of all the elements in the array and print the result.
 */
import java.util.Scanner;

public class ArraysExercise3 {

    public static void main(String[] args) {
        // Step 1: Create an array of 5 integers

        int[] numbers = new int[5];

        // Step 2: Prompt the user to enter 5 integer values
        try (Scanner scanner = new Scanner(System.in)) {
            // Step 2: Prompt the user to enter 5 integer values
            System.out.println("Enter 5 integer values:");
            for (int i = 0; i < 5; i++) {

                numbers[i] = scanner.nextInt();

            }   // Step 3: Calculate the sum of the elements in the array
            int sum = 0;
            for (int number : numbers) {

                sum += number;

            }   // Step 4: Print the result
            System.out.println("The sum of the entered values is: " + sum);
            // Close the scanner
        }
    }
}
