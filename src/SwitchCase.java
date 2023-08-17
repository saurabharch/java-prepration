public class SwitchCase {
    public static void main(String[] args) {
        int i =3;

        switch (i){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Some Number");
        }

        String s = "Hi";

        switch (s){
            case "Hi":
                System.out.println("Hi");
                break;
            case "Hello":
                System.out.println("Hello World");
                break;
            default:
                System.out.println("Nothing is in String");
        }
    }
}
