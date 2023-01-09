package se.lexicon.jennie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        A program with a method that will add elements to an array
         */

        int[] intArray = new int[3]; // Array with 3 elements

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        intArray = addOneNumberToArray(intArray, 50); //[1,2,3,50]

        System.out.println(Arrays.toString(intArray));
    }

    //Method
    public static int[] addOneNumberToArray(int[] original, int numberToAdd){

        int length = (original.length) +1;

        int[] copy = Arrays.copyOf(original, length); //make a copy of original array + expand with length by 1.

        copy[length-1] = numberToAdd; //add numberToAdd in the end of the array.

        return copy; //return new array with element.
    }

    /*
    How to make ArrayList (import java.util.ArrayList):

    ArrayList<Integer> integerArrayList = new ArrayList<>(); // Collection = List of ints
    integerArrayList.add(1);
    integerArrayList.add(2);
    integerArrayList.add(3);
     */
}