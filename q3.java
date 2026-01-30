import java.util.Scanner;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {

        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int a = 0, b = n;
        while (n > 0) {
            a = a * 10 + n % 10;
            n = n / 10;
        }
        if (a == b)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
        System.out.println("do you want to continue (y/n)");
        choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        if (choice == 'n' || choice == 'N')
            System.out.println("exit");
        sc.close();
    }
}
