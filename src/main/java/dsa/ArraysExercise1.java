package dsa;

/**
 *
 * @author arnel
 */

/*
 * Exercise 1: Write a Java program that sums the array's values with the following elements: 25, 4, 16, 9, 10.
 */
public class ArraysExercise1 {

    public static void main(String[] args) {
        int array[] = {25, 4, 16, 9, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of array's values is: " + sum);

    }

}
