package collectionsFramework;

import java.util.*;

public class Map_Methods {
    public static void main(String[] args) {
        HashMap<String,String> favorites = new HashMap<>();
        favorites.put("Day","Friday");
        favorites.put("Color","Black");
        favorites.put("City","Chicago");
        favorites.put("Car","Lexus");
        favorites.put("Pet","Turtle");
        System.out.println(favorites.keySet());//[Car, Color, City, Day, Pet] --keys
        //Keys are unique and they are stored in SET, because Set does not allow duplicates
        Set<String> keys = favorites.keySet();
        System.out.println(keys); //[Car, Color, City, Day, Pet]

        System.out.println(favorites.values()); //[Lexus, Black, Chicago, Friday, Turtle] --values
        Collection<String> values = favorites.values();
        System.out.println(values); //[Lexus, Black, Chicago, Friday, Turtle]

        System.out.println(values.stream().filter(element -> element.length() > 5).count()); //3 values with length more than 5
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count()); //3 keys which starts with "c"

        System.out.println(favorites.entrySet()); //[Car=Lexus, Color=Black, City=Chicago, Day=Friday, Pet=Turtle]
        Set<Map.Entry<String,String>> entries = favorites.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //for (Map.Entry entry : entries) //or without <String, String>
            System.out.println(entry);
            /*
        Car=Lexus
        Color=Black
        City=Chicago
        Day=Friday
        Pet=Turtle

             */

            System.out.println("My favorite " + entry.getKey() + " is = " + entry.getValue());
            /*
            My favorite Caris = Lexus
            My favorite Coloris = Black
            My favorite Cityis = Chicago
            My favorite Dayis = Friday
            My favorite Petis = Turtle
             */
        }

        favorites.remove("Day");
        favorites.remove("Pet","Turtle");
        favorites.replace("Car","Tesla");
        System.out.println(favorites.containsValue("Tesla")); //true
        System.out.println(favorites.containsKey("ice-Cream")); //false


        System.out.println(favorites); //{Car=Tesla, Color=Black, City=Chicago}


    }
}
