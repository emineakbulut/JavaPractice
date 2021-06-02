package InterviewQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedFirstWord {

    /* This method counts and returns the number of duplicate characters in a given string */
    static int countTheDuplicates(String str){
        char[] charArr = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>(); // hm<e> = 3;

        for(char ch:charArr){ // "eminecigim"
            hm.put(ch, hm.getOrDefault(ch, 0) +1);
            // getOrDefault method checks if there is a key as requested in the hashmap,
            // if it exist it returns the value of it, otherwise it returns the value default - which in our case is 0.
        }

//        for(char ch: hm.keySet())
//            System.out.println("key: " + ch + " value: " + hm.get(ch));

        /* currently my hashmap is like this for "eminecigim"
        *   key: c value: 1
            key: e value: 2
            key: g value: 1
            key: i value: 3
            key: m value: 2
            key: n value: 1
        * */

        int counter = 0;

        for(char ch: hm.keySet())
            if(hm.get(ch)>1)
                counter++;

        return counter;
    }


    /* This method returns the first recurring word in a given sentence.
     * Sentence is made of words and characters :,;- and  white space characters.
     * except everything other than words are delimiters
     * */
    static String findTheFirstRepeatedWord(String sentence){

        String cleanedStr = sentence.replaceAll("[:,;-]", " ");
        // + means multiple matches - it means many spaces here
        String cleanedStr2 = cleanedStr.replaceAll("\\s+", " ");
        String[] arrStr = cleanedStr2.split(" ");

        for(String str:arrStr)
            System.out.println(str);

        String repeatedWord = "";

        // We preferred to use hashset, because hashset doesn't accept duplicate values.
        // When hashset returns false when we try to add a string, then it means we caught the first repeated word
        Set<String> hs = new HashSet<>();
        boolean returnVal;

        // let's loop through the String array made of words
        for(String str: arrStr) {
            returnVal = hs.add(str); // add returns true if str is added to the hash set. Returns false if fails - it means str is already in the hashset.
            if(returnVal == false) {
                repeatedWord= str;
                break;
            }
        }

        return repeatedWord; // let's return the repeated word
    }


    public static void main(String[] args) {

        String sentence = "We:had,  already had; work second-work";

        String firstRepeatedWord = findTheFirstRepeatedWord(sentence);
        System.out.println("firstRepeatedWord: Repeated string is: " + firstRepeatedWord);

        int numOfDuplicates = countTheDuplicates("eminecigim"); // e,i,m -- expected result: 3
        System.out.println("countTheDuplicates method: Number of duplicates is: " + numOfDuplicates);

    }
}
