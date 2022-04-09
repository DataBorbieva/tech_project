package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {
        String s = "Java";
        char[] charsJava = s.toCharArray(); //{'J','a','v','a'}
        System.out.println(Arrays.toString(s.toCharArray()));  //[J, a, v, a]
        System.out.println(Arrays.toString("Hello".toCharArray())); //[H, e, l, l, o]

        int countA = 0;
        for(char element : charsJava) {
            if(element == 'a') countA++;
        }
        System.out.println(countA);

    }
}
