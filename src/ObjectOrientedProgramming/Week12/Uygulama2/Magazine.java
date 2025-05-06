package ObjectOrientedProgramming.Week12.Uygulama2;

public class Magazine extends Publication{
    private String issue;

    public Magazine( String title,double price, String issue) {
        super(price, title);
        this.issue = issue;
    }

    @Override
    public void displayInfo(){
        System.out.println("Book Tittle: "+title);
        System.out.println("Issue: "+issue);
        System.out.println("Price: "+price);
    }
}
