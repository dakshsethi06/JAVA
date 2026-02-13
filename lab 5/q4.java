//Problem Statement:
//Create a class Employee with:
//•	Default constructor
//•	Parameterized constructor (name, salary)
//Display employee details using both constructors.
import java.util.Scanner;
class Employee {
    String name;
    double salary;

    Employee() {
        name = "Not Assigned";
        salary = 0.0;
        System.out.println("Default Constructor Called");
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterized Constructor Called");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Creating Employee using Default Constructor:");
        Employee emp1 = new Employee();
        emp1.displayDetails();

        System.out.println("\nEnter details for Employee (Parameterized Constructor):");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp2 = new Employee(name, salary);
        emp2.displayDetails();

        sc.close();
    }
}
