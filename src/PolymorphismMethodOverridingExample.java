public class PolymorphismMethodOverridingExample {

    public static void main(String[] args) {

        BPolyOverriding obj=  new BPolyOverriding();
        obj.show();
    }
}

class APolyOverriding{  // Method Overriding, Late Binding, Dynamic Binding, Runtime Polymorphism
    public void show(){
        System.out.println("A Hello World");
    }

}

class BPolyOverriding extends APolyOverriding{
    public void show(){
        System.out.println("B Hello World");
    }
}