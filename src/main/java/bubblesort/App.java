package src.main.java.bubblesort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Initialize arrays
        int[] a = {70,61,72,83,38};
        int[] b = {7,2,76,4,99};
        int[] c = {28,9,13,78,19};
        int[] d = {68,84,41,62,18};
        int[] e = {37,57,40,13,50};

        // Process arrays
        Bubblesort.sort(a);
        Bubblesort.sort(b);
        Bubblesort.sort(c);
        Bubblesort.sort(d);
        Bubblesort.sort(e);

        // Print arrays
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
    }
}
