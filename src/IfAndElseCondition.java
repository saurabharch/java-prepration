public class IfAndElseCondition {
    public static void main(String[] args) {
        int num1 = 6;
        if(num1%2 ==0){
            System.out.println("given number is even number");
        }
        else{
            System.out.println("given number is not a even number");
        }
        int s,t,u;
        s = 4;
        t = 3;
        u = 8;
        if(s>t && s>u){
            System.out.println("S :"+s);
        } else if (t>u) {
            System.out.println("T :"+t);

        } else{
            System.out.println("U :"+u);
        }
    }
}
