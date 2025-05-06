package ObjectOrientedProgramming.Week12.Uygulama1;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void deposit(double amount){
        balance+=amount;
    }
    @Override
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }else {
            System.out.println("Bakiyeniz yetersiz");
        }
    }
}
