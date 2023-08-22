import java.util.Arrays;
import java.util.List;

public class ForeachMethodReferenceExample {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);

        values.forEach(System.out::println); // Here System.out::println ==> refer to (i) -> System.out.println(i) which is called as a reference method , call by value , call by reference, call by method
    }
}
