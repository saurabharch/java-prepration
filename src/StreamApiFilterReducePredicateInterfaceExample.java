import java.util.Arrays;
import java.util.List;

public class StreamApiFilterReducePredicateInterfaceExample {

    public static void main(String[] args) {
        List<Integer> values =Arrays.asList(12,10,45,86,90,55,47,35);
        List<Integer> values1 =Arrays.asList(12,10,45,86,90,55,47,35);

        long start = System.currentTimeMillis();

        int result = 0;
        for (int i : values){
            if (i%5==0){
                result+=i;
            }
        }

        System.out.println("Result 1: "+result);
        long End = System.currentTimeMillis();
        long Result= End - start;
        System.out.println(Result+"ms");

        long start1 = System.currentTimeMillis();
        System.out.println("Result 2: "+values1.stream().filter(j->j%5==0).reduce(0,Integer::sum));
        long End1 = System.currentTimeMillis();
        long Result1= End1 - start1;
        System.out.println(Result1+"ms");


        /*
        Method:1
        Result 1: 235
        2ms
        Method:2
        Result 2: 235
        0ms

         */
    }
}
