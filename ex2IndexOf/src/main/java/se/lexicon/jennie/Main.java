package se.lexicon.jennie;

public class Main {

    /*
    A program with a method called 'indexOf' which will find and return
    the index of an element in the array.
    If the element doesn't exist, return -1 as value.
    Example output: Index position of number 5 is: 2
     */

    private static int indexOf(int[] intArray, int numberToFind) {
        for(int i = 0; i < intArray.length; i++) {
            if(numberToFind == intArray[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numberToFind = 23;

        int[] intArray = {3, 6, 8, 12, 23, 37};

        System.out.println("Index position of number 23 is: " + indexOf(intArray, numberToFind));
    }
}