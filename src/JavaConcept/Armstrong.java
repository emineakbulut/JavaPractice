package JavaConcept;

//Write a java program to check whether a given number is Armstrong number or not.
// A number is called an Armstrong number if it is equal to sum of its digits each raised to the power
// of number of digits in it. For example: 153, 9474, 54748 are some Armstrong numbers.
// In java interview coding questions like this, an interviewer mainly check how do you implement logic in you code.

public class Armstrong {
    public static void main(String[] args) {

        armstrong(153);
    }
    public static boolean armstrong(int n) {
        //First step is to find the number of digits.
        int finalNum = n;
        int num = n;
        int digit = 0;
        while (n >= 1) {
            n = n / 10;
            digit++;
        }
        //Second step is to find each digit and get the n.th power
        int sum = 0;
        while (num >= 1) {
            sum = (int) (sum + Math.pow(num % 10, digit));
            num = num / 10;
        }
        return sum == finalNum;
    }
}
