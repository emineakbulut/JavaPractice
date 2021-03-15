package JavaConcept;

public class Pyramid {
    public static void main(String[] args) {
        //Here Is Your Pyramid
        //                  9
        //                8 9 8
        //              7 8 9 8 7
        //            6 7 8 9 8 7 6
        //          5 6 7 8 9 8 7 6 5
        //        4 5 6 7 8 9 8 7 6 5 4
        //      3 4 5 6 7 8 9 8 7 6 5 4 3
        //    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
        //  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1


        int noOfRows = 9;

        //Initializing rowCount with 1

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i >= 1; i--) {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //Printing j where j value will be from i to noOfRows

            for (int j = i; j <= noOfRows; j++) {
                System.out.print(j + " ");
            }

            //Printing j where j value will be from noOfRows-1 to i

            for (int j = noOfRows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }
}
