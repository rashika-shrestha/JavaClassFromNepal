package day28_Lab1;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount nirmal = new BankAccount("Nirmal");
        BankAccount rashi = new BankAccount("Rashi", 500);

        nirmal.depositFunds(500);
        rashi.withdrawFunds(100);
        nirmal.withdrawFunds(500, 5);

    }
}
