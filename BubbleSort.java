public class BubbleSort {
    private int[] array;
    private boolean areThereSwapsLeft;

    BubbleSort(int[] array) {
        this.array = array;
        sort();
    }

    private void SwapValues() {
        int length = array.length;
        for (byte i = 0 ; i < length - 1; ++i) {
            for(byte j = 0; j < length - i - 1; ++j) {
                if(array[j+1]<array[j]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
    }

    private void sort() {
        do {
            SwapValues();
        } while (areThereSwapsLeft == true);
    }

    public String toString() {
        int length = array.length;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (byte i = 0; i < length; i++) {
            sb.append(array[i]);
            
            if (i != (length - 1)) {
                sb.append(", ");
            } 
            else { sb.append("]"); }
        }
        return sb.toString();
    }
}