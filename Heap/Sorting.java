package Heap;

import java.util.*;

public class Sorting {

    private static void heapify(ArrayList<Integer> arr, int n, int i) {
        int largest = i;  // root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }

        // Check right child
        if (right < n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        // If root is not largest, swap and heapify again
        if (largest != i) {
            Collections.swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    public static void heapSort(ArrayList<Integer> arr) {
        int n = arr.size();

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            Collections.swap(arr, 0, i);

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(11);
        arr.add(13);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        System.out.println("Unsorted: " + arr);
        heapSort(arr);
        System.out.println("Sorted: " + arr);
    }
}
