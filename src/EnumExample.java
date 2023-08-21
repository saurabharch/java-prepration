public class EnumExample {


    // Inside the class
    enum Mobile {
        APPLE,SAMSUNG,MOTOROLA,REDMI;
    }
    public static void main(String[] args) {
        // enum not supported inside the Main class
        System.out.println(Mobile.APPLE);
        System.out.println(Laptops.DELL);
    }
}

// Outside the class

enum Laptops{
    DELL,APPLE,LENOVO,HP;
}