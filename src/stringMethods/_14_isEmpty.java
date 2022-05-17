package stringMethods;

public class _14_isEmpty {
    public static void main(String[] args) {
        /*Method Task it is used to chech if given string is empty or not
        non-static
        return type, it return true if string is empty, and false if string is not empty
        it does not take any arguments

         */
        String name = "John";
        System.out.println(name.isEmpty()); //false
        System.out.println(name.replace(name,"").isEmpty()); //true
        System.out.println("Hello".toLowerCase().replace("hello", "").isEmpty()); // true
        // false
        System.out.println(" ".isEmpty());









    }
}
