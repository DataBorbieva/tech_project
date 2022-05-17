package stringMethods;

public class _10_substring {
    public static void main(String[] args) {
        /*
        Method Task: They are used to extract a substring from a larger string
        They are non-static
        They are return type , and they return another string
        there are 2 overloaded substring methods
        1.substring(int beginIndex)
        -this method task begin index as an argument and it extracts a substring starting from given index
        to the end
        2.substring(int beginIndex, int endIndex)
        - this method will take 2 args to define which index to start and which index to stop to extract a substring
        NOTE: beginIndex is inclusive but endIndex is exclusive
        NOTE: if your beginIndex is equal to endIndex, then it will return empty string
        NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException
         */

        String result = "About 3,520,000,000 results (0.82 seconds)";
        String num = result.substring(6,18); //3,520,000,00
        System.out.println(num);
        //its wrong , because it takes index, we should do 19
        String num1 = result.substring(6,19); //3,520,000,000
        System.out.println(num1);

        System.out.println(result.substring(28,42));
        System.out.println(result.substring(28)); // we can do like this the start point only, if the word is in the end
        System.out.println(result.substring(result.indexOf('('))); // we can do  with indexOf()
        System.out.println(result.substring(result.lastIndexOf('('))); // we can do  with indexOf()
        System.out.println(result.substring(result.lastIndexOf('0')-1)); // we can do  with indexOf()
        System.out.println(result.substring(result.length()-14)); // we can do  with indexOf()
        System.out.println(result.substring(result.indexOf("results")+8)); // we can do  with indexOf()

       String name3 = "Lionel";
      //  System.out.println(name3.substring(3,1)); // we can not do that
    }
}
