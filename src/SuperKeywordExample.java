public class SuperKeywordExample {
    public static void main(String[] args) {

        //Sa obj = new Sa();
        //Sa obj = new Sa(5);
        Sb obj1 = new Sb();
        obj1.show();
        obj1.abc();
        //Sb obj1 = new Sb(5);
    }
}

class Sa{ // Super class, Parent Class , Base Class // by default Super class is extend of Java Object Class

    public  Sa(){ // super(); by default
        System.out.println("In Constructor A");
    }

    public  Sa(int i){
        System.out.println("In Constructor A Parametrize");
    }
   int i =5;

    public void abc(){
        System.out.println("A abc");
    }
}

class Sb extends Sa{ //Sub Class, Child Class, Derived Class

    public  Sb(){ // super();
        System.out.println("In Constructor B");
    }

    public  Sb(int i){
        super(i);
        System.out.println("In Constructor B Parametrize");
    }

    // Method of printing integer from parent class by using super keyword before
    public void show(){
        System.out.println("Getting the value of int from Super Class Sa : "+super.i);
    }


    //calling parent class abc method by using super keyword , Merge both the class object together
    public void abc(){
        super.abc();
        System.out.println("B abc");
    }

}