package ObjectOrientedProgramming.Labs.Lab2;

public class Customer {
    private String name;
    private String email;
    private double balance;

    public Customer(String name,String email) {
        this(name,email, 0);
    }
    public Customer(String name, String email, double balance) {
        this.name = name;
        this.email=email;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }
    public void buyBook(double price){
        if(balance<price){
            throw new IllegalArgumentException("Balance is not enough");
        }
        this.balance-=price;
        System.out.println("Kalan bütçe: "+ this.balance);

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void addBalance(double amount){
        this.balance += amount;
        System.out.println("Yeni bakiye: "+ this.balance);
    }
}
