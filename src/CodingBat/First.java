package CodingBat;

public class First {
    //    The parameter weekday is true if it is a weekday,
//    and the parameter vacation is true if we are on vacation.
//    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
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

    public boolean monkeyTrouble(boolean aSmile,boolean bSmile){
        if(aSmile&&bSmile){
            return true;
        }
        return false;
    }
//Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number.

    
}

