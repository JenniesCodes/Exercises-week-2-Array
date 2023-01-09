package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        /*
        A multiplication table stored in a multidimensional array.
         */

        int[][] multiTable = new int[10][10];

        for(int row =0; row < multiTable.length; row++) {
            for(int column = 0; column < multiTable.length; column++) {
                multiTable[row][column] = (row+1) * (column+1);
            }
        }

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(multiTable[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}