// if the number is positive, negative or zero
import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("enter a number : ");
            int n = sc.nextInt();
            if (n > 0)
                System.out.println("the number is positive");
            else if (n < 0)
                System.out.println("the number is negative");
            else
                System.out.println("the number is zero");
            System.out.println("do you want to continue (y/n)");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        if (choice == 'n' || choice == 'N')
            System.out.println("exit");
        sc.close();
    }
}
