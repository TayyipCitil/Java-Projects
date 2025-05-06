package ObjectOrientedProgramming.Week12.Uygulama1;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    public void deposit(double amount){
        balance+=amount;
    }
    @Override
    public void withdraw(double amount){
        double fee=0.1*amount;
        if(balance>=amount+fee){
            balance-=amount+fee;
        }else {
            System.out.println("Bakiyeniz yetersiz");
        }
    }
}
