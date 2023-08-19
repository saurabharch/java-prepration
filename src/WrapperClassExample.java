import java.lang.Integer;
import java.util.ArrayList;

public class WrapperClassExample {

    public static void main(String[] args) throws Exception {
        int i = 6; // Here Int is primitive Data Type
        // Since 9 Integer wrapper class is @Deprecated
        String iObj = new String("Saurabh"); // Wrapping method, Boxing method
        String j = iObj.toString(); //Unwrapping method , AutoBoxing method
        System.out.println("Result: "+j);

        Integer jj = Integer.valueOf(i); // Here Integer is primitive wrapper class of data type
        int d = jj.intValue();

        System.out.println("Result of d: "+d);

        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(5);
        values.add(6);
        values.add(7);


    }
}
