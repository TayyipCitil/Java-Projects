package ObjectOrientedProgramming.Week12.Uygulama2;

public abstract class Publication {
    protected String title;
    protected double price;

    public Publication(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public abstract void displayInfo();
}
