package methods;
import utilities.MathHelper;
public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {
       // System.out.println(Math.max(5,1,3); --> compiler error
        int max = MathHelper.maxOfThree(5,1 , 10);
        System.out.println("Max of three numbers = " + max);

        double max2 = MathHelper.maxOfThree(1.1,2.5,4.4);
        System.out.println(max2);

        byte b1 = (byte)(Math.random()*10);
        byte b2 = (byte)(Math.random()*10);
        byte b3 = (byte)(Math.random()*10);
        System.out.println("Random 1 = " + b1);
        System.out.println("Random 1 = " + b2);
        System.out.println("Random 1 = " + b3);
        System.out.println(MathHelper.minOfThree(b1,b2,b3));
    }
}
