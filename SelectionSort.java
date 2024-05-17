
public class SelectionSort {

    public static void main(String[] args) {
        int array[] = { 5, 4, 3, 2, 1, 9, 7, 5 };

        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[minPos] > array[j]) {
                    minPos = j;
                }

            }
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
