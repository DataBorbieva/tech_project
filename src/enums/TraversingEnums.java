package enums;

public class TraversingEnums {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day);
        }
/*
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
SUNDAY
 */

//Traverse Months
        for (Constants.Month month : Constants.Month.values()) {
            System.out.println(month);
        }

    }
    }


