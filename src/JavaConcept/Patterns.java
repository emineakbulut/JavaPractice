package JavaConcept;

public class Patterns {
    //Here Is Your Pyramid
    //         1
    //        1 2
    //       1 2 3
    //      1 2 3 4
    //     1 2 3 4 5
    //    1 2 3 4 5 6
    //   1 2 3 4 5 6 7
    //  1 2 3 4 5 6 7 8
    // 1 2 3 4 5 6 7 8 9
    public static void main(String[] args) {
        int noOfRows=5;
        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //Printing 'j' value at the end of each row

            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }
    }

