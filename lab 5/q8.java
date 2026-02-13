import java.util.Scanner;

public class q8 {

    interface Payment {
        void pay(double amount);
    }

    static class CreditCard implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Payment of " + amount + " made using Credit Card.");
        }
    }

    static class UPI implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Payment of " + amount + " made using UPI.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nChoose Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. UPI");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            System.out.print("Enter amount to pay: ");
            double amount = sc.nextDouble();

            Payment p;

            switch (option) {
                case 1:
                    p = new CreditCard();
                    p.pay(amount);
                    break;

                case 2:
                    p = new UPI();
                    p.pay(amount);
                    break;

                default:
                    System.out.println("Invalid payment method!");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("exit");
    }
}
