package stringMethods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /*
        METHOD TASK: They are used to find the index or last index of some char or String values in another String
        -non-static methods and called with another String object
        -return type and they return int as index
        - take either String or char as arguments

        NOTE: if the given char or String does not exist , then they return -1
        NOTE: if you are looking for an index of String, and it exists, it will return the first index of found match
        EXAMPLE: sentence.indexOf("Chicago"); // 7
         */
        String sentence = "I like Chicago and Miami more than any other cities";
        System.out.println(sentence.indexOf('C')); //7 indexes, because it starts with 0
        System.out.println(sentence.indexOf('c')); //10 indexes
        System.out.println(sentence.lastIndexOf('c')); //45 indexes


        sentence.indexOf("Chicago"); // 7
        sentence.indexOf("chicago"); // -1 , because lowercase chicago doesnt exist in sentence
        sentence.indexOf("Miami"); //19
        System.out.println(sentence.indexOf("")); //0 empty"" is 0
        sentence.indexOf('C', 50); // -1
    }
}
