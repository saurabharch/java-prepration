public class StaticBlockExample {

    static String s = "";
    static {
        s= "Hello World from Static Blank Object";
    }
    static {
        System.out.println("Static Block: Hello World");
    }
    public static void main(String[] args) {
        System.out.println("The value of s: "+s);
        System.out.println("In Main: Hello World");
    }

    static {
        System.out.println("Static Block: End");
    }
}
