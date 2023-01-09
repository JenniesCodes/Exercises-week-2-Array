package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        /*
        A program that prints the average of the numbers in an array.
        The array should be these numbers in this order: 43, 5, 23, 17, 2, 14
        Example output: Average is: 17.3
         */

        double[] numbers = {43, 5, 23, 17, 2, 14};

        double average = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5]) / 6;

        System.out.println("Average is: " + average);
    }
}