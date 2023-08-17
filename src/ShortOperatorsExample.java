public class ShortOperatorsExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int k = a+b;
        System.out.println("Addition of number a and b is :" + k);
        System.out.printf("Addition of %d and %d is %d",a,b,k);
        a+=3;
        System.out.println("Adding 3 in integer a is "+a);
        b-=1;
        System.out.println("Substract 1 from b is "+b);
        a *=b;
        System.out.printf("Multiply value of a = %d with value of b = %d is %d",a,b,a);

        System.out.println();
    }
}
