public class LeftRightShiftOperator {
    public static void main(String[] args) {
        int a = 8; // 1 0 0 0
        int b = a << 2; // 1 0 0 0 0 0 --> 32
        System.out.println("Left Shift Operator :"+b);
        int c = a >> 2; // 1 0.
        System.out.println("Right Shift Operator : "+c);


    }
}
