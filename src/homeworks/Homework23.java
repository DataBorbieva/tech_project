package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {
    /*
    Requirement:
Write a method called as parseData() which takes a
String has some keys in {} and values after between }{
and returns a collection that has all the keys and values
as entries.
NOTE: The keys should be sorted!
Test Data:
{104}LA{101}Paris{102}Berlin{103}Chicago{100}Lon
don
Expected Output:
{100=London, 101=Paris, 102=Berlin, 103=Chicago,
104=LA}
     */
//Task-1
    public static Map<Integer, String> parseData(String data) {
        TreeMap<Integer, String> collection = new TreeMap<>();
        String[] newData = data.split("\\{");
        for (String newDatum : newData) {
            System.out.println(newDatum);
            if (!newDatum.isEmpty())
                //parse
                collection.put(Integer.valueOf(newDatum.substring(0, newDatum.indexOf('}'))), newDatum.substring(newDatum.indexOf('}') + 1));
        }
        return collection;
    }

/*
Requirement:
Write a method called as calculateTotalPrice1() which takes
a Map of some shopping items with their amounts and
calculates the total prices as double. Item prices are given
below
Apple = $2.00
Orange = $3.29
Mango = $4.99
Pineapple = $5.25
Test Data 1:
{Apple=3, Mango = 1}
Expected Output 1:
10.99
Test Data 2:
{Apple=2, Pineapple = 1, Orange=3}
Expected Output 2:
19.12
 */

    public static double calculateTotalPrice1(Map<String, Integer> gross) {
        double totalPrice = 0;
        Map<String, String> prices = new HashMap<>();
        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        prices.put("Pineapple", "$5.25");
        for (String product : gross.keySet())
            for (int i = 0; i < gross.get(product); i++)
                totalPrice += Double.parseDouble(prices.get(product).substring(1));
        return (double) Math.round(totalPrice * 100) / 100;
    }

/*
Requirement:
Write a method calculateTotalPrice2() which takes a Map of some
shopping items with their amounts and calculates the total prices as
double. Item prices are given below
Apple = $2.00
Orange = $3.29
Mango = $4.99
BUT there will be some discounts as below
There will be %50 discount for every second Apple
There will be 1 free Mango if customer gets 3. So, fourth one is free.
Test Data 1:
{Apple=3, Mango = 5}
Expected Output 1:
24.96
Test Data 2:
{Apple=4, Mango = 8, Orange=3}
Expected Output 2:
45.81
 */


    public static double calculateTotalPrice2(Map<String, Integer> gross) {
        double totalPrice = 0;
        int shoppingCartApple = 0;
        int shoppingCartMango = 0;
        Map<String, String> prices = new HashMap<>();
        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        prices.put("Pineapple", "$5.25");
        for (String product : gross.keySet()) {
            for (int i = 0; i < gross.get(product); i++) {
                if (product.equals("Apple") && i % 2 != 0)
                    totalPrice += Double.parseDouble(prices.get(product).substring(1)) * 0.50;
                else if (product.equals("Mango") && i % 4 == 3) continue;
                else totalPrice += Double.parseDouble(prices.get(product).substring(1));
            }
        }
        return (double) Math.round(totalPrice * 100) / 100;
    }




    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("Apple", 3);
        list.put("Mango", 5);
        System.out.println(calculateTotalPrice2(list));

    }

}
