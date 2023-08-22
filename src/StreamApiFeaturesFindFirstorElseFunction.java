import java.util.Arrays;
import java.util.List;

public class StreamApiFeaturesFindFirstorElseFunction {


    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(23,345,56,46,36,23);

        System.out.println(values.stream().filter(i->i%5==0).map(j -> j*2).findFirst().orElse(0));
    }
}
