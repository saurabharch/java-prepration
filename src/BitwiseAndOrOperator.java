
// Bitwise Operator  --> AND & OR |
// & 1 1 --> 1
// | 1 0 --> 1
// | 1 1 --> 0
// | 0 1 --> 1

public class BitwiseAndOrOperator {
    public static void main(String[] args) {
        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1
                  // & 0 1 0 0 1 --> 9
                  // | 1 1 1 1 1  --> 31
        int c = a & b;
        System.out.println("AND --> & Operator with a and b is :"+c);
        int d = a|b;
        System.out.println("OR --> | Operator with a and b is : "+d);

    }
}
