    package homeworks;

    import java.util.ArrayList;
    import java.util.Arrays;

    public class Homework19 {


        /*
        Requirement:
    -Create a method called noDigit()
    -This method will take one String argument and it will
    return a new String with all digits removed from the
    original String

         */
        //Task-1 USING REGEXES
        public static String noDigit(String str) {
            return str.replaceAll("[0-9]", "");
        }

        //Task-1 USING CHARACTER METHOD
        public static String noDigit1(String str) {
            String str1 = "";
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) str1 += str.charAt(i);
            }
            return str1;
        }


        /*
        Requirement:
    -Create a method called noVowel()
    -This method will take one String argument and it will
    return a new String with all vowels removed from the
    original String
         */
        //Task-2 WITH REGEX
        public static String noVowel(String str) {
            return str.replaceAll("[AEIOUaeiou]", "");
        }

        //Task-2 WITH CHARAT(i)
        public static String noVowel1(String str) {

            String str1 = "";
            for (int i = 0; i < str.length(); i++) {
                if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'O' || str.charAt(i) == 'I' || str.charAt(i) == 'U'))
                    str1 += str.charAt(i);

            }
            return str1;
        }

        /*
        Requirement:
        -Create a method called sumOfDigits()
        -This method will take one String argument and it will return an int sum
        of all digits from the original String.
        NOTE: Return zero if there is no digits in the String
         */
        //Task-3
        public static int sumOfDigits(String s) {
            int number = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) number += Integer.parseInt("" + s.charAt(i));
            }
            return number;
        }

        /*
        Requirement:
    -Create a method called hasUpperCase()
    -This method will take one String argument and it will return boolean
    true if there is an uppercase letter and false otherwise.

         */
        //Task-4
        public static boolean hasUpperCase(String str) {
            boolean hasUpperCase1 = false;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) hasUpperCase1 = true;
            }
            return hasUpperCase1;
        }

        /*
        Requirement:
        -Create a method called middleInt()
        -This method will take three int arguments and it will return the middle
        int.

         */
        //Task-5
        public static int middleInt(int a, int b, int c) {
            int[] arr = {a, b, c};
            Arrays.sort(arr);
            return arr[1];
        }

            /*
            Requirement:
        -Create a method called no13()
        -This method will take an int array as argument and it will return a new
        array with all 13 replaced with 0.
        NOTE: Assume length will always be more than zero.
        Test Data 1: [1, 2, 3 ,4]
        Expected Result 1: [1, 2, 3 ,4]
        Test Data 2: [13, 2, 3 ]
        Expected Result 2: [0, 2, 3 ]
        Test Data 3:[13, 13, 13 , 13, 13]
        Expected Result 3: [0, 0, 0, 0, 0]
             */
        //Task-6
        public static int[] no13_1(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 13) array[i] = 0;
            }
            return array;
        }

        public static int[] no13_2(int[] array) {
            int index = 0;
            for (int element : array) {
                if (element == 13) array[index++] = 0;
            }
            return array;
        }

        /*
        Requirement:
    -Create a method called arrFactorial()
    -This method will take an int array as argument and it will return the
    array with every number replaced with their factorials.
    NOTE: Assume length will always be more than zero.
  
         */
        //Task-7
        public static int[] arrFactorial(int[] nums) {

            for (int i = 0; i < nums.length; i++) { // { 5, 4, 3, 2, 1 } // 5 { 120,
                int factorial = 1; // then we reset our container after each  iteration
                for (int j = 2; j <= nums[i]; j++) {
                    factorial *= j; // we find the factorial here
                }
                nums[i] = factorial; // then we are assigning our index of an element with our  new factorial number
            }
            return nums;

        }

        /*
        Requirement:
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as
    letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES
    NOTE: Assume length will always be more than zero.

         */
        //Task-8
        public static String[] categorizeCharacters(String str) {
    //    String[] split = str.split(str);
            //  ArrayList<String> str1 = new ArrayList<>();
            String letters = "";
            String specials = "";
            String digits = "";
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
                else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
                else if (!(Character.isLetterOrDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i))))
                    specials += str.charAt(i);
                // (!(asdfghjk) OR !asdfghjk || !asdfghjk
            }
            String[] arr = new String[3];
            arr[0] = letters;
            arr[1] = digits;
            arr[2] = specials;
            return arr;
        }
        public static String[] categorizeCharacters1(String str){
            String[] catg = {"", "", ""};

            for (char character : str.toCharArray()) {
                if (Character.isLetter(character)) catg[0] += character + "";
                else if (Character.isDigit(character)) catg[1] += character + "";
                else catg[2] += character + "";
            }

            return catg;
        }


        public static void main(String[] args) {
            System.out.println(noDigit("Hello123java"));
            System.out.println(noDigit1("Hello123java"));
            System.out.println(noVowel("HAHAhehekoko"));
            System.out.println(noVowel1("DIKOhiko"));
            System.out.println(sumOfDigits("John’s age is 29"));
            System.out.println(hasUpperCase("ohn’s AAge is 29"));
            System.out.println("task5");
            System.out.println(middleInt(-1, 25, 10));
            int[] nums = {1, 2, 3, 4};
            System.out.println(Arrays.toString(arrFactorial(nums)));
            String s = "abc123$#%";
            System.out.println(Arrays.toString(categorizeCharacters(s)));
        }


    }

