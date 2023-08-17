public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a=5,b=4,temp;
        System.out.println("Before Swap value of a: " +a);
        System.out.println("Before Swap value of b: " +b);

//        temp=a;// temp = 5
//        a=b; // a = 4
//        b=temp; // b = 5

//        a = a+b; // a = 9
//        b = a-b; // b = 5
//        a = a-b; // a = 4

      // ^ --> XOR operator  1 1 -> 0      1 0 -> 1      0 0 -> 0       0 1 -> 1
        a = a^b; // 1 0 1 XOR 1 0 0 ---> 0 0 1 -> 9
        b = a^b; // 0 0 1 XOR 1 0 0 ---> 1 0 1 -> 5
        a = a^b; // 0 0 1 XOR 1 0 1 ---> 1 0 0 -> 4

        System.out.println("After Swap Value of a: "+a);
        System.out.println("After Swap Value of b: "+b);

        int c = 5;
        int d = 6;
        d = c+d-(c=d);
        System.out.println(c+" "+d);
    }
}
