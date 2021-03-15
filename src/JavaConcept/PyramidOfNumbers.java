package JavaConcept;

import java.util.Scanner;

//How To Create Pyramid Of Numbers In Java?
//OUTPUT:
//How Many Rows You Want In Your Pyramid?
//9
//Here Is Your Pyramid
//         1
//        2 2
//       3 3 3
//      4 4 4 4
//     5 5 5 5 5
//    6 6 6 6 6 6
//   7 7 7 7 7 7 7
//  8 8 8 8 8 8 8 8
// 9 9 9 9 9 9 9 9 9
public class PyramidOfNumbers {

    public static void main(String[] args) {

        int nOfRows = 7;
        //Initializing rowCount with 1
        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = nOfRows; i > 0; i--)
        { //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //Printing 'rowCount' value 'rowCount' times at the end of each row

            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }
}



