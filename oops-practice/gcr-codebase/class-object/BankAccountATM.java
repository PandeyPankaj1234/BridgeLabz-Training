// 
import java.util.*; 

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    // method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // method to withdraw money if balance is sufficient
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    // method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter account holder name: ");
        acc.accountHolder = sc.nextLine();

        System.out.print("Enter account number: ");
        acc.accountNumber = sc.nextLong();

        System.out.print("Enter initial balance: ");
        acc.balance = sc.nextDouble();

        System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount to deposit: ");
            acc.deposit(sc.nextDouble());
        } else if (choice == 2) {
            System.out.print("Enter amount to withdraw: ");
            acc.withdraw(sc.nextDouble());
        } else if (choice == 3) {
            acc.displayBalance();
        } else {
            System.out.println("Invalid choice.");
        }

        acc.displayBalance();

        sc.close();
    }
}
