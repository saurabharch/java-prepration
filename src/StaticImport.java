//import aaa.Sample;// import static method from project local package

//import aaa.Sample;

import static java.lang.System.out; // System.out.Println is a static class import from java.lang package
import static aaa.Sample.show; // import static method from project local package
public class StaticImport {
    public static void main(String[] args) {
        out.println("Hello World Main");
        //Sample.show();
        show();
    }
}
