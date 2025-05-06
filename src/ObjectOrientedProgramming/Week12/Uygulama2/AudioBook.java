package ObjectOrientedProgramming.Week12.Uygulama2;

public class AudioBook extends Publication{
    private String narrator;

    public AudioBook( String title,double price, String narrator) {
        super(price, title);
        this.narrator = narrator;
    }

    @Override
    public void displayInfo(){
        System.out.println("Book Tittle: "+title);
        System.out.println("Narrator: "+narrator);
        System.out.println("Price: "+price);
    }
}
