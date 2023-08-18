public class ConstructorExampleOverloading {

    public static void main(String[] args) {
        Abc obj = new Abc();
        Abc obj1 = new Abc(2);
        Abc obj2 = new Abc(2,6.9);
    }
}

class Abc {
    public Abc(){
        System.out.println("In Abc constructor");
    }
    public Abc(int a){
        System.out.println("In Abc para constructor passing : " + a);
    }
    public Abc(int a , double d){
        System.out.println("In Abc InDouble Constructor => a : "+a+" , d : "+d);
    }
}