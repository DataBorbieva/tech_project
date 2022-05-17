package ifElseStatements.switchStatements;

public class CharExample {
    public static void main(String[] args) {
        char character = '$';

        switch(character){
            case 'A': System.out.println("It is uppercase and is the first letter in the Alphabet");
            break;
            case '5':System.out.println("It is a digit");
            break;
            case '$':System.out.println("It is a dollar sign");
            break;
            default:System.out.println("It is not A, 5, $"); //default is optional
            // if we take away all breaks, after true case , it will print out every block of code
                //we can use ASCII table value for example 'A'-94 in case
                //breaks need to stop in correct case statement




        }
    }
}
