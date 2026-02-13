import java.util.Scanner;
class Area {

    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        char choice;

        do {

            System.out.println("\nChoose Shape:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.print("Enter your choice: ");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Enter side of square: ");
                    double side = sc.nextDouble();
                    System.out.println("Area of Square: " + obj.calculateArea(side));
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + obj.calculateArea(length, breadth));
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    float radius = sc.nextFloat();
                    System.out.println("Area of Circle: " + obj.calculateArea(radius));
                    break;

                default:
                    System.out.println("invalid");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("exit");
    }
}
