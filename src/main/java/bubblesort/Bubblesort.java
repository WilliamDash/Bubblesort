package src.main.java.bubblesort;

class Bubblesort {
    public static void sort(int[] array) {
        // Get length
        Integer length = array.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    // Swap values
                    int tempValue = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempValue;
                }
            }
        }
    }
}