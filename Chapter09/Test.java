package Chapter09;

public class Test {
    public static void main(String[] args) {
        Account a = new Account(1, 1000);
        System.out.println("The current balance is " + a.getBalance());
        a.withdraw(250);
        System.out.println("The current balance is " + a.getBalance());
        a.deposit(500);
        System.out.println("The current balance is " + a.getBalance());
    }
}
