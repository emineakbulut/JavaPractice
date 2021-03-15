package InterviewQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorkingOnMaps {

    // count duplicate chars (only two occurrences)


    static int duplicatedValue(String str){

        // str="blinking";
        // HashMap map
        // <b> = 1
        // <l> = 1
        // <i> = 2
        // <n> = 2
        // <k> = 1
        // <g> = 1

        Map<Character, Integer> map = new HashMap<>(); // <key> = <value>

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch) == false) // if map doesn't contain the char
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch)+1); // overwrite the existing value by incrementing it one -- map already contains key ch, so retrieve its value and increase one
        }

        int countTwoOccurrences = 0;

        for(char ch: map.keySet()){
            if(map.get(ch) == 2)
                countTwoOccurrences++;
        }

        return countTwoOccurrences;

    }

    public static void main(String[] args) {
        String s="blinking";

        System.out.println("Num of 2 occurences: " + duplicatedValue(s));


        // Hashmap is not ordered
        // TreeMap is ordered by key ascii order 1-2-3-4 a-b-c-d
        // LinkedHashMap ordered by insertion order


        Map<String, Integer> map = new HashMap<>(); // KEY IS ALWAYS UNIQUE


        map.put("age",1);
        map.put("age",2); // overwrite
        map.put("size", 10);
        map.put("hair", 5);
        map.put("color",333);
        map.put("color", 334); // overwrite the existing element with key "color"

        System.out.println("Let's remove key hello: " + map.remove("hello"));
        System.out.println("Let's remove key color: "  + map.remove("color"));
        System.out.println("Let's get the age's value: " + map.get("age"));

        System.out.println(map.containsKey("age"));
        System.out.println("Keyset is: " + map.keySet());
        System.out.println("Value Set is: " + map.values());

        Set<Integer> keySetOfHashMap = new HashSet<>();

        for(String emine: map.keySet())
            System.out.println("Key: " + "\"" + emine + "\"" + " Value: " + map.get(emine));

        for(Map.Entry<String, Integer> entry: map.entrySet())
            System.out.println("Entry Key: " + entry.getKey() + " Entry Value: " + entry.getValue());

        System.out.println("Size of my hashmap is: " + map.size());

        int asciiA = 'a';
        int asciiB = 'b';
        char charB = 'b';

        System.out.println("ascii value of B is" + asciiB);
        System.out.println((int)charB);
        System.out.println(charB);


    }

}
