package Chapter10;

public class TestLoan {
    public static void main(String[] args) {
        Loan l  = new Loan(100000, 5,   7.5);
        l.getLoanDate().setTime(10000000);
    }
}
