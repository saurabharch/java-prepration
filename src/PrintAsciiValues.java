public class PrintAsciiValues {

    public static void main(String[] args) {

        // 7-bits
        // 2^7 = 128
        // 0-to-127

        for(int i =0;i<=127;i++){
            System.out.printf("%d : %c |",i,i); // %d represent the integer value of i which is normal number %c represent fetch the ASCII value
        }
    }
}
