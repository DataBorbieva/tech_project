package javaMemoryManagement;

public class StringExample {
    public static void main(String[] args) {
        //first way to create String
        String str1 = "John";
        //second way
        String str2 =  new String("Alex");

        String str3 = "Alex";
        String str4 = "John";

        System.out.println(str1==str4); //true //== sign is comparing their location only
        System.out.println(str2==str3); //false //== sign is only checks those Strings location only
        System.out.println(str2.equals(str3)); //true -> equals String method
    }
}
