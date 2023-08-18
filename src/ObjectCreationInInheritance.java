public class ObjectCreationInInheritance {

    public static void main(String[] args) {
        Ad obj = new Ad();

        System.out.println("Another Method");
        Ad obj1 = new Ab(6); // reference in super class and reference in subclass

    }
}

// creating an object in inheritance
class Ad {  // Super Class
    public Ad(){
        System.out.println("In Ad Const");
    }
    public Ad(int a){
        System.out.println("Ad Passing Value: "+a);
    }
}

class Ab extends Ad{  // subclass
    public Ab(){
        System.out.println("In Ab Const");
    }
    public Ab(int a){
        System.out.println("Ab Passing Value: "+a);
    }
}