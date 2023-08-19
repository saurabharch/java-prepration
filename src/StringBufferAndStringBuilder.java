public class StringBufferAndStringBuilder {
    // StringBuffer => A thread-safe, mutable sequence of characters.
    // StringBuilder => A mutable sequence of characters. but not thread safe guarantee

    public static void main(String[] args) {

        System.out.println("StringBuffer Method");
        StringBuffer sbr = new StringBuffer("saurabh");
        sbr.append(" kashyap");
        System.out.println("Before Replace: "+sbr);
        sbr.replace(0,7,"subham");
        System.out.println("After Replace: "+sbr);

        System.out.println("StringBuilder Method");
        StringBuilder stb = new StringBuilder("saurabh");
        stb.append("kashyap");
        stb.replace(0,7,"subham");
        System.out.println("After Replace: "+stb);
    }
}
