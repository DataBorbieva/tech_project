package javaMemoryManagement;

import java.util.ArrayList;
import java.util.Arrays;

public class StackAndHeapForArrayAndArrayList {
    public static void main(String[] args) {


        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Alex";
        names[2] = "Kaly";

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList = null;
        ArrayList<String> newList = namesList;
        names[0] = "";

        System.out.println(names); //[Ljava.lang.String;@1b6d3586
        System.out.println(namesList); //[John, Alex, Kaly]

    }
}