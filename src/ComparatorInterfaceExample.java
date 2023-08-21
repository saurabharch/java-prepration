import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceExample {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(314);
        values.add(234);
        values.add(401);
        values.add(121);
        values.add(617);
        values.add(522);

        // Lambda Expression with comparator Interface
        // METHOD: 1
//        Comparator<Integer> comparator = (o1,o2) ->
//        {
//            if (o1>o2){  // o1%10>o2%10 OR o1<o2
//                    return 1;
//                }
//                return -1;
//        };
        // METHOD: 2
//        Comparator<Integer> comparator = (o1,o2) ->
//        {
//            return o1>o2?1:-1; // o1%10>o2%10 OR o1<o2 with ternary operator
//        };

//        Collections.sort(values,comparator);

        // METHOD: 3
        //More Precise and less code
          Collections.sort(values,(o1, o2) -> {
              return o1>o2?1:-1; //o1%10>o2%10 OR o1<o2 with ternary operator
          });

        for(int i : values){
            System.out.println(i);
        }
    }
}
