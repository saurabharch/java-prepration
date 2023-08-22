import java.util.Arrays;
import java.util.List;

public class ForeachMethodReferenceSecondExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);

       // values.forEach(i -> doublet(i));

        values.forEach(ForeachMethodReferenceSecondExample::doublet);
    }

    public static void doublet(int i){

        System.out.println(i*2);
    }
}
