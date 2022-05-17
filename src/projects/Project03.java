package projects;

import java.sql.SQLOutput;

public class Project03 {
    public static void main(String[] args) {
        /*
                TASK-1
        -Assume that you are given below Strings
        String s1 = “24”, s2 = “5”;
        -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
        The sum of 24 and 5 = 29
        The subtraction of 24 and 5 = 19
        The division of 24 and 5 = 4.8
        The multiplication of 24 and 5  = 120
        The remainder of 24 and 5 = 4
         */

        System.out.println("Task-1");
        /*1.Change given Strings into int
        2.Find sum,subtraction,mult,div,remainder
        3.Print out
         */
        String s1 = "24", s2 = "5";
        int s1Int = Integer.parseInt(s1), s2Int = Integer.parseInt(s2);
        System.out.println("The sum of 24 and 5 = " + (s1Int + s2Int) +
                "\nThe subtraction of 24 and 5 = " + (s1Int - s2Int) +
                "\nThe division of 24 and 5 = " + ((double)s1Int/(double)s2Int) +
                "\nThe multiplication of 24 and 5  = " + (s1Int * s2Int) +
                "\nThe remainder of 24 and 5 = " + (s1Int % s2Int));

        System.out.println("\nTask-2");
                /*
                TASK-2
        -Write a program that generates a random number between 1 to 35 (1 and 35 are
        included)
        -Find if the given number is a Prime Number
        -If random number generated is a prime one, then print “THE NUMBER IS A
        PRIME NUMBER”.
        -Otherwise, print “THE NUMBER IS NOT A PRIME NUMBER”
        Prime number is a number that can be divided only by itself and 1. It cannot be
        divided by any other number. The smallest prime number is 2 and 2 is the only
        even prime number.
        So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17,
        19, 23, 29, 31
                 */
        /*1.Create random number between 1 and 35 both included
        2.Find if given number is Prime number with if else statement
        3.Print out
         */
        int random = (int)(Math.random()*35)+1;
        System.out.println("Random number is = " + random);
        if(random == 2 || random == 3 || random == 5 || random == 7 || random == 11 || random == 13 ||
         random == 17 || random == 19 || random == 23 || random == 29 || random == 31)
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");


        System.out.println("\nTask-3");
                /*
                TASK-3
        -Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are
        included)
        -Find and print each number in an ascending order
        -Ascending order is ordering from lowest to greatest
        NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this
        task.
        Test data: Assume below numbers are generated
        Random number 1 = 43
        Random number 2 = 7
        Random number 3 = 30
        Expected result:
        Lowest number is = 7
        Middle number is = 30
        Greatest number is = 43
         */
        /*1.Generate 3 random numbers between 1 and 50 both are included
        2.print out each in ascending order
        3.print out

         */
        int random1 = (int)(Math.random() * 50 ) + 1,random2 = (int)(Math.random() * 50 ) + 1,
        random3 = (int)(Math.random() * 50 ) + 1;
        System.out.println("Generated numbers are : " +"\n"+ random1 +
        "\n" + random2 + "\n" + random3);
        int min = Math.min(Math.min(random1,random2),random3);
        int max = Math.max(Math.max(random1,random2),random3);
        if (random1 < random2 && random1 < random3) System.out.println("Lowest number is = " + random1);
        else if (random2 < random1 && random2 < random3) System.out.println("Lowest number is = " + random2);
        else if (random3 < random1 && random3 < random2) System.out.println("Lowest number is = " + random3);

        if (random1 != min && random1 != max) System.out.println("Middle number is = " + random1);
        else if (random2 != min && random2 != max) System.out.println("Middle number is = " + random2);
        else System.out.println("Middle number is = " + random3);

        if (random1 > random2 && random1 > random3) System.out.println("Greatest number is = " + random1);
        else if (random2 > random1 && random2 > random3) System.out.println("Greatest number is = " + random2);
        else if (random3 > random1 && random3 > random2) System.out.println("Greatest number is = " + random3);

        System.out.println("\nTask-4");
        /*
                TASK-4 (Find if given char is lowercase or uppercase)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
        NOTE: You need to use ASCII table and casting for this task
        Test data 1: Assume you are given 5
        char c = ‘5’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given a
        char c = ‘a’;
        Expected result 2:
        The letter is lowercase
        Test data 3: Assume you are given R
        char c = ‘R’;
         */
        /*
                Special Characters (32–47 / 58–64 / 91–96 / 123–126)
        Uppercase Letter 65 – 90
        Lowercase Letter 97 – 122
        Number 48 – 57
         */
        /*1.create char variables
        2.check if given char is letter,uppercase or lowercase by using if - else statement
        3.print out
        */
        char myChar = ' ';
        if(myChar >= 65 && myChar <= 90) System.out.println("The letter is uppercase");
        else if (myChar >= 97 && myChar <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        System.out.println("\nTask-5");
        /*
                TASK-5 (Find if given char is vowel or consonant)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If it is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out whether it is a vowel or a consonant.
        -If the letter is vowel, then print “The letter is vowel”, else print “The letter is
        consonant”.
        -Vowel letters: a, e, I, o, u, A, E, I, O, U
        NOTE: You need to use ASCII table and casting for this example
        Test data 1: Assume you are given #
        char c = ‘#’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given E
        char c = ‘E’;
        Expected result 2:
        The letter is vowel
        Test data 3: Assume you are given R
        char c = ‘R’;
        Expected result 3:
        The letter is consonant
         */
         /*1.create char variables
        2.check if given char is letter,vowel and consonant by using if - else statement
        3.print out
        */
        char myChar1 = ' ';
        if ((myChar1 >= 65 && myChar1 <= 90) || (myChar1 >= 97 && myChar1 <= 122))
            if (myChar1 == 'a' || myChar1 == 'e' || myChar1 == 'i' || myChar1 == 'o' || myChar1 == 'u' ||
                    myChar1 == 'A' || myChar1 == 'E' || myChar1 == 'I' || myChar1 == 'O' || myChar1 == 'U')
                System.out.println("The letter is vowel");
            else System.out.println("The letter is consonant");
               else System.out.println("Invalid character detected!!!");

        System.out.println("\nTask-6");
        /*
        TASK-6 (Find if given char is special character or not)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if the given char is a special character but not a digit or not a letter.
        -If it is not a special character, then print “Invalid character detected!!!”.
        -If it is a special character, then print “Special character is =
        {givenCharacter}”.
        NOTE: You need to use ASCII table and casting for this example
        Test data 1: Assume you are given 8
        char c = ‘8’;
        Expected result 1:
        Invalid character detected!!!
                Test data 2: Assume you are given *
        char c = ‘*’;
        Expected result 2:
        Special character is = *
         */
        /*1.create char variable
        2.check if given char is special character by using if else statement
        3.print out
        */
        char givenCharacter = ' ';
        if(!(givenCharacter >= 65 && givenCharacter <= 90) && !(givenCharacter>=97&&givenCharacter<=122) &&
                !(givenCharacter>=48&&givenCharacter<=57))
            System.out.println("Special character is = " + givenCharacter);
        else System.out.println("Invalid character detected!!!"); // I tried all my logic here, but output always same "if" block of code
                                                                   // it is not showing me   "else "  block of code even i type letters and digits

        System.out.println("\nTask-7");
                /*
                TASK-7 (Find if given char is a letter or digit or special character)
        -Assume you are given a single character. (It will be hard-coded)
        -If given char is a letter, then print “Character is a letter”
        -If given char is a digit, then print “Character is a digit”
        -Otherwise, print “Character is a special character”
        Test data 1: Assume you are given g
        char c = ‘g’;
        Expected result 1:
        Character is a letter
        Test data 2: Assume you are given 5
        char c = ‘5’;
        Expected result 2:
        Character is a digit
        Test data 3: Assume you are given 5
        char c = ‘@’;
        Expected result 3:
        Character is a special character
       */
        /*1.create char variable
        2.find if given char is letter, digit or special character with if else
      */
        char myChar2 ='$';
        if((myChar2>=65 && myChar2<=90) || (myChar2>=97 && myChar2<=122)) System.out.println("Character is a letter");
        else if (myChar2>=48 && myChar2<=57) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");


        /*
        Requirement:
        Write a Java program that generates 3 random
        numbers between 0 and 100 (0 and 100 are
        included) and find if all numbers are more than
        25
        Print true if all numbers are greater than 25
        Print false if any of the number is less than or
        equal to 25
         */
        ////////////////////TASK-4 SOLUTION///////////////////




        /*
        Requirement:
        Write a Java program to ask user to enter a
        number between 1 and 7 (1 and 7 are included)
        Print the day of the week according to given
        number. First day is MONDAY and last day is
        SUNDAY
        Test data 1:
        Input number: 3
        Expected Output:
        The number entered returns WEDNESDAY
        Test data 2:
        Input number: 5
        Expected Output:
        The number entered returns FRIDAY
         */
        ////////////////////TASK-5 SOLUTION///////////////////


        /*
        Requirement:
        Write a program that asks user to enter a number
        between
        -10 to 10 (-10 and 10 are included)
        -If number is positive, then print a message:
        “Number entered is POSITIVE”
        -If number is negative, then print a message:
        “Number entered is NEGATIVE”
        -If number is zero, then print a message: “Number
        entered is ZERO”
        -If number is even, then also print: “Number entered
        is EVEN”
        -If number is odd, then also print: “Number entered
        is ODD”
        Test data1:
        0
        Expected Output1:
        Number entered is
        ZERO
        Number entered is
        EVEN
        Test data2:
        5
        Expected Output1:
        Number entered is
        POSITIVE
        Number entered is
        ODD
         */
        ////////////////////TASK-6 SOLUTION///////////////////

        /*
        Jennifer is taking a math course . This math course
        requires students to take 3 exams. At the end, if the
        average of those exams is more than or equal to 70, then
        Jennifer will pass the course. However, if the average of
        those 3 exams is less than 70, then Jennifer will fail.
        Requirement:
        Write a Java program that asks Jennifer to enter her exam
        results and print if she passed or failed for the exam.
        NOTE: This program requires you to use Scanner
        Example Program 1:              Example Program 2:
        Program: Tell me your           Program: Tell me your
        exam results?                   exam results?
        User: 20 50 85                  User: 65 80 90
        Program: YOU FAILED!            Program: YOU PASSED!
         */
        ////////////////////TASK-7 SOLUTION///////////////////

        /*
        Requirement:
        Write a Java program that asks user to enter 3 numbers
        -If all 3 numbers are equal, then print “TRIPLE MATCH”
        -If any of those 2 numbers are equal, then print
        “DOUBLE MATCH”
        -If all numbers are different, then print “NO MATCH”
        NOTE: This program requires you to use Scanner
        Example Program 1:          Example Program 2:              Example Program 3:
        Program: Enter 3 numbers    Program: Enter 3 numbers        Program: Enter 3 numbers
        User: 3 3 3                 User: 5 4 5                     User: 2 5 7
        Program: TRIPLE MATCH       Program: DOUBLE MATCH           Program: NO MATCH
         */
        ////////////////////TASK-8 SOLUTION///////////////////




        /*
        TASK-3
        -Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are
        included)
        -Find and print each number in an ascending order
        -Ascending order is ordering from lowest to greatest
        NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this
        task.
        Test data: Assume below numbers are generated
        Random number 1 = 43
        Random number 2 = 7
        Random number 3 = 30
        Expected result:
        Lowest number is = 7
        Middle number is = 30
        Greatest number is = 43
         */

        System.out.println("\nTASK3\n");

        int num1 = (int)(Math.random() * 50) + 1;
        int num2 = (int)(Math.random() * 50) + 1;
        int num3 = (int)(Math.random() * 50) + 1;

        int max1 = Math.max(Math.max(num1, num2), num3);
        int min1 = Math.min(Math.min(num1, num2), num3);

        System.out.println("Lowest number is = " + min);
        if (num1 != max1 && num1 != min1){
            System.out.println("Middle number is = " + num1);
        }else if (num2 != max1 && num2 != min1){
            System.out.println("Middle number is = " + num2);
        }else{
            System.out.println("Middle number is = " + num3);
        }
        System.out.println("Greatest number is = " + max1);

        /*
        TASK-4 (Find if given char is lowercase or uppercase)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
        NOTE: You need to use ASCII table and casting for this task
        Test data 1: Assume you are given 5
        char c = ‘5’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given a
        char c = ‘a’;
        Expected result 2:
        The letter is lowercase
        Test data 3: Assume you are given R
        char c = ‘R’;
         */
        System.out.println("\nTASK4\n");
        char c = '5';

        if (c >= 'a' && c <= 'z'){
            System.out.println("The letter is lowercase");
        }else if (c >= 'A' && c <= 'Z'){
            System.out.println("The letter is uppercase");
        }else{
            System.out.println("Invalid character detected!!!");
        }

        /*
        TASK-5 (Find if given char is vowel or consonant)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If it is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out whether it is a vowel or a consonant.
        -If the letter is vowel, then print “The letter is vowel”, else print “The letter is
        consonant”.
        -Vowel letters: a, e, I, o, u, A, E, I, O, U
        NOTE: You need to use ASCII table and casting for this example
        Test data 1: Assume you are given #
        char c = ‘#’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given E
        char c = ‘E’;
        Expected result 2:
        The letter is vowel
        Test data 3: Assume you are given R
        char c = ‘R’;
        Expected result 3:
        The letter is consonant
         */

//        if (c <= 64 || (c >= 91 && c <= 96) || c > 122){ // <-- special & number --> cInt >= 48 && cInt <= 57
//            System.out.println("Invalid character detected!!!");
//        } else {
//            switch (c) { //vowel
//                case 97: // a --> can put 97 or 'a'
//                case 101: // e
//                case 105: // i
//                case 111: // o
//                case 117: // u
//                case 65: // A
//                case 69: // E
//                case 73: // I
//                case 79: // O
//                case 85: // U
//                    System.out.println("The letter is vowel");
//                    break; // W/O break; the program will continue print out even after a match has been made
//                default: // consonant
//                    System.out.println("The letter is consonant");
//            }
//
//        }

        System.out.println("\nTASK5\n");

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            // EVERYTHING IN HERE IS LETTER


            switch (c){
                case 'a': // 97
                case 101: // e
                case 105: // i
                case 111: // o
                case 117: // u
                case 65: // A
                case 69: // E
                case 73: // I
                case 79: // O
                case 85: // U
                    System.out.println("The letter is vowel");
                    break;
                default:
                    System.out.println("The letter is consonant");
            }

        }else {
            System.out.println("Invalid character detected!!!");
        }

        /*
        TASK-6 (Find if given char is special character or not)
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if the given char is a special character but not a digit or not a letter.
        -If it is not a special character, then print “Invalid character detected!!!”.
        -If it is a special character, then print “Special character is =
        {givenCharacter}”.
        NOTE: You need to use ASCII table and casting for this example
        Test data 1: Assume you are given 8
        char c = ‘8’;
        Expected result 1:
        Invalid character detected!!!
         */

//        boolean isLetterOrDigit = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
//
//        boolean isSpecial = !(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9');
//

        System.out.println("\nTASK6\n");

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
            //ALL LETTERS ARE HERE (Lower case and upper case)
            //ALL DIGITS ARE HERE
            System.out.println("Invalid character detected!!!");
        }else{
            // ALL SPECIAL CHARACTERS ARE HERE
            System.out.println("Special character is = " + c);
        }

//        char beyond127 = 64000;
//        System.out.println(beyond127);










    }
}