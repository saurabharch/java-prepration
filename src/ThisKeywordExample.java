public class ThisKeywordExample {

    public static void main(String[] args) {
        ThisA obj = new ThisA();
        obj.show(6);
    }
}

class ThisA {
    private  int a; // Instance variable
    public void show(int a){ // local variable
        this.a = a; // this.a => current instance variable
        System.out.println("Value is "+a);
    }
}
