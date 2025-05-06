package ObjectOrientedProgramming.Week12.Uygulama1;

public class Customer {
    private BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    public void displayBalance(){
        System.out.println("Bakiye: "+account.balance);
    }

    public void deposit(double amount){
        account.deposit(amount);
    }

    public void withdraw(double amount){
        account.withdraw(amount);
    }
}
