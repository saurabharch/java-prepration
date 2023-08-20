public class Student {

        private int rollno;
        private String sname;

    public Student() {

    }

    // Getter and Setters method are used for college class in this package
        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public Student(int rollno, String sname) {
            this.rollno = rollno;
            this.sname = sname;
        }

        //override custom method
        public String toString() {
            return rollno + ":" + sname;
        }
}
