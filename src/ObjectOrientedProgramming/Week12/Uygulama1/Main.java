package ObjectOrientedProgramming.Week12.Uygulama1;

public class Main {
    public static void main(String[] args) {
        BankAccount account =new CheckingAccount(1000.0);
        Customer customer=new Customer(account);

        customer.displayBalance();
        customer.deposit(500.0);
        customer.displayBalance();
        customer.withdraw(200.0);
        customer.displayBalance();
        customer.withdraw(1500.0);//bakiyeniz yetersiz demeli
    }
}
