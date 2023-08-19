
public class InterfaceExample {
    public static void main(String[] args) {
        AbcInterface obj = new AbcImpl();
        obj.show();

        Invention inv = new Invention() {
            public void show() {
                System.out.println("Invention Interface");
            }
        };
        inv.show();

        // More efficient and less code
        Invention inv1 = () -> System.out.println("Invention Interface with lambda expression");

        inv1.show();

        mixInterface mix = new mixInterface() {
            public void Japan() {
                System.out.println("Japan");
            }
            public void show() {
                System.out.println("In show Mix");
            }
        };
        mix.Japan();
        mix.show();
        DefaultInte df = new DefaultInte(){
            public void Newcreate() { // method override
                DefaultInte.super.Newcreate();
            }
        };
        df.Newcreate();
        DefaultInte.Checking();
    }
}

interface AbcInterface {
    void show(); // by default this method is public abstract method
}

interface yyy {
    void Japan();
}
interface mixInterface extends AbcInterface,yyy {
    public abstract void Japan();
}

class InterClass implements AbcInterface {
    public void show(){
        System.out.println("Class to Interface Using implements");
    }
}
interface Invention {
    void show();
}

interface DefaultInte {
    default public void Newcreate(){ // default method
        System.out.println("Default Interface");
    }
    static public boolean Checking (){  // static method
        return false;
    }
}
class AbcImpl implements AbcInterface{
    public void show(){
        System.out.println("In Show");
    }
}