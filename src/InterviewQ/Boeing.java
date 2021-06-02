package InterviewQ;

public class Boeing {
    public static void main(String[] args){
//        StringBuilder str =new StringBuilder("Hello");
//        StringBuilder reversedString = str.reverse();

//In any language you know - write code to print the following:
// The daily fine for an overdue library book is 10 cents for the first day
// and increases by 1 cent for each succeeding day – that is, 11 cents for the second day,1-10 2-11 3-12 4-13
// 12 cents for the 3rd day and so on. The total fine is the sum of the daily fines.
// Given the user input of n days late, print out the number of days late
// along with the average daily fine

//    int daily=10;
//    int day=1;
//    int totalFine=0;
//    int n=3;
//
//    for(int i=0; i<=n;i++){
//        totalFine=daily+i;
//        System.out.println(day+" "+totalFine);
//        day++;
//    }

        totalPrice(5);
    }
    public static void totalPrice(int n) {
        /*
        In any language you know - write code to print the following:
 The firstDayFine fine for an overdue library book is 10 cents for the first day
and increases by 1 cent for each succeeding day – that is, 11 cents for the second day,1-10 2-11 3-12 4-13
 12 cents for the 3rd day and so on. The total fine is the sum of the firstDayFine fines.
 Given the user input of n days late, print out the number of days late
 along with the average firstDayFine fine
*/
        int firstDayFine = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + firstDayFine);
            firstDayFine++;
        }
    }
}
