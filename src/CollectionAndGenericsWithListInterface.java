import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionAndGenericsWithListInterface {

    public static void main(String[] args) throws Exception{
        List<Integer> values = new ArrayList<Integer>();
        values.add(31);
        values.add(34);
        values.add(40);
        values.add(12);
        values.add(67);
        values.add(22);

        Collections.sort(values);
        //Collections.reverse(values);

        values.forEach(System.out::println); // Stream API which uses Lambda Expression Introduced in JAVA 1.8


    }
}
