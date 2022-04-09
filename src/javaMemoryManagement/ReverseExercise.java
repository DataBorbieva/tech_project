package javaMemoryManagement;

public class ReverseExercise {
    public static String reversedString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        return reversed;
    }

    public static String reverse2(String str){
        StringBuilder sb = new StringBuilder(str); // or  return new StringBuilder(str).reverse().toString();
        sb.reverse();                               //one line only
        return sb.toString();
    }


   public static boolean ifPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());   //check if word is palindrome and return true if its palindrome
   }





}