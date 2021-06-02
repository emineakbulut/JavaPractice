package JavaConcept;

//Write a java program to reverse a string?

public class ReverseTheString {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("JavaPractice");
        StringBuffer reversed = stringBuffer.reverse();
        System.out.println(reversed);

        System.out.println("===========================================");

        String str = "PracticeJava";
        char [] array = str.toCharArray();
        System.out.println(array.length);
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]);

        }
    }

}
