package operators;

public class ShortHandAssignmentOperators {
    public static void main(String[] args) {
        int johnsAge = 5;
      //  int johnsAge5YearsLater = johnsAge + 5 ; //10
        // johnsAge = johnsAge + 5;                //10
        johnsAge += 5;                             //10
        System.out.println(johnsAge);

        String name = "Alex";
       // String name2  = name + "an";       //Alexan
       // name = name + "an" ;                 //Alexan
        name += "an";                           //Alexan
        name += "d";                            //Alexand
        name += "e";                             //Alexande
        name += "r";                             //Alexander

    }
}
