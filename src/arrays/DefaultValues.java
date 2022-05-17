package arrays;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {

        String[] s = new String[5];
        System.out.println(Arrays.toString(s)); //[null, null, null, null, null]

        int[] ints = new int[5];
        System.out.println(Arrays.toString(ints)); //[0, 0, 0, 0, 0]

        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles)); //[0.0, 0.0, 0.0, 0.0, 0.0]

        boolean[] booleans = new boolean[5];
        System.out.println(Arrays.toString(booleans)); //[false, false, false, false, false]

        char[] chars = new char[5];
        System.out.println(Arrays.toString(chars)); //[ ,  ,  ,  ,  ]

    }
}









