import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAndGenericsComparableInterfaceExample {

    public static void main(String[] args) {
        List<NewStudents> s = new ArrayList<>();
        s.add(new NewStudents(1,45));
        s.add(new NewStudents(2,89));
        s.add(new NewStudents(3,47));
        s.add(new NewStudents(4,75));
        s.add(new NewStudents(5,60));
        s.add(new NewStudents(6,32));

        Collections.sort(s);

        for(NewStudents o : s){
            System.out.println(o);
        }
    }

}


class NewStudents implements Comparable<NewStudents> {
    int roll;
    int marks;

    public NewStudents(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "NewStudents{" +
                "rollno=" + roll +
                ", marks=" + marks +
                '}';
    }

    public int compareTo(NewStudents s){
        return this.marks>s.marks?-1: this.marks< s.marks?1:0;
    }
}