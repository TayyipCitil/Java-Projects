package ObjectOrientedProgramming.Week12.Uygulama2;

public class Book extends Publication{
    private  String author;

    public Book( String title,double price, String author) {
        super(price, title);
        this.author = author;
    }

    @Override
    public void displayInfo(){
        System.out.println("Book Tittle: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
