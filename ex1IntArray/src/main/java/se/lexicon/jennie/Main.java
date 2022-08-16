package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[] {5, 22, 67, 85};


        /*
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
         */

        // System.out.println(intArray.length);


        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }
    }
}