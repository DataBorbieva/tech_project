package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Ukraine","Kiev");
        capitals.put("Spain","Madrid");
        capitals.put("Portugal","Lisbon");
        capitals.put("Italy","Roma");
        capitals.put("US","DC");
        capitals.put("Canada","Ottawa");
        capitals.put("Canada","Ottawa");
        System.out.println(capitals); //{Canada=Ottawa, Ukraine=Kiev, Italy=Roma, Portugal=Lisbon, US=DC, Spain=Madrid}
        System.out.println(capitals.get("JJJ")); //null
        System.out.println("--------------------------\n\n");

        LinkedHashMap<String, String> capitals1 = new LinkedHashMap<>();
        capitals1.put("Ukraine","Kiev");
        capitals1.put("Spain","Madrid");
        capitals1.put("Portugal","Lisbon");
        capitals1.put("Italy","Roma");
        capitals1.put("US","DC");
        capitals1.put("Canada","Ottawa");
        capitals1.put("Canada","Ottawa");
        capitals1.put(null,null);         // --->> allows null
        System.out.println(capitals1);
        System.out.println("--------------------------\n\n");

        TreeMap<String, String> capitals2 = new TreeMap<>();
        capitals2.put("Ukraine","Kiev");
        capitals2.put("Spain","Madrid");
        capitals2.put("Portugal","Lisbon");
        capitals2.put("Italy","Roma");
        capitals2.put("US","DC");
        capitals2.put("Canada","Ottawa");
       capitals2.put("Canada","Ottawa");
    //   capitals2.put(null,null);   // NUllPointerException, keys can not be null
        System.out.println(capitals2);
        System.out.println(capitals2.get("Canada"));

        System.out.println("-------------Understanding HashMap-------------\n\n");
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1,"Alona");
        students.put(2,"Abdullah");
        students.put(3,"Abdullah");
        students.put(4,"Data");
        students.put(null,"John");
        students.put(null,"Rami"); //-->> keys can not be duplicate ,and we replacing JOhn with Rami
        System.out.println(students);
        System.out.println(students.size()); //5
        students.put(1,"Daria");
        students.put(3,null);
        students.put(null,null); //--> Rami replaced with null, and size is not changing because we are just updating the element with null key
        System.out.println(students); //{null=null, 1=Daria, 2=Abdullah, 3=null, 4=Data}
        System.out.println(students.get(3)); //null


    }
}
