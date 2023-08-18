public class EncapsulationSecondExample {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.setEmpId(4);
        emp.setEmpName("Saurabh");
        System.out.println("Name: "+emp.getEmpName() +" id:"+emp.getEmpId());
        Emp emp1 = new Emp();
        emp1.setEmpId(5);
        emp1.setEmpName("Sunil");
        System.out.println("Name: "+emp1.getEmpName() +" id:"+emp1.getEmpId());
    }
}

class Emp{
    private  int empId;
    private  String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}