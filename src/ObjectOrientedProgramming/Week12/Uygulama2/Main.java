package ObjectOrientedProgramming.Week12.Uygulama2;

public class Main {
    public static void main(String[] args) {
        Publication[] publications=new Publication[3];
        publications[0]=new Book("Java Programing",29.99,"John Doe");
        publications[1]=new Magazine("Java Monthly",5.99,"December");
        publications[2]=new AudioBook("Learn Java in 30 Days",19.99,"John Smith");

        for(Publication publication:publications){
            publication.displayInfo();
            System.out.println();
        }
    }
}
