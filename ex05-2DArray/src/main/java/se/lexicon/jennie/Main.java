package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        /*
        A two-dimensional string array containing any Country and City
        Example output: France Paris
                        Sweden Stockholm
         */

        String[][] twoD = {{"Japan", "Tokyo"}, {"Ireland", "Dublin"}};

        System.out.print(twoD[0][0] + " ");
        System.out.println(twoD[0][1]);
        System.out.print(twoD[1][0] + " ");
        System.out.println(twoD[1][1]);

        /*
        [row][column]

        String[][] twoD = new String[2][2];
        twoD[0][0] = "Japan";
        twoD[0][1] = "Tokyo";
        twoD[1][0] = "Ireland";
        twoD[1][1] = "Dublin";
         */
    }
}