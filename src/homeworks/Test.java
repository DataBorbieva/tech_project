package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
 //Task-1 HW 16 TEST
        System.out.println(Homework16.countWords("My outfit is pretty")); //4
        //Task-2 HW 16 TEST
        System.out.println(Homework16.countA("DATKAIYM Data")); //4
        //Task-3 HW 16 TEST
       Integer[] nums = {-45, 0, 0, 34, 5, 67};
        ArrayList<Integer> numbers = new ArrayList(Arrays.asList(nums));
        System.out.println(Homework16.countPos(numbers));
        //Task-4 HW 16 TEST
        Integer[] numsT4 = {10, 20, 35, 20, 35, 60, 70, 60};
        ArrayList<Integer> numbersT4 = new ArrayList(Arrays.asList(numsT4));
        System.out.println(Homework16.removeDuplicateNumbers(numbersT4));
        System.out.println("\nTask-5");
        String[] words = {"java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"};
        ArrayList<String> wordsT5 = new ArrayList<>(Arrays.asList(words));
        System.out.println(Homework16.removeDuplicateElements(wordsT5)); //[“java”, “C#”, “ruby”, “JAVA”,  “C++”]
        System.out.println("\nTask-6");
        String strT6 = "   I   am      learning     Java      ";
        System.out.println(Homework16.removeExtraSpaces(strT6));
    }
}
