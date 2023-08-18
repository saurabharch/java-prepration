import java.util.Random;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];


        for (int i=0;i<a.length;i++){
            a[i] = r.nextInt(30);
        }
        for (int i : a){

            System.out.println(i);
        }

        try {
            System.out.println(a[12]);// here through and ArrayIndexOutOfBoundsException
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum Index of Array is 9");
        }

    }
}
