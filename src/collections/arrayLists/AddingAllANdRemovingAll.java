package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllANdRemovingAll {
    public static void main(String[] args) {
        System.out.println("Task-1");
        ArrayList<String> germanCars =  new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        System.out.println("German cars = " + germanCars); //[BMW, Mercedes, Volkswagen]

        System.out.println("\n\nTask-2");
        ArrayList<String> japanCars =  new ArrayList<>();
        japanCars.add("Honda");
        japanCars.add("Toyota");
        japanCars.add("Lexus");
        System.out.println("Japan cars = " + japanCars);

        System.out.println("\n\nTask-3");
        ArrayList<String> luxuryCars =  new ArrayList<>();
        luxuryCars.add("Maseratti");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");
        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("\n -------------Put all together------------");
        ArrayList<String> inventory = new ArrayList<>();
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);
        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);
        inventory.addAll(3,japanCars); //or inventory.adAll(germanCars.size, japanCars)
        System.out.println("Inventory after adding japan cars = " + inventory);


        System.out.println("\n -------------Remove ------------");
        inventory.removeAll(japanCars);
        System.out.println("Inventory after roremoving japanese cars = " + inventory);

        System.out.println("\n -------------Remove Tesla, Audi, BMW------------");
        inventory.remove("Tesla");
        inventory.remove(0);
    }
}
