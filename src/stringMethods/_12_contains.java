package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
    public static void main(String[] args) {
        /*
        Method Task: It is used to find out if the String contains another string or character
        It is non - static
        It is retrun type method and returns boolean
        It takes a String argument
         */
    String s = "Good morning";
        System.out.println(s.contains("Good"));//true
        System.out.println(s.contains(""));//true
        System.out.println(s.contains("123"));//false
        System.out.println(s.contains(s));//true

        String address = ScannerHelper.getAStringFromUser();
        System.out.println((address.contains("Chicago")||address.contains("chicago")||address.contains("CHICAGO")) ?
                "You are in the club " : "You are not in the club");


        /*
        Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"

        Chicago, CHICAGO, cHIcaGO

        123 abc st, chicago IL 12345 -> You are in the club
        123 abc st, CHicagO IL 12345 -> You are in the club
        123 abc st, Des Plaines IL 12345 -> You are not in the club
        2*2*2*2
         */

        String address1 = ScannerHelper.getAStringFromUser();

        if(address1.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");


        if(address1.toUpperCase().contains("CHICAGO")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");

        System.out.println(address1.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
        System.out.println(address1.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");
    }
}








