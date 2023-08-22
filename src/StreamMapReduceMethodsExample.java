import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapReduceMethodsExample {

    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(2,3,4,5,6,7,8,9);
        long start = System.currentTimeMillis();
        System.out.println(value.stream().map(i -> i*2).reduce(0,(c,e)-> c+e));
        long End = System.currentTimeMillis();
        long Result= End - start;
        System.out.println(Result+"ms");
    }
}
