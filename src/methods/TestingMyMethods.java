package methods;
import utilities.MyMethods;
public class TestingMyMethods {
    public static void main(String[] args) {
        int num1 = 2, num2 = 6, num3 =3, num4=9;
        //task is to write a program which is going to print the max of 4 numbers
        System.out.println(Math.max(Math.max(Math.max(num1,num2),num3),num4));

        //Same thing with our new method just print out
        MyMethods.printMaxOf4(num1,num2,num3,num4);

        // another method that is have return
        System.out.println(MyMethods.findMaxOf4(num1,num2,num3,num4));

        //write a program which is finding the abs difference between max and num1
        Math.abs(Math.max(Math.max(Math.max(num1,num2),num3),num4)-num1);
        Math.abs(MyMethods.findMaxOf4(num1,num2,num3,num4)-num1);
    }
}
