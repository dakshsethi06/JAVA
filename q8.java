import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            String rev = "";
            String original = s;

            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }

            if (rev.equals(original))
                System.out.println("string is palindrome");
            else
                System.out.println("string is not palindrome");

            System.out.print("Do you want to continue (y/n): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'y' || choice == 'Y');

        System.out.println("exit");
        sc.close();
    }
}
