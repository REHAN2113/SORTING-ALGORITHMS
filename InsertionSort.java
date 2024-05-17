
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        // Taking input for the first 5 elements
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        // Performing insertion sort on the first 5 elements
        for (int turn = 1; turn < 5; turn++) {
            int cur = array[turn];
            int prev = turn - 1;

            while (prev >= 0 && array[prev] > cur) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = cur;
        }

        // Printing the array
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
