public class toStringMethodExample {
    public static void main(String[] args) {
        Student s = new Student(10,"saurabh");
        System.out.println(s); // without toString override it's out put is Student@7b23ec81 => ClassName@Hashcode memory address
    }
}

class Student {
    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

//override custom method
    public String toString() {
        return rollno + ":" + sname;
    }
}
