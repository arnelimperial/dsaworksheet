/**
 * Implementing Add & delete algorithm in Linkedlist
 * Adding an element involves creating a new node and adjusting pointers, 
 * while deleting an element requires adjusting pointers to bypass the node to be deleted.
 */

package dsa;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head; // Head of the list

    // Method to add a new node at a specific index
    public void add(int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head; // Point new node to the current head
            head = newNode; // Update head to new node
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next; // Traverse to the desired index
        }
        if (current == null) {
            System.out.println("Invalid index");
            return;
        }
        newNode.next = current.next; // Link new node to the next node
        current.next = newNode; // Link current node to new node
    }

    // Method to delete a node at a specific index
    public void delete(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            head = head.next; // Update head to the next node
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next; // Traverse to the node before the one to delete
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid index");
            return;
        }
        current.next = current.next.next; // Bypass the node to delete
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // Move to the next node
        }
        System.out.println();
    }

    // Main method to test the LinkedListExample class
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(0, 5); // Add 5 at index 0
        linkedList.add(1, 10); // Add 10 at index 1
        linkedList.add(1, 7); // Add 7 at index 1
        linkedList.display(); // Display the linked list
        linkedList.delete(1); // Delete element at index 1
        linkedList.display(); // Display the linked list
    }
}