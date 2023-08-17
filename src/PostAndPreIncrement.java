public class PostAndPreIncrement {
    public static void main(String[] args) {
        int o = 4;
        int k = o++; // o = o+1;
        // o++ ==> post incremented
        // ++o ==> pre incremented
        System.out.println(k);
    }
}
