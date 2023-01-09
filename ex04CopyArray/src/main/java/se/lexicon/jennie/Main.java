package se.lexicon.jennie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        A program that will copy the elements of one array into another array
        Example output: Elements from first array: 1 15 20
                        Elements from second array: 1 15 20
         */

        int[] array1 = {1, 15, 20};
        int[] array2 = Arrays.copyOf(array1, array1.length);

        System.out.print("Elements from first array: ");

        for(int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.print("\nElements from second array: ");

        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}