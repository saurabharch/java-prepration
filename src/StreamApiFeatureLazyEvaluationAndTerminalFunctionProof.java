import java.util.Arrays;
import java.util.List;

public class StreamApiFeatureLazyEvaluationAndTerminalFunctionProof {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(23,345,56,46,36,23);

        //Method 1
//        int result=0;
//        for(int i : values){
//            if(i%5==0)
//            {
//                System.out.println(result);
//                result = i*2;
//                break;
//            }
//        }


//        System.out.println("Result: "+result);

        // Method 2
        System.out.println(values.stream().
                filter(StreamApiFeatureLazyEvaluationAndTerminalFunctionProof::isDivisible)
                .map(StreamApiFeatureLazyEvaluationAndTerminalFunctionProof::ismapDouble)
                .findFirst().orElse(0));
    }

    public static boolean isDivisible(int a){

        System.out.println("Is Divisible By: "+a);
        return a%5==0;
    }

    public static int ismapDouble(int b){
        System.out.println("Is MapDouble: "+b);
        return b*2;
    }
}
