package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework20 {
    public static void main(String[] args) {
        System.out.println("Task - 1");
        System.out.println(hasLowerCase("JaVA QW123i")); //true
        System.out.println("\n\nTask - 2");
        System.out.println(noZero(new ArrayList(Arrays.asList(0, 3, 4, 6,0, 7)))); //[3, 4, 6, 7]
        System.out.println("\n\nTask - 3");
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 2, 1}))); //[[0, 0], [3, 9], [2, 4], [1, 1]]

    }
/*
Requirement:
-Create a method called hasLowerCase()
-This method will take a String argument, and it will
return boolean true if there is lowercase letter and false
if it doesn’t.
 */

    //Task-1
    public static boolean hasLowerCase(String str) {
        boolean hasLowCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) hasLowCase = true;

        }

        return hasLowCase;
    }

/*
Requirement:
-Create a method called noZero()
-This method will take one Integer ArrayList argument
and it will return an ArrayList with all zeros removed
from the original Integer ArrayList.
NOTE: Assume that ArrayList size will be at least 1.
Test Data 1: [1]
Expected Result 1: [1]
Test Data 2: [1, 1, 10]
Expected Result 2: [1, 1, 10]
Test Data 3: [0, 1, 10]
Expected Result 3: [1, 10]
Test Data 4: [0, 0, 0]
Expected Result 4: []
 */
//Task-2
    public static ArrayList <Integer> noZero(ArrayList <Integer> numbers){
        ArrayList <Integer> numbersWithoutZero =  new ArrayList<>();
        for (Integer num : numbers) {
            if(num != 0) numbersWithoutZero.add(num);

        }
   return numbersWithoutZero;
    }


/*
Requirement:
-Create a method called numberAndSquare()
-This method will take an int array argument and it will
return a multidimensional array with all numbers
squared.
NOTE: Assume that array size is at least 1.
Test Data 1: [1, 2, 3]
Expected Result 1: [[1, 1], [2, 4], [3, 9]]
Test Data 2: [0, 3, 6]
Expected Result 2: [[0, 0], [3, 9], [6, 36]]
Test Data 3: [1, 4]
Expected Result 3: [[1,1], [4, 16]]
 */

    //Task-3
    public static int[][] numberAndSquare(int[] numbers) {

        int[][] newNumbers = new int[numbers.length][]; //creating multidimensional array by [][] and first [] = numbers.length
        for (int i = 0; i < numbers.length; i++) {     //loop through each number in numbers array

            int[] arr1 = {numbers[i], numbers[i] * numbers[i]};
            newNumbers[i] = arr1;

        }
        return newNumbers;
    }

/*
Requirement:
-Create a method called containsValue()
-This method will take a String array and a String
argument, and it will return a boolean. Search the
variable inside of the array and return true if it exists in
the array. If it doesn’t exist, return false.
NOTE: Assume that array size is at least 1.
NOTE: The method is case-sensitive
Test Data 1: [“abc”, “foo”, “java”], “hello”
Expected Result 1: false
Test Data 2: [“abc”, “def”, “123”], “Abc”
Expected Result 2: false
Test Data 3: [“abc”, “def”, “123”, “Java”, “Hello”], “123”
Expected Result 3: true
Hint: Use binarySearch() for easy solution
 */

//Task-4
public static boolean containsValue(String[] str, String s) {
    for (String s1 : str) {
        if (s.equals(s1)) return true;
    }
    return false;
}

/*
Requirement:
-Create a method called reverseSentence()
-This method will take a String argument and it will
return a String with changing the place of every word.
All words should be in reverse order. Make sure that there
are two words inside the sentence at least. If there is no
two words return “There is not enough words!”.
NOTE: After you reverse, only first letter must be
uppercase and the rest will be lowercase!
Test Data 1: “Hello”
Expected Result 1: “There is not enough words!”
Test Data 2: “Java is fun”
Expected Result 2: “Fun is java”
Test Data 3: “This is a sentence”
Expected Result 3: “Sentence a is this”
Hint: Use split() for easy solution
Note: Make the new first word’s first letter upper case
and make the old first word’s first letter lower c
 */

    //Task-5
    public static String reverseSentence(String str) {
        String[] strArr = str.trim().split(" ");
        StringBuilder strNew = new StringBuilder();
        if (!str.trim().contains(" ")) return "There is not enough words!";
        for (int i = strArr.length - 1; i >= 0; i--) {
            strNew.append(strArr[i].toLowerCase() + " ");  //append() is e method for concatenation
        }
        return strNew.substring(0, 1).toUpperCase().concat(strNew.substring(1)).trim();
    }
  /*  Requirement:
            -Create a method called removeStringSpecialsDigits()
-This method will take a String as argument, and it will
return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.
    Test Data 1: “123Java #$%is fun”
    Expected Result 1: “Java is fun”
    Test Data 2: “Selenium”
    Expected Result 2: “Selenium”
    Test Data 3: “Selenium 123#$%Cypress”
    Expected Result 3: “Selenium Cypress”

*/
//Task-6
  public static String removeStringSpecialsDigits(String str) {
      //if it is not Digit and not Special return it in new string container 

      return str = str.replaceAll("[^a-zA-Z ]", "");
  }



  /*
  Requirement:
-Create a method called removeArraySpecialsDigits()
-This method will take a String array as argument, and
it will return a String array without the special
characters or digits from the elements.
NOTE: Assume that array size is at least 1.
Test Data 1: [“123Java”, “#$%is”, “fun”]
Expected Result 1: [“Java”, “is”, “fun”]
Test Data 2: [“Selenium”, “123$%”, “###”]
Expected Result 2: [“Selenium”, “”, “”]
Test Data 3: [“Selenium”, “123#$%Cypress”]
Expected Result 3: [“Selenium”, “Cypress”]
   */

    //Task-7
    public static String[] removeArraySpecialsDigits(String[] str) {

        for (int i = 0; i < str.length; i++) str[i] = removeStringSpecialsDigits(str[i]);

        return str;
    }

  

  /*
  Requirement:
-Create a method called removeAndReturnCommons()
-This method will take two String ArrayList and it will
return all the common words as String ArrayList.
NOTE: Assume that both ArrayList sizes are at least 1.
Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
Expected Result 1: []
Test Data 2: [“Java”, “is”, “fun”], [“Java”, “C#”,
“Python”]
Expected Result 2: [“Java”]
Test Data 3: [“Java”, “C#”, “C#”], [“Python”, “C#”, “C+
+”]
Expected Result 3: [“C#”]
   */
//Task-8
  public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2) {
      ArrayList<String> newStr = new ArrayList<>();
      for (String s1 : str1) {
          for (String s2 : str2) {
              if (s1.equals(s2) && !newStr.contains(s1)) newStr.add(s1);
          }
      }
      return newStr;
  }


  /*
  Requirement:
-Create a method called noXInVariables()
-This method will take an ArrayList argument, and it will
return an ArrayList with all the x or X removed from
elements.
If the element itself equals to x or X or contains only x
letters, then remove that element.
NOTE: Assume that ArrayList size is at least 1.
Test Data 1: [abc, 123, #$%]
Expected Result 1: [abc, 123, #$%]
Test Data 2: [xyz, 123, #$%]
Expected Result 2: [yz, 123, #$%]
Test Data 3: [x, 123, #$%]
Expected Result 3: [123, #$%]
Test Data 4: [xyXyxy, Xx, ABC]
Expected Result 4: [yyy, ABC]
   */
  //TAsk-9
    public static ArrayList<String> noXInVariables2(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).toLowerCase().contains("x")){
                arrayList.set(i, arrayList.get(i).replaceAll("[xX]", ""));
            }
        }
        arrayList.removeIf(String::isEmpty);
        return arrayList;
    }


}