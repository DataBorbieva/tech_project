package stringMethods;

public class _08_length {
    public static void main(String[] args) {
        /*
        Method TASK : is to coutn a total number of characters in a String and return it as int
        It is a non- static and can be called with object name
        its Return type method and it returns int(total number of characters
        it doesnt take any arguments

        NOTE: it is like human thinking it starts counting from 1-2-3-4 etc, its not starting from 0-1-2-3 like index
        NOTE: the length of empty string "" is 0

         */
        String str = "Chicago";
        System.out.println(str.length()); //7
        System.out.println(str.length() + 3); //10

        String company = "TechGlobal";
        int size = company.length(); //10
        System.out.println(size);//10
    }
}
