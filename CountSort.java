import java.util.*;

class CountSort {
    public static void main(String[] args) {
        int array[] = { 5, 2, 1, 6, 9, 6, 2, 1, 1 };

        // Finding Largest Number To Initialized Count Array Size
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++)
            largest = Math.max(largest, array[i]);

        // initialized Count Array With Size Of Largest Number Present in The Array
        int count[] = new int[largest + 1];

        // Counting Frequency Of Each Number Present In The Array
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int j = 0;

        // Sorting The Array
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
        // Printing Sorted Array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}