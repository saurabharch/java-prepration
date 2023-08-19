public class ExceptionHandellingExampleFirst {

    public static void main(String[] args) {
        int a,b,c=0;
        a=10;
        b=0;
        try{
            c = a/b;
        } catch (Exception e){
            System.out.println("Divided by Zero is not possible"); // showing a meaningful simple statement message of this exception state
        }
        System.out.println(c);
    }
}
