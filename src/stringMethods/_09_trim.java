package stringMethods;

public class _09_trim {
    public static void main(String[] args) {
        /*
        Method Task: It is used to remove whitespaces from both ends of a String
        Non-static and we can call with object name
        It is return type and returns a String
        it does not take any arguments
       NOTE: trim() will not remove any extra spaces between the words, it will only remove extra spaces before and after
       first and last chars in the String
         */

        String str = "     Hello   World     ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());

        String str1 = "   Good  Morning   "; // it will not touch the middle spaces
        String str2 = str1.trim();
        System.out.println(str2);
    }
}
