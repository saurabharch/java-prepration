
// Dynamic Method Dispatch, Runtime polymorphism , Method overriding
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        DyA obj1 = new DyA();
        DyB obj2 = new DyB();

        DyA a;
        a = obj1;
        a.show();
    }
}
class DyA{
    public void show(){
        System.out.println("In Show A");
    }
}

class DyB extends DyA {
    public void show(){
        System.out.println("In Show B");
    }
}