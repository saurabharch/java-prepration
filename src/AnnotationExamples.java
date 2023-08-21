import java.util.ArrayList;

public class AnnotationExamples {

    public static void main(String[] args) {

        Bnb obj = new Bnb();
        obj.ShowMyDataBaseFromLastYear();

        //obj.show(); this method is deprecated with annotation @Deprecated

    }
}

class Anb {
    public void ShowMyDataBaseFromLastYear(){


        System.out.println("From A");
    }
}

class Bnb extends  Anb {

    @Deprecated
    public void show(){
        System.out.println("This method is deprecated");
    }
    @Override // annotation
    @SuppressWarnings("unchecked")
    public void ShowMyDataBaseFromLastYear() {

        ArrayList Obj = new ArrayList();
        super.ShowMyDataBaseFromLastYear();
    }
}

@FunctionalInterface
interface fire {
    void show();
//    void dd(); @FunctionalInterface is added in annotation because of this it shows an error because we can add only one method in interface
}