package practiceAbeData;

import utilities.CharacterHelper;

public class PracticeExercise {
    public static void main(String[] args) {
        // Exercise find the max value of 5 numbers = 30, -5, 100, 200,105
        /*1. int variables for 5 numbers
        2.declare and assign them
        3.Use the Math class and max method to find
        4.print out

         */

        double a = 30;
        double b = -5;
        double c = 100;
        double x = 200;
        double y = 105;

        double aAndB = Math.max(a, b);
        double cAndX = Math.max(c, x);
        double everyNumber = Math.max(aAndB, Math.max(cAndX, y));


        System.out.println(Math.max(a, b));
        System.out.println(Math.max(c, x));
        //System.out.println(Math.max(aAndB,Math.max(cAndX,y)));
        System.out.println(everyNumber);

        /*1.we do not need to create variable name for 30, we already have
        2.find a random value between 0 and 30 in int value - whole number
        3.print it out
         */
        int rand = (int) (Math.random() * 30);


        //System.out.println((int)(Math.random()*30)); //we put casting (int) for it because we need to get int output
        System.out.println(rand);

        //Find random between 56-189 in int and double

        /*1.create casting in (int) before the class and method
        2.find random between 56-189 using random method
        3.print out

         */
        //189-56=133 +1
        int rand1 = (int) (Math.random() * 134) + 56;
        System.out.println(rand1);

        //double

        /*1.we don't need to create casting (double),because
        2.find a random between 56-189
        3.print out
        */
        System.out.println((Math.random() * 134) + 56);


        //Find a square root of 13,47,5
        System.out.println(Math.sqrt(13));


        char myChar = 'h';
        char myChar1 = 'a';
        char myChar2 = 'b';
        System.out.println(" the char method bla bla bla " + CharacterHelper.isConsonant(myChar));

        String s = "Like a purple toy on the floor";
        System.out.println(s.substring(0, s.indexOf(" ")) + "!"); // first "Data"
        System.out.println("!" + s.substring(s.lastIndexOf(" ") + 1) + "!"); // last "dance"
        System.out.println("!" + s.substring(s.indexOf(" ") + 1, s.lastIndexOf(" ")) + "!"); // last "dance"


        System.out.println("\n-------------count spaces---------\n");
        String str1 = "123 Java, JavaScript, C# 456 bla bla";

        int total = 0;
        String str4 = str1.trim();
        for (int i = 0; i <= str4.length() - 1; i++) {
            if (str4.charAt(i) == ' ') total++;
        }
        System.out.println(total);

        System.out.println("\n-------------reverse string multiple lines---------\n");
        String str3 = "Hello";
        for (int i = str3.length() - 1; i >= 0; i--) {
            System.out.print(str3.charAt(i));
        }

        System.out.println("\nNESTED LOOP");

        for (int i = 1; i < 4; i++) {
            System.out.println(i);
            for (int j = 5; j > 2; j--) {
                System.out.println("\t" + j);
            }
        }
    }}
