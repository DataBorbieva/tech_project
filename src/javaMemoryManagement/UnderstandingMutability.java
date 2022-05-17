package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city = "Chicago";
        String address = "Chicago";

        System.out.println(city == address); // true - not proper , because it checks their location

        city = "Miami";
        System.out.println(city); //Miami
        System.out.println(address); //Chicago
    }
}
