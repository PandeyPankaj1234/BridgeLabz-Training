package review;

import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return type + " : " + amount;
    }
}

interface BankService {
    void createAccount(Account account);

    double checkBalance(int accountNumber);

    void transferFunds(int fromAcc, int toAcc, double amount) throws InsufficientBalanceException;

    List<Transaction> getTransactionHistory(int accountNumber);
}

abstract class Account {
    int accountNumber;
    protected double balance;
    protected double interestRate;
    LinkedList<Transaction> transactions = new LinkedList<>();

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract double calculateInterest();

    synchronized void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        balance -= amount;
        transactions.add(new Transaction("Withdraw", -amount));
    }

    double getBalance() {
        return balance;
    }

    List<Transaction> getTransactions() {
        return transactions;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
        interestRate = 4.0;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
        interestRate = 2.0;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class Bank implements BankService {
    private HashMap<Integer, Account> accounts = new HashMap<>();

    public synchronized void createAccount(Account account) {
        accounts.put(account.accountNumber, account);
    }

    public synchronized double checkBalance(int accountNumber) {
        return accounts.get(accountNumber).getBalance();
    }

    public synchronized void transferFunds(int fromAcc, int toAcc, double amount)
            throws InsufficientBalanceException {
        Account from = accounts.get(fromAcc);
        Account to = accounts.get(toAcc);

        if (from == null || to == null)
            throw new InsufficientBalanceException("Account Not Found");

        from.withdraw(amount);
        to.deposit(amount);

        from.transactions.add(new Transaction("Transfer Out", -amount));
        to.transactions.add(new Transaction("Transfer In", amount));
    }

    public synchronized List<Transaction> getTransactionHistory(int accountNumber) {
        return accounts.get(accountNumber).getTransactions();
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new SavingsAccount(101, 2000);
        Account a2 = new CurrentAccount(102, 3000);

        bank.createAccount(a1);
        bank.createAccount(a2);

        System.out.println("Savings Balance: " + bank.checkBalance(101));
        System.out.println("Current Balance: " + bank.checkBalance(102));

        try {
            bank.transferFunds(101, 102, 500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAfter Transfer:");
        System.out.println("Savings Balance: " + bank.checkBalance(101));
        System.out.println("Current Balance: " + bank.checkBalance(102));

        System.out.println("\nSavings Transactions:");
        for (Transaction t : bank.getTransactionHistory(101))
            System.out.println(t);

        System.out.println("\nConcurrent Transactions Demo:");
        Runnable task = () -> {
            try {
                bank.transferFunds(102, 101, 100);
                System.out.println("Transfer done by " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
