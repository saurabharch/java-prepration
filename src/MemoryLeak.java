import java.util.ArrayList;
import java.util.List;

public class MemoryLeak {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            list.add(123); // Adding elements to the list without ever removing them
        }
//          while (true) {
//                list.add(123);
//                if (list.size() > 1000) {
//                    list.remove(0); // Remove the first element to keep the list size in check
//                }
//        }
    }
}
