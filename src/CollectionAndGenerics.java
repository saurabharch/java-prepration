// 1.0
// Collection comes since 1.2 and Generic comes since 1.5

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Collection Provide Dynamic type of Array.

// Getting collection values by Iterator and Enhanced For loop
public class CollectionAndGenerics {
    public static void main(String[] args) throws Exception{
        // int values[] = new int[4];
//         Object values[] = new Object[4];
//         values[0] = "saurabh";
//         values[1] = 7;

        Collection values = new ArrayList();
        values.add(3);
        values.add("saurabh");
        values.add(4.5d);
        values.add(true);

//        Iterator i = values.iterator();
// Old Technique
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
                for(Object i : values){
                    System.out.println(i);
                }
                 System.out.println("");
                Collection<Integer> v = new ArrayList<Integer>();
                v.add(89);
                v.add(99);
                v.add(76);
                v.add(45);

                for (Object i : v){
                    System.out.println(i);
                }
                v.remove(99);
                 System.out.println("");
                for (Object i : v){
                    System.out.println(i);
                }
    }

}
