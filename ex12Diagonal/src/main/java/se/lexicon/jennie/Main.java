package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        /*
        A program that will print the diagonal elements of a two-dimensional array.
        Example output: 1 4 9
         */

        int[][] num = {{1, 2, 3} , {4, 5, 6} , {7, 8, 9}};

        /*
        Alt. solution:
        System.out.println(num[0][0] + " " + num[1][1] + " " + num[2][2]);
         */

        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i][i] + " ");
        }
    }
}