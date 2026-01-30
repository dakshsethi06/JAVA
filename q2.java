import java.util.Scanner;

class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; count < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
                sc.close();
            }
        }
    }
}
