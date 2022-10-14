package Chapter09;

import java.util.Date;

public class Account {
    private int id;
    private double annualInterestRate;
    private double balance;
    private Date dateCreated;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        Date d = new Date();
        dateCreated = d;
    }

    public Account() {
        balance = 0.0;
        Date d = new Date();
        dateCreated = d;
    }

    public int getId() {
        return id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
        }
    }

    public void deposit(double amount){
        balance += amount; // balance = balance + amount;
    }
    
}
