import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] array = new int[] {10, 3, 4, 8, 2};
        int[] sortedArray = BubbleSort.sortArray(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}