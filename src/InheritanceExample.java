import java.util.Scanner;

public class InheritanceExample {
    public static void main(String[] args) {
        Cal adm = new Cal();

        System.out.println("Enter First Number");
        adm.num1= new Scanner(System.in).nextInt();
        System.out.println("Enter Second Number");
        adm.num2 = new Scanner(System.in).nextInt();
        adm.sum();
        System.out.println("Add the number: "+adm.result);

        adm.sub();
        System.out.println("Subtract the number: "+adm.result);

        adm.multi();
        System.out.println("Multiplication the number: "+adm.result);
        adm.div();
        System.out.println("Division the number: "+adm.result);
    }
}
class Add{
    //int num1,num2,result=0;
    double num1,num2,result=0; // more precise output answer
    public void sum(){
        result = num1+num2;
    }
}

class AddSubs extends Add { // single level Inheritance
//    int num1,num2,result=0;
    public void sub(){
        result = num1-num2;
    }
}


// Java Doesn't support multiple inheritance directly.
class AddSubMul extends AddSubs {  // Multi-level Inheritance
    public void multi(){
        result = num1*num2;
    }
}

class  Cal extends AddSubMul {
    public void div(){
        result = num1/num2;
    }
}