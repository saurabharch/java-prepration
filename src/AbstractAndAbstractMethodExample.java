public class AbstractAndAbstractMethodExample {

    public static void main(String[] args) {
        MaheshPhone obj = new SureshPhone(); // Cannot Initiate the Abstract Class
        obj.call();
        obj.cook();
        obj.move();
        obj.dance();

        Iphone iphone = new Iphone();
        show(iphone);

        samsungS22 samsung = new samsungS22();
        show(samsung);
    }

    public static void show(Phone p){
        p.showConfig();
    }
}

abstract class MaheshPhone { // Abstract Class
    public void  call(){
        System.out.println("Calling ...");
    }
    public abstract void move(); // Abstract Method
    public abstract void dance();
    public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone { //Abstract Class

    public void move(){
        System.out.println("Moving...");
    }
}

class SureshPhone extends RameshPhone { // Concrete Class
    public void dance(){
        System.out.println("Dancing...");
    }
    public void cook(){
        System.out.println("Cooking...");
    }
}


abstract class Phone {
    public abstract void showConfig();
}

class Iphone extends Phone {
    public void showConfig(){
        System.out.println("2Gb, IOs 12.2");
    }
}

class samsungS22 extends Phone{
    public void showConfig(){
        System.out.println("12Gb, Android 12");
    }
}