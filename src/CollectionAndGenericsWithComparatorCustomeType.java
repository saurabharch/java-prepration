import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAndGenericsWithComparatorCustomeType {

    public static void main(String[] args) {

        List<Students> s = new ArrayList<>();
        s.add(new Students(1,45));
        s.add(new Students(2,89));
        s.add(new Students(3,47));
        s.add(new Students(4,75));
        s.add(new Students(5,60));
        s.add(new Students(6,32));

        Collections.sort(s,(s1,s2)->{
            return s1.marks>s2.marks?-1: s1.marks< s2.marks?1:0;
        });

        for(Students o : s){
            System.out.println(o);
        }
    }
}

class Students {
    int rollno;
    int marks;

    public Students(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
