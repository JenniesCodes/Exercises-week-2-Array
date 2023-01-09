package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        /*
        A program that prints all uneven numbers from an array with 10 numbers
        Example output: Array: 1 2 4 7 9 12
                        Odd Array: 1 7 9
         */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Array: ");

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nOdd Array: ");

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0)
                System.out.print(numbers[i] + " ");
        }
    }
}