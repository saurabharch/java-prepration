import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HowToPrintDuplicateElementInArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mukesh");
        list.add("Ramesh");
        list.add("Sudhir");
        list.add("Mukesh");
        list.add("Deepak");
        list.add("Deepak");
        Set<String> s = new HashSet<>();
        // s.add(Object) first check the data in list or not return as a boolean value true and false
        for(String name: list){
            if(s.add(name)==false)
            System.out.println(name);
        }

    }
}
