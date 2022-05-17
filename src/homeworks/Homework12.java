package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

       /* Requirement:
        -Create an int array having size of 10
                -Assign 23 to index of 2
                -Assign 12 to index of 4
                -Assign 34 to index of 7
                -Assign 7 to index of 9
                -Assign 15 to index of 6
                -Assign 89 to index of 0
        THEN:
        -Print element at index of 3
                -Print element at index of 0
                -Print element at index of 9
                -Print the entire array
        Expected Result:
        0
        89
        7
                [89, 0, 23, 0, 12, 0, 15, 34, 0, 7] */
        System.out.println("-----Task-1-----");
        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n\n\n-----Task-2-----");
      /*  Requirement:
        -Create a String array having size of 5
                -Assign “abc” to index of 1
                -Assign “xyz” to index of 4
        THEN:
        -Print element at index of 3
                -Print element at index of 0
                -Print element at index of 4
                -Print the entire array
        Expected Result:
        null
        null
        xyz
                [null, abc, null, null, xyz]
*/

        String[] letters = new String[5];
        letters[1] = "abc";
        letters[4] = "xyz";
        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(Arrays.toString(letters));


        System.out.println("\n\n\n-----Task-3-----");
        /*
                Requirement:
        -Create an int array that stores numbers below
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire array
        -Print the entire array sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
                 */
        int[] nums = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("\n\n\n-----Task-4-----");
        /*
                Requirement:
        -Create a String array that stores countries below
        Germany, Argentina, Ukraine, Romania
        THEN:
        -Print the entire array
        -Print the entire array sorted lexicographically
        Expected Result:
        [Germany, Argentina, Ukraine, Romania]
        [Argentina, Germany, Romania, Ukraine]
                 */
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n\n\n-----Task-5-----");
        /*Requirement:
        -Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
        THEN:
        -Print the entire array
                -Then, check if it contains Pluto
        if it contains Pluto, then print true
        if it does not contain Pluto, print false
        Expected Result:
[Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
        true
*/
        String[] dogs = {"Scooby Doo","Snoopy","Blue","Pluto","Dino","Sparky"};
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));
      //  boolean hasPluto = false;
      /*  for (String dog : dogs) {
            if (dog.contains("Pluto")) {
                hasPluto = true;
                break;
            }
        }


        System.out.println(hasPluto);
*/
        System.out.println(Arrays.binarySearch(dogs, "Pluto") >= 0);

        System.out.println("\n\n\n-----Task-6-----");
        /*
                Requirement:
        -Create a String array that stores cartoon cats
        below
        Garfield, Tom, Sylvester, Azrael
        THEN:
        -Print the entire array sorted lexicographically
        -Then, check if it contains Garfield and Felix
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false
         */
        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
      /*  boolean hasCats = false;
        for(String cat : cats){
            if(cat.equals("Garfield") && cat.equals("Felix")){ //it shows always false,
                // may be its better to check with binarySearch method

                hasCats = true;
                break;
            }
        }
        System.out.println(hasCats);
*/
        System.out.println(Arrays.binarySearch(cats, "Garfield") >= 0 &&
                Arrays.binarySearch(cats, "Felix") >= 0);


        System.out.println("\n\n\n-----Task-7-----");
        /*
                Requirement:
        -Create a double array that stores numbers below
        10.5, 20.75, 70, 80, 15.75
        THEN:
        -Print the entire array
        -Print each element
        Expected Result:
        [10.5, 20.75, 70, 80, 15.75]
        10.5
        20.75
        70
        80
        15.75
         */
        double[] doubleNum = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubleNum));
        for(double num : doubleNum){
            System.out.println(num);
        }

        System.out.println("\n\n\n-----Task-8-----");
        /*
                Requirement:
        -Create a char array that stores characters below
        A, b, G, H, 7, 5, &, *, e, @, 4
        THEN:
        -Print the entire array
        -Print the total count of the letters
        -Print the total count of lowercase letters
        -Print the total count of uppercase letters
        -Print the total count of digits
        -Print the total count of special characters
        Expected Result:
        [A, b, G, H, 7, 5, &, *, e, @, 4]
        Letters = 5
        Uppercase letters = 3
        Lowercase letters = 2
        Digits = 3
        Special characters = 3
         */
        int letter = 0;
        int lowerLetter = 0;
        int upperLetter = 0;
        int digit = 0;
        int specialChar = 0;
        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(chars));
        for(char myChar : chars){
            if(Character.isLetter(myChar)) letter++;
               if(Character.isUpperCase(myChar)) upperLetter++;
               else if(Character.isLowerCase(myChar)) lowerLetter++;
            else if(Character.isDigit(myChar)) digit++;
          else specialChar++;

            /*
          1!  When I did task-8 with this method like on the top,
            if letters
            else if uppercase
            else if  lowercase
            else if digits
            else spec characters
            it is not showing me on console uppercase and lowercase letters. They are 0, and I can not find the solution
 Letters = 5
Uppercase letters = 0
Lowercase letters = 0
Digits = 3
Special characters = 3

         2! I tried different way with nested ifs
         if letters
         if uppercase
         if lowercase
         else if digits
         else spec characters
         and then I got everything correct except special characters
             */
        }

        System.out.println("Letters = " + letter +
            "\nUppercase letters = " + upperLetter +
           "\nLowercase letters = " +lowerLetter +
              "\nDigits = " + digit +
              "\nSpecial characters = " + specialChar);


        System.out.println("\n\n\n-----Task-9-----");
        /*
             Requirement:
        -Create a String array that stores objects below
        Pen, notebook, Book, paper, bag, pencil, Ruler
        THEN:
        -Print the entire array
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements starts with B or P, ignoring cases
        -Print how many elements has “book” or “pen” in it, ignoring
        cases
        Expected Result:
        [Pen, notebook, Book, paper, bag, pencil, Ruler]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 4
        Elements starting with B or P = 5
        Elements having ”book” or “pen”= 4
                 */
      String[] books = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(books));
        int upper = 0;
        int low = 0;
        int bAndP = 0;
        int bookAndPen = 0;
        for(String b : books) {
            if (Character.isUpperCase(b.charAt(0))) upper++;
        else low++;
            if(b.startsWith("B") || b.startsWith("b") || b.startsWith("P") || b.startsWith("p")) bAndP++;
            if (b.contains("Book") || (b.contains("book") ||
                    (b.contains("Pen") || (b.contains("pen"))))) bookAndPen++;

        }

        /*
              Requirement:
        -Create an int array that stores numbers below
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire array
        -Print how many elements are more than 10
        -Print how many elements are less than 10
        -Print how many elements are 10
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that are more than 10 = 5
        Elements that are less than 10 = 4
        Elements that are 10 = 2
         */
        System.out.println("\n\n\n-----Task-10-----");
        int more10 = 0, less10 = 0,ten = 0;

        int[] numbers1 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbers1));
        for(int num : numbers1) {
            if (num > 10) more10++;
            else if (num < 10) less10++;
            else ten++;
        }
        System.out.println("Elements that are more than 10 = " + more10 +
        "\nElements that are less than 10 = " + less10 +
                "\nElements that are 10 = " + ten++);


        System.out.println("\n\n\n-----Task-11-----");
        /*
                Requirement:
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0
        THEN:
        -Print both arrays
        –Then, create a new array called that will take
        greatest of same index from first 2 arrays
        -Print third array as well
        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2]
                 */
        int[] firstNum = {5, 8, 13, 1, 2};
        int[] secondNum = {9, 3, 67, 1, 0};
        System.out.println(Arrays.toString(firstNum) + "\n" + Arrays.toString(secondNum));
        int[] thirdNum = new int[5];

       // int greatest = (Math.max(Math.max(Math.max(Math.max(first[0],first[1]),first[2] ),first[3]),first[4])) ;
        for(int num = 0 ; num < 5 ; num++){
            thirdNum[num] = Math.max(firstNum[num],secondNum[num]);
        }
        System.out.println("3rd array is = " + Arrays.toString(thirdNum));

        }
  }
