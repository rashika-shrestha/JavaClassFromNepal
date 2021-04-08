package day28_Lab1;

public class BankAccount {

    private String name;
    private double balance;
    private static int accountNumber = 1000;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
        accountNumber++;
        displayInfo();
    }

    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
        accountNumber++;
        displayInfo();
    }

    public void depositFunds(double amount) {
        balance = balance + amount;
        displayInfo();
    }

    public void depositFunds(double amount, int interest) {
        balance = balance + amount + (balance * interest / 100);
        displayInfo();
    }

    public void withdrawFunds(double amount) {
        balance = balance - amount;
        displayInfo();
    }

    public void withdrawFunds(double amount, double fee) {
        balance = balance - amount - fee;
        displayInfo();
    }

    public void displayInfo() {
        System.out.println("===printing account detail======");
        System.out.println("Account Name is: " + name);
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Balance is: " + balance);
        System.out.println("=======================");
    }

}
