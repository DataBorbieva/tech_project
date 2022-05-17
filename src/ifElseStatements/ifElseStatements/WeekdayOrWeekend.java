package ifElseStatements.ifElseStatements;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        //if it is weekend print out "it is weekend"
        //else it is weekday
        boolean isWeekend = true;


        if(isWeekend){
            System.out.println("it is weekend");
        }else{
            System.out.println("it is weekday");
        }

        boolean isWeekday =  false;
        if(!isWeekday){
            System.out.println("it is weekday");
        }else{
            System.out.println("it is weekend");
        }

        // with objects we cannot use  relational operators(>+-< >= ..)
        //you can use relational operators with primitives;




    }
}
