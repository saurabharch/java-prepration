public class VarargsVariableArguments {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(5); // pass through the simple vararg
        Display obj2 = new Display();
        obj2.show(2,4,5,7); // pass through spread operator in vararg => variable argument

    }


}

class Display{
    public void show(int a){
        System.out.println(a);

    }public void show(int ... a){
       for(int i :a){
           System.out.println(i);
       }

    }
}