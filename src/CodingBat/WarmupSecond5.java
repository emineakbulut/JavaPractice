package CodingBat;

public class WarmupSecond5 {
    public static void main(String[] args) {
//        System.out.println(nearHundred(103));
//
//        System.out.println("==========================");
//
//        System.out.println(values(-3,7,true));
//
//        System.out.println("==========================");

        System.out.println(not(" not please"));
    }
    //Given an int n, return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.

    public static boolean nearHundred(int a){

        return ((Math.abs(100 - a) <= 10) || (Math.abs(200 - a) <= 10));

      //  boolean result= true;
//        if((100-a)<=10 || (200-a)<=10)
//        return result;
//        else return false;//doesnt work if a >100
    }

//Given 2 int values, return true if one is negative and one is positive.
// Except if the parameter "negative" is true, then return true only if both are negative.

    public static boolean values(int a,int b,boolean negative){
        if(negative)
            return (a<0 && b<0);
        else
            return ((a<0 && b>0) || (a>0 && b<0));

    }
//Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged.
// Note: use .equals() to compare 2 strings.
    public static String not(String str){

        if (str.length()>=3 && str.substring(0,3).equals("not"))
        return str;
        else return ("not "+str);
    }
}
