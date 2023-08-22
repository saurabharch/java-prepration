import java.util.Arrays;
import java.util.List;

public class LambdaExpressionWithForEach {


    // Lambda Expression is only work with the @FunctionalInterface
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);

        values.forEach(i-> System.out.println(i));
    }
}
