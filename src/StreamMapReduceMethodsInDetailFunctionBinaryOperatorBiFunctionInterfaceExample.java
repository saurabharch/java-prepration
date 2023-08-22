import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapReduceMethodsInDetailFunctionBinaryOperatorBiFunctionInterfaceExample {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2,3,4,5,6,7,8,9);
        long start = System.currentTimeMillis();
        Function<Integer,Integer> f = new Function<Integer, Integer>() {
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        Stream stream = values.stream();
        Stream stream1 = stream.map(f);

        Integer result = (Integer) stream1.reduce(0,b);
        System.out.println("Result: "+result);
        long End = System.currentTimeMillis();
        long Result= End - start;
        System.out.println(Result+"ms");
    }
}
