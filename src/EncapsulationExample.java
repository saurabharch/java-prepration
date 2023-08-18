public class EncapsulationExample {
    public static void main(String[] args) {
            A a = new A();
            a.setI(50);
        System.out.println(a.getInt());
    }
}

class A{
    private static int th;
    public void setI(int j){
        th = j;
    }
    public int  getInt(){
        return th;
    }
}