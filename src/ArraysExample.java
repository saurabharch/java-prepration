import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int a[] = new int[5];

//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
//        a[5] = 6;

        for (int o=0;o<5;o++){
            a[o] = o+1;
        }
        System.out.println("Simple Way of printing Number is in Array");
       // System.out.println(a); print the value in hashcode

        for(int i=0; i<5;i++){
            System.out.println(a[i]);
        }

        System.out.println("Enhanced For Loop Presentation for Array");
        for(int i : a){
            System.out.println(i);
        }

        System.out.println("Simple Normal For Loop Presentation");
        int value[] = {1,2,3,4,5,6};
        for (int i =0; i<value.length;i++){
            System.out.println(value[i]);
        }

        System.out.println("Enhanced For Loop Presentation");
        int val[] = {4,5,6,7,8,9};
        for(int i: val){
            System.out.println(i);
        }

        System.out.println("Random Value Example with Array");

        Random r = new Random();
        int d[] = new int[5];

        for(int i : d){
            System.out.println(r.nextInt(50));
        }

    }
}
