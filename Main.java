package Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public final ArrayList<Employee> arrayList = new ArrayList<>();
    private final Scanner s = new Scanner(System.in);
    //Menu
    public void menu(){
        while(true){
            System.out.println("1: Add Employee");
            System.out.println("2: Sort Employee by salary");
            System.out.println("3: Sort Employee by name");
            System.out.println("4: Display Employees");
            System.out.println("5: Exit");
            System.out.println("Enter your choice:- ");
            int choice = s.nextInt();
            if (choice == 1){
                addEmployee();
            } else if (choice == 2) {
                salarySort();
            } else if (choice == 3) {
                nameSort();
            }else if (choice == 4){
                displayEmployee();
            }
            else {
                System.out.println("Exiting");
                break;
            }
        }
    }
    //Add Employee()
    public void addEmployee() {
        s.nextLine();
        System.out.println("Enter Employee Name:");
        String name =s.nextLine();
        System.out.println("Enter Employee Age:");
        int age = s.nextInt();
        System.out.println("Enter Employee Salary:");
        double salary = s.nextDouble();
        arrayList.add(new Employee(name, age,  salary));
        System.out.println("Employee added");
    }

    //SalarySort()
    private void salarySort() {
        System.out.println("Sorting Employee By Salary");
        Collections.sort(arrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        });
        for (Employee e: arrayList){
            System.out.println(e);
        }
    }
    //NameSort()
    private void nameSort() {
        System.out.println("Sorting Employee By Name");
        Collections.sort(arrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });
        for (Employee e: arrayList){
            System.out.println(e);
        }
    }
    //To Display
    private void displayEmployee() {

        if(arrayList.isEmpty()){
            System.out.println("List is empty");
        }else {
            for (Employee e : arrayList) {
                System.out.println(e);
            }
        }
    }
    //Main ()
    public static void main (String [] args){
        Main m = new Main();
        m.menu();
    }
}
