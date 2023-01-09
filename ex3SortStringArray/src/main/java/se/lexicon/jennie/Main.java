package se.lexicon.jennie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        A program which will sort string array.
        Example output: String array: [Paris, London, New York, Stockholm]
                        Sort string array: [London, New York, Paris, Stockholm]
         */

        String[] capitals = {"Paris", "London", "New York", "Stockholm"};

        System.out.println("String array: " + Arrays.toString(capitals));

        Arrays.sort(capitals);

        System.out.println("Sort string array: " + Arrays.toString(capitals));
    }
}