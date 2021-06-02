package JavaConcept;
//Write Java Program To Check Whether Two Strings Are Anagram Or Not?
//For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams.
// “Mother In Law” and “Hitler Woman”

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
         String s1="Mother In Law";
         String s2="Hitler Woman";
         anagram(s1,s2);
    }

    static void anagram(String s1,String s2){

        s1=s1.replaceAll("\\s+","").toLowerCase(Locale.ROOT);
        s2=s2.replaceAll("\\s+","").toLowerCase(Locale.ROOT);

        HashMap<Character,Integer> hm =new HashMap<>();

        for (char c:s1.toCharArray()) {
            hm.put(c, hm.getOrDefault(c,0)+1);

        }
    }
}
