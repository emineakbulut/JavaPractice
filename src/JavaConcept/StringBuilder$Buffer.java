package JavaConcept;

public class StringBuilder$Buffer {

    /* This method converts a given String to a char array.
    We are replicating the built-in method of String.charArray() */

    static char[] toCharArrayMethodEmine(String str){ // str: "hey" expected: ['h', 'e', 'y']
        char[] charArr = new char[str.length()];

        for(int i = 0; i < charArr.length; i++){
            charArr[i] = str.charAt(i);
        }

        return charArr;
    }


    /* Method below reverses a given string, and returns it */

    static String reverseString(String str){ // str is here a parameter, it's declared in the method signature

        char[] charArr = str.toCharArray();

        int st = 0;
        int end = charArr.length-1;

        while(st<end){
            // swap : temp
            char temp = charArr[st];
            charArr[st] = charArr[end];
            charArr[end] = temp;

            st++;
            end--;
        }

        //return String.valueOf(charArr);  // this works

        //return new String(charArr); // this also works, because String.valueOf() method returns a new String using the argument we passed.

        String reversed = new String(charArr); // this also works
        return reversed;

    }
    public static void main(String[] args) {

        //Write a java program to reverse a string?

        // let's prove StringBuilder class is mutable
        StringBuilder sb = new StringBuilder("tugba");
        System.out.println((sb.hashCode()));
        sb.append("cim");
        System.out.println((sb.hashCode()));

        // let's prove String class is immutable
        String str = "emine";
        System.out.println((str.hashCode()));
        str += "!";
        System.out.println((str.hashCode()));


        // let's convert a string into a char array
        String myStr = "MyJava";
        char[] strArray = myStr.toCharArray(); // ['M', 'y', ...]

        // let's print the reverse of the char array
        for (int i = 0; i <= strArray.length-1; i++) {
            System.out.print(strArray[i]);     //Output : MyJava
        }

        // let's print the char array
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);     //Output : avaJyM
        }

//-----------------------------------2.week--------------------------------------------------------
        String str1 = "hello";
        //     ['h' , 'e', 'l', 'l' ,'o'] st:0, end: 4
        //     ['o' , 'e', 'l', 'l' ,'h'] st:1, end:3
        //     ['o' , 'l', 'l', 'e' ,'h']

        System.out.println(reverseString(str1)); // str is an argument here, because it is being passed
        char[] charArr = toCharArrayMethodEmine(str1);

        for(char ch: charArr)
            System.out.println(ch);

        StringBuilder myStr1 = new StringBuilder("yesmam");
        myStr1.append("!");
        System.out.println(myStr1.reverse());

    }
    }



