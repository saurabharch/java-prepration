public class ObjectCloningDeepCloningExample {
    public static void main(String[] args) {
        /*
        Swallow
        Deep
        clone
         */
        CloneInt obj = new CloneInt();
        obj.i = 1;
        obj.j = 3;
        CloneInt bg = new CloneInt();
        bg.j=obj.j;
        bg.i=obj.i;
        bg.j=7;
        System.out.println("Clone Result: "+bg);
        System.out.println("Deep Clone Result: "+obj);
    }
}

class CloneInt {

    int i;
    int j;

    @Override
    public String toString() {
        return "{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}