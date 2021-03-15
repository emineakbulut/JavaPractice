package InterviewQ;

import java.util.HashMap;
import java.util.Map;

public class Hw {
    //Given a string return the number of characters that exactly repeats twice.
    // If there is none return 0. "blinking" returns 2(i and e repeats twice)

    static int duplicates(String str){
        char[] arr=str.toCharArray();
        Map<Character,Integer> hmap=new HashMap<>();
        for (char ch:arr){
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);

        }
        int counter=0;
        for (char c: hmap.keySet()) {
            if (hmap.get(c)>1)
                counter++;
        }
        return counter;
    }
//===================================================

    static void duplicatedValue(){
        String s="blinking";
        int counter = 0 ;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(i)==s.charAt(j))
                {
                    counter++;

                }
            }
            System.out.println(s.charAt(i)+" -- "+counter);
//            String d=String.valueOf(s.charAt(i)).trim();
//            s=s.replaceAll(d,"");
            counter = 0;

        }

    }

    public static void main(String[] args) {
        int numOfDupl=duplicates("blinking");
        System.out.println("Number of duplicates is: " + numOfDupl);
//        Number of duplicates is: 2

        duplicatedValue();
//        b -- 1
//        l -- 1
//        i -- 2
//        n -- 2
//        k -- 1
//        i -- 2
//        n -- 2
//        g -- 1



    }
}
