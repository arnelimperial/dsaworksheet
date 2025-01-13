// Bubble sort in LinkedList

package dsa;

import java.util.LinkedList;

public class LinkedListBubbleSort {

    // Method to perform Bubble Sort on a LinkedList
    public static void bubbleSort(LinkedList<Integer> list) {
        int n = list.size();
        boolean swapped;
        // Loop through the list
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                // Compare adjacent elements
                if (list.get(i) > list.get(i + 1)) {
                    // Swap if they are in the wrong order
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
            n--; // Reduce the size for optimization
        } while (swapped);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        System.out.println("Original LinkedList: " + list);
        bubbleSort(list);
        System.out.println("Sorted LinkedList: " + list);
    }
}
