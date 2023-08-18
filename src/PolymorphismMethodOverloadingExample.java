public class PolymorphismMethodOverloadingExample {

    public static void main(String[] args) {
        Poly poly = new Poly();
        poly.Show();
        poly.Show(5);
    }
}

// Creating a class of Method
class Poly{  // Method Overloading , Early Binding , Static Binding, Compile time polymorphism
    public void Show(){
        System.out.println("hello World");
    }
    public void Show(int a){
        System.out.println("Hello world: "+a);
    }
    public void Show(double a){
        System.out.println("Hello world: "+a);
    }public void Show(float a){
        System.out.println("Hello world: "+a);
    }
}
