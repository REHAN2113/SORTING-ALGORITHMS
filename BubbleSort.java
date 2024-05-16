class BubbleSort {

    public static void main(String[] args) {
        int array[] = { 4, 3, 6, 8, 1, 0, 5, 10, 2 };

        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int i = 0; i < array.length - 1 - turn; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}