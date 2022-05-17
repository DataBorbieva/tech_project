package exercisesOnRecap;
import java.util.Scanner;
public class TernaryPractice {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("What is your balance?");
      System.out.println((scan.nextDouble()<50)?"You are poor":"You are not poor");
    }
}
