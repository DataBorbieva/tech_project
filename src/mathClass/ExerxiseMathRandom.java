package mathClass;

public class ExerxiseMathRandom {
    public static void main(String[] args) {

        /*
        Create a program which is generating a random number between 45 - 98 and print out
         */
       // FORMULA (int) (Math.random() * (endPoint - startPoint + 1) + startPoint;
                                            //98-45+1
        System.out.println((int)  (Math.random() * 54 + 45));


       //Find 2 random numbers between 67-85 and max and min, print out

        int randomOne = (int)(Math.random()*19 + 67);
        int randomTwo = (int)(Math.random()* 19 + 67);


        System.out.println(randomOne);
        System.out.println(randomTwo);
        int number1 =  67;
        int number2 = 85;
         System.out.println(Math.max(randomOne,randomTwo));
         System.out.println(Math.min(randomOne,randomTwo));




    }
}
