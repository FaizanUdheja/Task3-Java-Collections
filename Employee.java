package Task_3;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee(){}

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee:- " + "name=" + name +  ", age=" + age + ", salary=" + (int) salary;
    }
}
