public class ConstructorOverloadingImplicitConversion {
    public static void main(String[] args) {
        Abcd obj = new Abcd();
        Abcd obj1 = new Abcd(4.5);

    }
}

class Abcd {
    public Abcd(){
        System.out.println("In Abc constructor");
    }
//    public Abc(int a){
//        System.out.println("In Abc para constructor passing : " + a);
//    }
    public Abcd(double d){
        System.out.println("In Abc Double Constructor => d : "+d);
    }
}