package InterviewQ;

public class meta {
    public static void main(String[] args) {
      totalPrice(5);
    }

    public static void totalPrice(int n){
        //In any language you know - write code to print the following:
// The firstDayFine fine for an overdue library book is 10 cents for the first day
// and increases by 1 cent for each succeeding day – that is, 11 cents for the second day,1-10 2-11 3-12 4-13
// 12 cents for the 3rd day and so on. The total fine is the sum of the firstDayFine fines.
// Given the user input of n days late, print out the number of days late
// along with the average firstDayFine fine

        int firstDayFine=10;
        int dayCount=1;
        int totalFine=0;

        for(int i=0; i<=n-1;i++){
            totalFine=firstDayFine+i;

                System.out.println(dayCount+" "+totalFine);
                dayCount++;
            }

        }

}

