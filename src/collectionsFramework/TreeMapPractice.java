package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<String,Integer> ages = new TreeMap<>();
        ages.put("Kaly",17);
        ages.put("Torie",20);
        ages.put("Alona",15);
        ages.put("andrei",15);
       // ages.put(null,15);  //NullPointerException -->We can not have null as KEY in TReeMap
        System.out.println(ages);
        System.out.println(ages.get("andrei")); //15

    }
}
