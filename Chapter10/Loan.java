package Chapter10;

import java.util.Date;

public class Loan {
    // data fields
    private double loanAmount;
    private int numberOfYears;
    private double annualInterestRate;
    private Date loanDate;

    // Constructors
    

    public Loan(double loanAmount, int numberOfYears, double annualInterestRate) {
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.annualInterestRate = annualInterestRate;
    }

    public Loan() {
        
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    // public void setLoanAmount(double loanAmount) {
    //     this.loanAmount = loanAmount;
    // }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    // public void setNumberOfYears(int numberOfYears) {
    //     this.numberOfYears = numberOfYears;
    // }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // public void setAnnualInterestRate(double annualInterestRate) {
    //     this.annualInterestRate = annualInterestRate;
    // }

    public Date getLoanDate() {
        return loanDate;
    }

    // public void setLoanDate(Date loanDate) {
    //     this.loanDate = loanDate;
    // }

    // Methods
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double numberOfMonths = numberOfYears * 12;
        double monthlyPayment = loanAmount * monthlyInterestRate/(1 - 1/ (Math.pow(1 + monthlyInterestRate, numberOfMonths )));
        return monthlyPayment;
    }

    public double getTotalPayment(){        
        return this.getMonthlyPayment() * numberOfYears * 12;
    }
    
    


    
}
