package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1 = "Taylor";
        String name2 = "Alona";

        System.out.println(StringHelper.getMiddle(name1)); //yl  because even number of name
        System.out.println(StringHelper.getMiddle(name2)); //o  because odd number of name
        System.out.println(StringHelper.getMiddle("Guluzar")); //u
        System.out.println(StringHelper.getMiddle("Alexandr")); //xa
    }
}
