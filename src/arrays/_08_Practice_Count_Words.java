package arrays;

import utilities.CharacterHelper;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        System.out.println("Task-1 count spaces");
        String s1 = "Today is Tuesday";
        //System.out.println(Arrays.toString(s1.split(" ")));
        //System.out.println(s1.toCharArray().length);
        String[] s = s1.split(" ");
        System.out.println(s.length);

        System.out.println("Task 1 with for each loop");
        int countSpace = 0;
        for(char c : s1.toCharArray()){
            if( c == ' ') countSpace++;
        }
        System.out.println(countSpace+1);

        System.out.println("Task-2");
        String s2 = "Some countries I visited were Argentina, Belgium, and Malta";

        String[] words2 = s2.split(" ");
        int countA = 0;
        for(String word : words2){
            if(word.toLowerCase().startsWith("a")) countA++;
        }
        System.out.println(countA);
        }

        }




