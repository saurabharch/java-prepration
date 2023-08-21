import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceInJavaCollectionFrameworkExample {

    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>(); // here Set Class Contains only Uniques values mean you can't add or hold duplicate value
        values.add(5);
        values.add(61);
        values.add(17);
        values.add(92);
        values.add(8);
        values.add(6);
        
        // Set can't sort with Collection.sort(values)
        System.out.println("HashSet data Output");
        for (int i : values){
            System.out.println(i);
        }

        // FIXING: done
        Set<Integer> v = new TreeSet<>(); // gives output in correct order
        v.add(5);
        v.add(61);
        v.add(17);
        v.add(92);
        v.add(8);
        v.add(6);
        System.out.println("TreeSet data Output");
        for(int i :v){
            System.out.println(i);
        }
    }

}
