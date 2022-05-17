package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

        List<String> objectsSame = new ArrayList<>();
      /*  int same=0;
        String s = "";
        for (int i = 0; i < objects.size() ; i++) {
            for (int j = i+1; j < objects.size(); j++)
        if (objects.get(i).equals(objects.get(j))) s+= same++;
            System.out.println(same);
            objectsSame.add(s);
            objects.remove(objectsSame);

            {
                System.out.println(objects);
        }*/
        for (String object : objects) {
            if (!objectsSame.contains(object)) objectsSame.add(object);
        }
        System.out.println(objectsSame);
        }
    }

