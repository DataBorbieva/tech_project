package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love techGlobal");
        Matcher matcher1 = pattern.matcher(" ");

        System.out.println(matcher.matches()); //false , checks if given string matches given pattern
        System.out.println(matcher1.matches()); //true

        Pattern pattern1 = Pattern.compile("[a-z]{3,}");
        Matcher matcher2 = pattern.matcher("Hello");
        System.out.println(matcher2.matches()); //false


        System.out.println("--------");
        while(matcher.find()){ //find the next matched pattern in the given string
            System.out.println(matcher.group()); //print out the next matched pattern in the given string "o" and "o"
            System.out.println("start index " + matcher.start()); //returns int --> prints out where found pattern starts "o" - index 3
            System.out.println("end index " + matcher.end()); //returns int --> prints out where found pattern ends "o" - index 4
        }
    }
}
