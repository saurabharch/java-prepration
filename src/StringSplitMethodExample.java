public class StringSplitMethodExample {

    public static void main(String[] args) {
        String str = "saurabh,kashyap,siwan,bihar";
        String names[] = str.split(",");
        for(String val:names)
            System.out.println(val);

    }
}
