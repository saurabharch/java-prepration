import java.util.Arrays;
import java.util.List;

public class StreamApiFeatureLazyEvaluationAndTerminalFunctionProof {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(23,345,56,46,36,23);

        int result=0;
        for(int i : values){
            if(i%5==0)
                result = i*2;
                break;
        }


        System.out.println("Result: "+result);

        System.out.println(values.stream().
                filter(StreamApiFeatureLazyEvaluationAndTerminalFunctionProof::isDivisible)
                .map(StreamApiFeatureLazyEvaluationAndTerminalFunctionProof::isDivisible)
                .findFirst().
                orElse(false));
    }

    public static boolean isDivisible(Integer a){

        System.out.println("Is Divisible By: "+a);
        return a%5==0;
    }

    public static Integer ismapDouble(Integer b){
        System.out.println("Is MapDouble: "+b);
        return b*2;
    }
}
