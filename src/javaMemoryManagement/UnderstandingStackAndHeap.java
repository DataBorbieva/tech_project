package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {
        int age = 45;
        System.out.println(age);

        //reference (left side) - object type(right side)
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1); //javaMemoryManagement.Dog@1b6d3586
        System.out.println(dog2);//javaMemoryManagement.Dog@4554617c
        System.out.println(dog3);//javaMemoryManagement.Dog@74a14482

        dog1.bread = "puppy";
        dog1.age = 3;

    }
}
