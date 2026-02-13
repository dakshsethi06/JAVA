import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    float marks;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details for Student 1:");
        s1.getDetails();

        System.out.println("Enter details for Student 2:");
        s2.getDetails();

        System.out.println("\nStudent Details:");
        s1.displayDetails();
        s2.displayDetails();
    }
}
