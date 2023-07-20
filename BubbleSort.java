class BubbleSort {

    private BubbleSort() { }

    static int[] sortArray(int[] array) {
        int[] sortedArray = sort(array);
        return sort(sortedArray);
    }

    private static int[] sort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    swapValues(array, j, j + 1);
                }
            }
        }

        return array;
    }

    private static void swapValues(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}