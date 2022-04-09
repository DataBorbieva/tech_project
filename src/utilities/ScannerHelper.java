package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number?");
        int number = scan.nextInt();
        scan.nextLine();
        return number ;
    }

    public static String getAStringFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string ?");
        String name = scan.nextLine();
        return name;

    }

    public static String get4Colors() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 colors");
        String color1 = scan.nextLine();
        String color2 = scan.nextLine();
        String color3 = scan.nextLine();
        String color4 = scan.nextLine();
        return color1 + color2 + color3 + color4;


    }


    }

