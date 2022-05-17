package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {
        /*
        Method TASK: It helps to get a character at a specific index
        NOTE: Index starts with 0
        -It is non -static as we call it with object name
        -It is a return type  and returns char primitive
        -It takes an argument which int(index)
        NOTE: it will thriw StringIndexOutOfBoundsException when the given index is not in the bounds
         */
        String name = "Alex";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

       // System.out.println(name.charAt(-1)); //-1  --STRING INDEX OUT OF RANGE

        if(name.charAt(0)=='A') System.out.println("The name starts with A");
        else System.out.println("The name is not starting with A");
        boolean name1 =  (name.charAt(0)=='A') ?   true : false;
        System.out.println(name1);
        System.out.println( (name.charAt(0)=='A') ?"The name starts with A": "The name is not starting with A");


        char firstChar = name.charAt(0);
        if (firstChar == 65 || firstChar == 97) System.out.println("This name starts with A");
        else System.out.println("This name does not start with A");

    }
}
