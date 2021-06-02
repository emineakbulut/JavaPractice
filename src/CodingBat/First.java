package CodingBat;

public class First {
    //    The parameter weekday is true if it is a weekday,
//    and the parameter vacation is true if we are on vacation.
//    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));

        System.out.println("======================================");

        System.out.println(monkeyTrouble(true,false));

        System.out.println("======================================");

        System.out.println(sumDouble(2,5));
        System.out.println(sumDouble(4,4));

        System.out.println("======================================");

        System.out.println(diff21(33));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
// if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling.
// Return true if we are in trouble.

    public static boolean monkeyTrouble(boolean aSmile,boolean bSmile){
        if(aSmile&&bSmile){
            return true;
        }if (!aSmile&&!bSmile){
            return true;
        }
        return false;
    }
//Given two int values, return their sum. Unless the two values are the same,
// then return double their sum.

//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8

    public static int sumDouble(int a,int b){
        int result=0;
        if
         (a==b){
            result=2*(a+b);
        }else{
            result=a+b;

        }
        return result;
    }
/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
    public static int diff21(int n){
        int result=0;
        if (n>21){
            result=21-n;
        }else{
            return (n-21)*2;
        }
        return result;
    }
    
}

