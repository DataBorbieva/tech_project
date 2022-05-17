package oop_principles.class_objects;

public class Fruit {
    //Instance variables
    public static boolean hasColor;
    public String name;
    public String shape;
    public boolean isSweet;

    static {
        System.out.println("This is static block");
        hasColor = true;

    }

    {
        System.out.println("This is instance block");
        shape = "Round";
        isSweet = true;

    }
}