import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class useCurrentTimeMillisCalculateExecutionTime {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // create an instance of the SimpleDateFormat class for modifying the date object

//        DateFormat obj = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");
//        // we create instance of the Date and pass milliseconds to the constructor
//        Date res = new Date(start);
//        // now we format the res by using SimpleDateFormat
//        System.out.println(obj.format("Current data Time : "+res));
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
