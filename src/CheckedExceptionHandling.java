import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionHandling {

    public static void main(String[] args)  {
        int i,j,k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       i=8;
        try{
            j=Integer.parseInt(br.readLine()); // IOException throws is a Check Exceptional Handling
            System.out.println("Result: "+j);
           k=i/j;
            System.out.println("Division Result: "+k);
        }catch (IOException e){
            System.out.println("Checked Exception Occurs: "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Not A correct Number Input for division :"+e.getMessage());
        }catch (Exception e){
            System.out.println("Unknown Exception Occurs : "+e.getMessage());
        }finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Bye !");
        }


    }
}
