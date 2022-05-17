package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[a-z]+","hello")); //true --> contains one or more letters
        System.out.println(Pattern.matches("[a-z]+","1")); //false
        System.out.println(Pattern.matches("[a-z]","hello")); //false
        System.out.println(Pattern.matches("[a-z]+","hello my name is Data I love techGlobal")); //false
        System.out.println(Pattern.matches("[a-zA-Z]{3,}","hello class")); //false, because there is a space
        System.out.println(Pattern.matches("[a-zA-Z ]{3,}","hello class")); //true, because we added a space [in curly braces]



            System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "TechGlobal-_1")); //true
            System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "TechGlobal  -_1")); //false
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(909)-444-3330"));//true
        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(929)-444-330"));//false
        System.out.println(Pattern.matches("\\([1-9][0-9]{2}\\)-[1-9][0-9]{2}-[\\d]{4}", "(708)-456-7890")); //true





    }
}
