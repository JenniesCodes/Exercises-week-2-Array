package se.lexicon.jennie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Create an array with random numbers and then copy the numbers to
        another array, sorted by odd numbers first and then even numbers.
         */

        int[] a = new int[] {1, 4, 7, 8, 13};
        int[] b = new int[5];

        int j = 0;

        for(int i = 0; i < a.length; i++) {
            if((a[i] % 2) != 0) {
                b[j] = a[i];
                j++;
            }
        }

        for(int i = 0; i < a.length; i++) {
            if((a[i] % 2) == 0) {
                b[j] = a[i];
                j++;
            }
        }

        System.out.println("First: " + Arrays.toString(a));
        System.out.println("Second: " + Arrays.toString(b));
    }
}