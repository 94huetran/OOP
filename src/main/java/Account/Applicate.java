package Account;

public class Applicate {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account balance: "+ account.getBalance());
        System.out.println("Monthly interest "+account.getMonthlyInterest());
        System.out.println("Date created account "+account.getDateCreated());


    }
}
