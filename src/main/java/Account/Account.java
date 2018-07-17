package Account;

import java.util.Calendar;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
    }

    protected Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        Calendar cal  = Calendar.getInstance();
        dateCreated = cal.getTime();
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    private double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    protected double getMonthlyInterest() {
        return getMonthlyInterestRate()*balance;
    }

    protected double withdraw(double money) {
        return balance-= money;
    }

    protected double deposit(double money) {
        return balance += money;
    }
}
