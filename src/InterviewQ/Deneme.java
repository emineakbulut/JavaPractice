package InterviewQ;

import java.util.Scanner;

public class Deneme {


    public static void main (String [] args) {

        System.out.println(average(5));
    }
public static double average(int n) {
    int dayFine = 10;
    int subTotal = 10;
    double avg = 0;

    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter how many days the book is overdue: ");
    n = scanner.nextInt();  // Read user input

    //  System.out.println("Day 1 fine is: " + dayFine );
    for (int i = 1; i < n; i++) {
        dayFine++;
        // System.out.println("Day " + (i+1) + " fine is: " + dayFine );
        subTotal += dayFine;
    }


    avg = subTotal / n;
    return avg;

}

}
