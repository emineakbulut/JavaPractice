package JavaFriends;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ptesi {

   /* Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
            (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

    Input :

    John White 1234234534561478

    Output :

    Name : J* W**

    CCN : ** ** **** 1478*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        String name = scan.nextLine();
        System.out.println("Enter your last name");
        String lastname = scan.next();
        System.out.println("Enter your credit card number");
        String ccn = scan.next();

        // 2) Check CCN if it has 16 digit or not
        if (ccn.length() != 16) {
            System.out.println("Your credit card number is invalid");

        } else {
            // 3) Convert data to excepted form
            name = name.toUpperCase().charAt(0) + name.substring(1).replaceAll("\\w", "*");
            lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).replaceAll("\\w", "*");
            ccn = "**** **** ****" + ccn.substring(12);


            // 4) print data on console

            System.out.println("Name  : " + name + " " + lastname);
            System.out.println("CCN   :" + ccn);


        }
    }
}