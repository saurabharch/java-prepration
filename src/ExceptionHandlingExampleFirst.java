import java.lang.ArrayIndexOutOfBoundsException;
public class ExceptionHandlingExampleFirst {

    public static void main(String[] args) {
        int a,b,c=0;
        a=10;
        b=0;
        int k[] = new int[4];
        try{
            c = a/b;
            for(int i=0;i<=4;i++){
                k[i] += i;
            }
            for(int val:k){
                System.out.println(val);
            }

        } catch (ArithmeticException e){
            System.out.println("Divided by Zero is not possible " +e); // showing a meaningful simple statement message of this exception state
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum Number of Values is 4 "+e);
        }
        catch (Exception e){
            System.out.println("Unknown Exception Message: "+e);
        }
        System.out.println(c);
    }
}
