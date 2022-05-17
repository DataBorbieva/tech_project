package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {
        String s = "Banana is nice";
        String[] sSplitFromSpaces = s.split(" "); // it divides in to array and space is lost
        System.out.println(Arrays.toString(sSplitFromSpaces)); //[Banana, is, nice]

        String[] sSplitFromI = s.split("i");
        System.out.println(Arrays.toString(sSplitFromI)); //[Banana , s n, ce]

        String[] sSplitFromA = s.split("a");
        System.out.println(Arrays.toString(sSplitFromA)); //[B, n, n,  is nice]
    }
}
