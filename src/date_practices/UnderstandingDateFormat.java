package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.logging.SimpleFormatter;

public class UnderstandingDateFormat {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate); //Sat Apr 30 10:13:42 CDT 2022 -> default format

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //lower case "m" stands for minutes
        System.out.println(sdf.format(currentDate)); //04/30/2022

        SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy"); //04-30-2022
        System.out.println(sdf1.format(currentDate));




        SimpleDateFormat sdf2 = new SimpleDateFormat("EEE hh:mm a");
        System.out.println(sdf2.format(currentDate)); //Sat 10:27 AM

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate));






    }
}
