public class ObjectCloningDeepCloningSecondExample{

    public static void main(String[] args) throws Exception{
            Dclone obj = new Dclone();
            obj.i=3;
            obj.j=5;

            Dclone obj1 = (Dclone) obj.clone();
            obj1.j=8; // looks like swallow

        System.out.println("Clone: "+obj);
        System.out.println("Deep Clone: "+obj1);
    }
}

class Dclone implements Cloneable{
    int i,j;

    @Override
    public String toString() {
        return "{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}