package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.replaceAll("[aeiouAEIOU]","");
        System.out.println(str); //Hll Wrld --> we removed all the vowels


        System.out.println("--------------");
        String str1 = "Hello World";
        str1 = str1.replaceAll("[aeiouAEIOU]","\\$");
        System.out.println(str1); //H$ll$ W$rld

        System.out.println("\n--------------");
        String str2 = "hello123world";
        str2 = str2.replaceAll("[0-9]","");
        System.out.println(str2); //helloworld

        System.out.println("\n--------------");
        String str3 = "abc 123 $#^ ()!!!";
       /* str3 = str3.replaceAll(" ", "");
        str3 = str3.replaceAll("\\$","");
        str3 = str3.replaceAll("\\#","");
        str3 = str3.replaceAll("\\^",""); */
        str3 = str3.replaceAll("[\\$#^ ]",""); //abc123()!!! not dynamic
        System.out.println(str3); //abc123
        System.out.println(str3.replaceAll("[^a-zA-Z0-9]", "")); // abc123

    }
}
