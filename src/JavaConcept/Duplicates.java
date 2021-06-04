package JavaConcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//How to find duplicate elements in an array?
public class Duplicates {

    public static void main(String[] args) {

        int[] arr = {100, 123, 234, 398, 100,234,100, 55,55};
        findDuplicates(arr);
        findDuplicates2(arr);

        String[] myArray = { "ab", "cd", "ab", "de", "cd" };


    }

    public static void findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //key=elements   numberOfElements=value
        for (int num : arr) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            // System.out.println(num);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Number is : " + entry.getKey() + " ---> " + entry.getValue() + " times.");
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if ((arr[i] == arr[j])) { // got the duplicate element.When 3rd is written into array it doesn't work
//                    System.out.println("Duplicates are "+arr[j]);
//                }
//            }
        //}
    }
    public static void findDuplicates2(int[] input) {
        Set<Integer> duplicates = new HashSet<Integer>();
       for (int i = 0; i < input.length; i++) {
           for (int j = 1; j < input.length; j++) {
               if (input[i] == input[j] && i != j) { // duplicate element found
                   duplicates.add(input[i]);
                   break;
               }
           }
       }
       System.out.println(duplicates);

    }
}