package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("Foo");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add("John");
        words.add(null);
        System.out.println(words); //[Foo, Bar, foo, BAR, null, John]
        //we use it when we need insertion order, but no duplicates, and no methods with indexes as arguments
    }
}
