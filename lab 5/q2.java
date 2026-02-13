// . Method Overloading – Area Calculator
//Problem Statement:
//Create a class Area with overloaded methods to calculate:
import java.util.Scanner;
public class q2 {

    private int accountNumber;
    private double balance;

    q2(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        q2 account = new q2(accNo, initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\nFinal Account Details:");
        account.displayBalance();

        sc.close();
    }
}
