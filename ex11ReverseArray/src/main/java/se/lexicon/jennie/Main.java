package se.lexicon.jennie;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Write a program that asks the user for an integer and repeat
        that question until user writes -1. Store these values in an array
        and print the array. After that, reverse the array elements so that
        the first element becomes the last element, the second element becomes
        the second to last element, etc. Do not just reverse the order in witch
        they are printed, but change the way they are stored in the array.
         */

        int[] array = new int[0];

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a few numbers and then write -1 to end the program.");

        int num = scan.nextInt();

        do {
            System.out.println("Number: ");
            array = add(array, num);
            num = scan.nextInt();
        } while (num != -1);

        int[] reversedArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length-1-i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] add(int[] array, int numberToAdd){

        int length = (array.length) +1;

        int[] copy = Arrays.copyOf(array, length); //make a copy of original array + expand with length by 1.

        copy[length-1] = numberToAdd; //add numberToAdd in the end of the array.

        return copy; //return new array with element.
    }
}