import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class useCurrentTimeMillisCalculateExecutionTime {

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();

        // create an instance of the SimpleDateFormat class for modifying the date object
        //convert milliseconds into Date by creating an object of the date class and passing milliseconds to the constructor
        Date res = new Date(start);
        DateFormat obj = new SimpleDateFormat("dd MM yyyy HH:mm:ss:SSS Z");

        Calendar calendar = Calendar.getInstance();
        // use setTimeInMillis() method od the calendar class to set time
        calendar.setTimeInMillis(start);
        // after formatting the date into dd:MM:yy:HH:mm:ss
        //copying data of one date into another one
        Date currentdate = new Date();
        System.out.println("Today Date Time/Zone: " + obj.format(currentdate));
        ArrayList<Integer> num = new ArrayList<>();

        for(int a=0;a<=1000000;a++){
            num.add(a);
            //System.out.println(a);
        }
        long end = System.currentTimeMillis();
        long time = (end-start);
        System.out.println(time+"ms");
    }
}
