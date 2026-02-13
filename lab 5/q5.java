import java.util.Scanner;

public class q5 {

    static class Person {
        String name;
        int age;

        void getPersonDetails(Scanner sc) {
            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter Age: ");
            age = sc.nextInt();
            sc.nextLine();
        }

        void displayPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Student extends Person {
        int rollNo;
        double marks;

        void getStudentDetails(Scanner sc) {
            System.out.print("Enter Roll Number: ");
            rollNo = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks = sc.nextDouble();
        }

        void displayStudentDetails() {
            displayPersonDetails();
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("Enter Person Details:");
        s.getPersonDetails(sc);

        System.out.println("Enter Student Details:");
        s.getStudentDetails(sc);

        System.out.println("\nStudent Full Details:");
        s.displayStudentDetails();

        sc.close();
    }
}
