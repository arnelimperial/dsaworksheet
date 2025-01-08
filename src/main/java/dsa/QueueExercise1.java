package dsa;

/**
 *
 * @author arnel
 */

/*
* Using Java, simulate a line at a store or bank using a queue. The program should allow the customer to join 
* the line and wait for service, and should serve customers in the order they joined the line.
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercise1 {

    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Join the line");
            System.out.println("2. Serve the next customer");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter your name:");
                    String name = scanner.nextLine();
                    line.offer(name);
                }
                case 2 -> {
                    if (!line.isEmpty()) {
                        String servedCustomer = line.poll();
                        System.out.println("Serving " + servedCustomer);
                    } else {
                        System.out.println("No customers in line.");
                    }
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Invalid choice.");
            }
        }
    }
}
