package arrays;

import java.util.Arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {
        String[] colors ={ " red", "blue", "yellow", "white"};

        String biggerWord = "";
        for (String color : colors) {
            if(color.length() > biggerWord.length()) biggerWord = color;

        }
        System.out.println(biggerWord);
        }




    }

