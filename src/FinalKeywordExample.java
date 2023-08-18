public class FinalKeywordExample {

    // Final Keyword used with => Variable,Method,Class
    public static void main(String[] args) {

        final int i;
        i=7;
        //i=9; shows Error because can't assign any new value to int i.
        System.out.println(i);
        //Fb obj = new Fb(); Invalid Inheritance method
        Fa obj = new Fa();
        obj.show();
    }
}

final class Fa {
   final public void show(){
        System.out.println("Show A");
    }

}
/* Error Message => java: cannot inherit from final Fa

class Fb extends Fa{

//    public void show(){  // Method overriding , show error when using final in parent class method
//        System.out.println("Show B");
//    }
}

 */