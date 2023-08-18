public class AnonymousObjectExample {

    public static void main(String[] args) {

        Anon anon = new Anon(); // Anon is a Reference Data type
        anon.k = 29;
        anon.show();
        new Anon().k = 30;
        new Anon().show();
        //int s =  new Anno().show();
    }
}

class Anon{
    int k; // primitive data type variable
    public void show(){
        System.out.println("Value of K "+k);
    }

}

