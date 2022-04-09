package oop_principles.class_objects;

public class AppleTest {
    public static void main(String[] args) {
        //Create 2 Apple objects
       Apple apple1 = new Apple();
       apple1.color = "Red";
       apple1.taste= "Sweet";
       apple1.price = 0.99;
      //  System.out.println(apple1); //oop_principles.class_objects.Apple@1b6d3586

        System.out.println(apple1.color); //Red
        System.out.println(apple1.taste); //Sweet
        System.out.println(apple1.price); //0.99

        Apple apple2 = new Apple();
        apple2.color = "Green";
        System.out.println(apple1); //oop_principles.class_objects.Apple@1b6d3586
        System.out.println(apple2.color); //Green
        //System.out.println(apple2.color); //null
        System.out.println(apple2.price); //0.0
        apple2.price = 1.29;

    }
}
