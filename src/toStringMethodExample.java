public class toStringMethodExample {
    public static void main(String[] args) {
        Studentnew s = new Studentnew(10,"saurabh");
        System.out.println(s); // without toString override it's out put is Student@7b23ec81 => ClassName@Hashcode memory address
    }
}

class Studentnew {

     int rollno;
     String sname;

    // Getter and Setters method are used for college class in this package

    public Studentnew(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

//override custom method
    public String toString() {
        return rollno + ":" + sname;
    }
}
