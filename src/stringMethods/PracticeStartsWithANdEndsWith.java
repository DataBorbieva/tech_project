package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeStartsWithANdEndsWith {
    public static void main(String[] args) {
        String name = ScannerHelper.getAStringFromUser();
        System.out.println((name.startsWith("A") || (name.startsWith("a"))) ? "You are in the club A" : "You are in the club B");

        if (name.startsWith("A") || name.startsWith("a")) {
            System.out.println("You are in the club A");
        }else {
                System.out.println("You are in the club B");
        }

  /*
        Ask user to enter a name
        If the name starts with A or a, then print "You are in the club A"
        If the name does not start with A or a, print "You are not in the club A"

        alex -> You are in the club A
        Alex -> You are in the club A

        John -> You are not in the club A
         */

        String name1 = ScannerHelper.getAStringFromUser();

        if(name1.startsWith("a") || name1.startsWith("A")){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name1.toUpperCase().startsWith("A")){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name1.toLowerCase().startsWith("a")){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name1.charAt(0) == 'A' || name1.charAt(0) == 'a'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name1.toUpperCase().charAt(0) == 'A'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name1.toLowerCase().charAt(0) == 'a'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name1.charAt(0) == 65 || name1.charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name1.toUpperCase().charAt(0) == 65){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name1.toLowerCase().charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        System.out.println(name1.toLowerCase().startsWith("a") ? "You are in the club A" : "You are not in the club A");
    }








    }


