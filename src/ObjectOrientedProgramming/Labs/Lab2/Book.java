package ObjectOrientedProgramming.Labs.Lab2;

public class Book {
    private double price;
    private String author;
    private int publishYear;
    private String name;

    public Book(String name, String author,int publishYear,double price) {
        this.price=price;
        this.author=author;
        this.publishYear=publishYear;
        this.name=name;
    }
    public Book(String author,String name) {
        this(name,author,0,0.0);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getName() {
        return name;
    }
}
