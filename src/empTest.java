import comp.employee;

public class empTest {
    public static void main(String args[]){
        employee e1 = new employee("Yayak");
        employee e2 = new employee("Andrya");

        e1.setAge(22);
        e1.setSalary(1000);
        e1.printEmp();

        e2.setAge(32);
        e2.setSalary(5000);
        e2.printEmp();



    }
}
