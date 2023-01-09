package se.lexicon.jennie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        A program which will remove the duplicate elements of a given array:
        [20, 20, 40, 20, 30, 40, 50, 60, 50]
        Example output: Array: 20 20 40 20 30 40 50 60 50
                        Array without duplicate values: 20 40 30 50 60
         */

        int[] num = {20, 20, 40, 20, 30, 40, 50, 60, 50};

        System.out.println("Array: ");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        Arrays.sort(num);

        System.out.println("\n\nArray without duplicate values: ");

        System.out.print(num[0] + " ");

        for (int i = 1; i < num.length; i++) {
            if (num[i] > num[i-1]) {
                System.out.print(num[i] + " ");
            }
        }
    }
}