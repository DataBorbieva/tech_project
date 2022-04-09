package homeworks;

import sun.reflect.generics.tree.FieldTypeSignature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {
        /*
                Requirement:
        -Create an ArrayList and store below numbers
        10, 23, 67, 23, 78
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 2
        -Print the entire list
        Expected Result:
        23
        10
        67
        [10, 23, 67, 23, 78]
         */

        System.out.println("-----Task-1-----");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers); //[10, 23, 67, 23, 78]


        System.out.println("\n-----Task-2-----");
        /*
                Requirement:
        -Create an ArrayList and store below colors
        Blue, Brown, Red, White, Black, Purple
        THEN:
        -Print element at index of 1
        -Print element at index of 3
        -Print element at index of 5
        -Print the entire list
        Expected Result:
        Brown
        White
        Purple
        [Blue, Brown, Red, White, Black, Purple]
                 */
        List<String> colors = new ArrayList<>();
        colors.add("Blue"); colors.add("Brown");
        colors.add("Red"); colors.add("White");
        colors.add("Black"); colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n-----Task-3-----");
        /*
                Requirement:
        -Create an ArrayList and store below numbers
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire list
        -Print the entire list sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
         */
        Integer[] numbersT3Arr = {23, -34, -56, 0, 89, 100};
    //  Arrays.sort(numbersT3Arr);
        ArrayList<Integer> numbersT3 = new ArrayList<>();
        numbersT3.addAll(Arrays.asList(numbersT3Arr)); //converting array to an ArrayList
        System.out.println(Arrays.toString(numbersT3Arr));
        Collections.sort(numbersT3); //sorting an ArrayList
        System.out.println(numbersT3);

        System.out.println("\n-----Task-4-----");
        /*
                Requirement:
        -Create an ArrayList and store below cities
        Istanbul, Berlin, Madrid, Paris
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        Expected Result:
        [Istanbul, Berlin, Madrid, Paris]
        [Berlin, Istanbul, Madrid, Paris]
                 */
        String[] citiesT4Arr = {"Istanbul", "Berlin", "Madrid", "Paris"};
        List<String> citiesT4 = new ArrayList<>(Arrays.asList(citiesT4Arr));
        System.out.println(citiesT4); // [Istanbul, Berlin, Madrid, Paris]
        Collections.sort(citiesT4);
        System.out.println(citiesT4); //[Berlin, Istanbul, Madrid, Paris]

        System.out.println("\n-----Task-5-----");
        /*
                Requirement:
        -Create an ArrayList and store Marvel characters below
        Spider Man, Iron Man, Black Panter, Deadpool, Captain
        America
        THEN:
        -Print the entire list
        -Then, check if it contains Wolwerine
        if it contains Wolwerine, then print true
        if it does not contain Wolwerine, print false
        Expected Result:
        [Spider Man, Iron Man, Black Panter, Deadpool, Captain
        America]
        false
         */
        String[] marvelArr = {"Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"};
        List<String> marvelList = new ArrayList<>(Arrays.asList(marvelArr));
        System.out.println(marvelList);
        System.out.println(marvelList.contains("Wolwerine")); //false

        System.out.println("\n-----Task-6-----");
        /*
                Requirement:
        -Create an ArrayList and store Avengers
        characters below
        Hulk, Black Widow, Captain America, Iron Man
        THEN:
        -Print the entire list sorted lexicographically
        -Then, check if it contains Hulk and Iron Man
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Black Widow, Captain America, Hulk, Iron Man]
        true
         */
        String[] marvelArrT6 = {"Hulk", "Black Widow", "Captain America", "Iron Man"};
        List<String> marvelListT6 = new ArrayList<>(Arrays.asList(marvelArrT6));
        Collections.sort(marvelListT6);
        System.out.println(marvelListT6);
        System.out.println((marvelListT6.contains("Hulk") && marvelListT6.contains("Iron Man"))); //true

        System.out.println("\n-----Task-7-----");
        /*
                Requirement:
        -Create an ArrayList and store characters below
        A, x, $, %, 9, *, +, F, G
        THEN:
        -Print the entire list
        -Print each element
        Expected Result:
        [A, x, $, %, 9, *, +, F, G]
        A
        x
        $
        %
        9
        *
        +
        F
        G
         */
        Character[] charsArr = {'A','x','$','%','9','*','+','F','G'};
        List<Character> characterList = new ArrayList<>(Arrays.asList(charsArr));
        System.out.println(characterList);
        for (Character character : characterList) {
            System.out.println(character);
        }


        System.out.println("\n-----Task-8-----");
        /*
                Requirement:
        -Create an ArrayList and store below objects
        Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        -Count objects that starts with M or m
        -Count objects that does not have A or a or E or e
        Expected Result:
        [Desk, Laptop, Mouse, Monitor, Mouse-Pad,
        Adapter]
        [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-
        Pad]
        3
        1
         */
        String[] devices = {"Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"};
        List<String> devicesList = new ArrayList<>(Arrays.asList(devices));
        System.out.println(devicesList);//[Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
        Collections.sort(devicesList);
        System.out.println(devicesList); //[Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]

        int countStartsWithM = 0;
        int countDoesNotHaveAOrE = 0;
        for (String s : devicesList) {
            if(s.startsWith("M") || s.startsWith("m")) countStartsWithM++;

            if(!s.toLowerCase().contains("a") && !s.toLowerCase().contains("e")) countDoesNotHaveAOrE++;
        }
        System.out.println(countStartsWithM);
        System.out.println(countDoesNotHaveAOrE);

        System.out.println("\n-----Task-9-----");
       /* Requirement:
        -Create an ArrayList and store below kitchen
        objects
                Plate, spoon, fork, Knife, cup, Mixer
        THEN:
        -Print the entire list
                -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements has P or p
                -Print how many elements starts or ends with P
        or p
        Expected Result:
[Plate, spoon, fork, Knife, cup, Mixer]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 3
        Elements having P or p= 3
        Elements starting or ending with P or p
*/
        String[] kitchen = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        List<String> kitchenList = new ArrayList<>(Arrays.asList(kitchen));
        System.out.println(kitchenList);
        int countStartsWithUpp = 0;
        int countStartsWithLow = 0;
        int countHowManyHasPOrp = 0;
        int countHowManyStartsAndEndsWithPOrp  = 0;
        for (String s : kitchenList) {
            if (Character.isUpperCase(s.charAt(0))) countStartsWithUpp++;
            else if (Character.isLowerCase(s.charAt(0))) countStartsWithLow++;

            if(s.toLowerCase().contains("p")) countHowManyHasPOrp++;
           if (s.toLowerCase().endsWith("p") || s.toLowerCase().startsWith("p")) countHowManyStartsAndEndsWithPOrp++;
        }
        System.out.println("Elements starts with uppercase = " +countStartsWithUpp);
        System.out.println("Elements starts with lowercase = " + countStartsWithLow);
        System.out.println("Elements having P or p = " + countHowManyHasPOrp);
        System.out.println("Elements starting or ending with P or p = " + countHowManyStartsAndEndsWithPOrp); //2

        System.out.println("\n-----Task-10-----");
        /*
                Requirement:
        -Create an ArrayList and store below numbers
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire list
        -Print how many element can be divided by 10
        -Print how many even numbers are greater than
        15
        -Print how many odd numbers are less than 20
        -Print how many elements are less than 15 or
        greater than 50
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that can be divided by 10 = 4
        Elements that are even and greater than 15 = 3
        Elements that are odd and less than 20 = 4
        Elements that are less than 15 or greater than 50
        = 8
                 */

        Integer[] numbersT10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        List<Integer> numbersT10List = new ArrayList<>(Arrays.asList(numbersT10));
        System.out.println(numbersT10List);
        int dividable10 = 0;
        int evenGreater15 = 0;
        int oddsLess20 = 0;
        int less15OrMore50 = 0;
        for (Integer integer : numbersT10List) {
            if (integer % 10 == 0) dividable10++;
            if ((integer % 2 == 0 ) && integer > 15) evenGreater15++;
            if ((integer % 2 == 1) && integer < 20) oddsLess20++;
            if(integer < 15 || integer > 50)  less15OrMore50 ++;

        }
        System.out.println("Elements that can be divided by 10 = " + dividable10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + oddsLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15OrMore50);
        }

    }

