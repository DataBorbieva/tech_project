package recursion;

public class _03_ReverseString {
    public static String reverseRecursion(String s){

            if (s.isEmpty())
                return s;
            /*
            or
        if(str.length() <= 1) return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

             */

            return reverseRecursion(s.substring(1)) + s.charAt(0);
        }


    public static void main(String[] args) {
        System.out.println(reverseRecursion("Apple"));
        System.out.println(reverseRecursion("")); //just empty
    }}
