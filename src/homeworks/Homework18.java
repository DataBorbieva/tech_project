package homeworks;

    import java.text.SimpleDateFormat;

import java.util.Date;

    public class Homework18 {
        /* TASK 1: Create a method called noSpace();
        This method will take one String argument,
        and it will return a new String with all spaces removed from the original String.
        */
        public static String noSpace(String str){
            String noSpaceString = "";
            for (int i = 0; i < str.length(); i++){
                if (!Character.isWhitespace(str.charAt(i))) noSpaceString += str.charAt(i);
            }
            return noSpaceString;
        }


        /* TASK 2: Create a method called replaceFirstLast();
        This method will take one String argument,
        and it will return a new String with first and last characters replaced.
        NOTE: if the length is less than 2, then return empty String
        NOTE: Ignore all before and after spaces (get actual String only)
        */
        public static String replaceFirstLast(String str){
            if (str.trim().length() < 2) return "";
            return str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0,1);

        }


        /* TASK 3: Create a method called hasVowel();
        This method will take one String argument,
         and it will return a boolean checking if String has any vowel or no.
        NOTE: Vowels are = a, e, o, u, i
        NOTE: Ignore cases
        */
        public static boolean hasVowel(String str){
            boolean vowel = false;
            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                    || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) vowel = true;
            return vowel;
        }


        /* TASK 4: Create a method called checkAge();
        This method will take an int yearOfBirth as  argument, and it will print message below based on the entry.
        If the age is less than 16, then print "AGE IS NOT ALLOWED"
        If the age is 16 or more, then print "AGE IS ALLOWED"
        If the age is more than 100 or a future year entered, print "AGE IS NOT VALID"
        NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.
        */
        public static void checkAge(int yearOfBirth){
            Date currentDate = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy");
            int age = Integer.parseInt(format.format(currentDate)) - yearOfBirth;
            if (age > 100 || age < 0) System.out.println("AGE IS NOT VALID");
            else if (age < 16 && age > 0) System.out.println("AGE IS NOT ALLOWED");
            else System.out.println("AGE IS ALLOWED");
        }


        /* TASK 5: Create a method called averageOfEdges();
        This method will take three int arguments,
         and it will return average of min and max numbers.
        */
        public static int averageOfEdges(int a, int b, int c){
            return (Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c))/2;
        }


        /* TASK 6: Create a method called noA();
        This method will take a String array argument,
         and it will return a new array with all elements starting with A or a replaced with "###".
        NOTE: Assume length will always be more than zero
        NOTE: Ignore cases
        */
        public static String[] noA(String[] s){
            String[] newArr = new String[s.length];
            for (int i = 0; i < s.length; i++){
                if (s[i].toLowerCase().startsWith("a")) newArr[i] = "###";
                else newArr[i] = s[i];
            }
            return newArr;
        }


        /* TASK 7: Create a method called no3or5();
        This method will take an int array argument,
        and it will return a new array with some elements replaced as below:
        If element can be divided by 5, replace it with 99
        If element can be divided by 3, replace it with 100
        If element can be divided by both 3 and 5, replace it with 101
        NOTE: Assume length will always be more than zero
        */
        public static int[] no3or5(int[] a){
            int[] newArr = new int[a.length];
            int index = 0;
            for (int element : a){
                if (element % 15 == 0) newArr[index++] = 101;
                else if (element % 5 == 0) newArr[index++] = 99;
                else if (element % 3 == 0) newArr[index++] = 100;
                else newArr[index++] = element;
            }
            return newArr;
        }


        /* TASK 8: Create a method called countPrimes();
        This method will take an int array argument, and it will return how many elements in the array are prime numbers.
        NOTE: Prime number is a number that can be divided only by 1 and itself
        NOTE: Negative numbers cannot be prime
        Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
        NOTE: Smallest prime number is 2
        */
        public static int countPrimes(int[] a){
            int count = 0;
            for (int element : a){
                boolean isPrime = true;
                if (element < 2) continue;
                for (int i = 2; i < element; i++){
                    if (element % i == 0) {
                        isPrime = false;
                        break;
                    }
                } if (isPrime) count++;
            } return count;
        }


        }


