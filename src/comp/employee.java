package comp;

public class employee implements footballPlayer {
    private String name;
    private double salary;
    private int age;

    public employee(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmp(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }

    @Override
    public void kick() {
        System.out.println("");
    }

    @Override
    public void goal() {
        System.out.println("");
    }
}
