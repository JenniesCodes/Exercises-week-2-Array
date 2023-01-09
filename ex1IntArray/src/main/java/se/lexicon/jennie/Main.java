package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        /*
        Stores elements in an array of type 'int' and prints it out
        Example output: 11 23 39 etc.
         */

        int[] intArray = new int[] {5, 22, 67, 85};

        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }

        /* Alt. solution:
        System.out.print(intArray[0] + " ");
        System.out.print(intArray[1] + " ");
        System.out.print(intArray[2] + " ");
        System.out.print(intArray[3] + "\n");
         */
    }
}