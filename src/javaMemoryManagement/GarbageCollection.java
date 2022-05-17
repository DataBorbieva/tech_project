package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("\n---------Object references before losing reference----------");
        System.out.println(dog1); //javaMemoryManagement.Dog@1b6d3586
        System.out.println(dog2); //javaMemoryManagement.Dog@4554617c
        System.out.println(dog1.equals(dog2)); //false

        System.out.println("\n---------Object references after losing reference----------");

        dog1=dog2; // dog1 is loosing reference here and garbage collected

        //explicitly doing Garbage Collection
        System.gc();
        Runtime.getRuntime().gc();

        /*
        A dog object is garbage collected
        The object is =========== 1482143165
         */ //in CONSOLE





        System.out.println(dog1); //javaMemoryManagement.Dog@4554617c
        System.out.println(dog2); //javaMemoryManagement.Dog@4554617c
        System.out.println(dog1.equals(dog2)); //true

    }
}
