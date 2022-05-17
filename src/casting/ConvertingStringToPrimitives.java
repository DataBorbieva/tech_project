package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        String num1 = "23";
        String num2 = "12";



        //23 +12 = 35
        System.out.println(num1 + num2); //2312

        int num1Int = Integer.parseInt(num1);//String --> int
        int num2Int = Integer.parseInt(num2); //returns primitive

        System.out.println(num1Int+num2Int); //35

        Integer num1Integer = Integer.valueOf(num1);//returns wrapper class
        Integer num2Integer = Integer.valueOf(num2);//String --> Integer
        System.out.println(num1Integer+num2Integer); //35


        int num1UntValueOf = Integer.valueOf(num1); //String --> Integer --> int

    }
}
