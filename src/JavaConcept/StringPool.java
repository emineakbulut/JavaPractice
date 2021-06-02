package JavaConcept;

public class StringPool {

    public static void main(String[] args) {


        String a = "aaa"; //  String Literal - An object is created in the String Pool - which is in heap

        // JVM checks the String Pool to see if there is any other object already created for "aaa" String literal.
        // Yes, so returns the reference of that object to b. So now a and b refer to the same object.
        // This is called "interning"
        String b = "aaa";


        // New object is forcefully created in the heap
        String c = new String("aaa");


        // equals method is overridden in String, it compares values (byte array element by element comparison) to see if they are equal.
        System.out.println("a.equals(c): " + a.equals(c));

        //  == operator compares the object identities - memory location- (references):
        //  if two objects refer to the same object in the String pool, it returns true. If not returns false.
        System.out.println("a == b : " + (a == b));

        System.out.println("a == c : " + (a == c));



    }
}
