public class yak {
//    public static String stringYak(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if ((str.length() > i + 2) && ((str.substring(i).equals("y"))) && ((str.substring(i + 2).equals("k"))))
//                i = i + 2;
//
//            else
//                result = result + str.substring(i, i + 1);
//        }
//        return result;
//    }

    public static String yakT(String str) {

        StringBuilder str1 = new StringBuilder(str);
        for (int i = 0; i < str.length()-1; i++) {
            if ((str.length() > i + 2) && (str.charAt(i) == 'y') && (str.charAt(i + 2) == 'k')) {

                str1.deleteCharAt(i);
                str1.deleteCharAt(i + 1);
                str1.deleteCharAt(i + 2);

            }
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        System.out.println(yakT("stryak"));
    }
}

