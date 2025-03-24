package ObjectOrientedProgramming.Labs.Lab2;

public class BookStore {
    public static void main(String[] args) {
        Book books[] = {
                new Book("Clean Code", "Pobert C. Martin", 2008, 600),
                new Book("Effective Clean", "Jashua Bloch", 2017, 1200)
        };
        System.out.println("\nKitaplar Başarıyla Eklendi");

        Customer[] customers = {
                new Customer("Gökhan Azizoğlu", "gazizoglu@cumhuriyet.edu.tr", 2000)

        };
        System.out.println("\nMüşteri Başarıyla eklendi");

        double balance = 0;

        String email = "gazizoglu@cumhuriyet.edu.t";
        Customer foundCustomer = null;
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {
                foundCustomer = c;
                break;
            }
        }
        if (foundCustomer == null) {
            throw new IllegalArgumentException("Müşteri bulunamadı");
        }
        String bookName = "Clean Cod";
        Book foundBook = null;
        for (Book b : books) {
            if (b.getName().equals(bookName)) {
                foundBook = b;
                break;
            }
        }
        if (foundBook == null) {
            throw new IllegalArgumentException("Kitap bulunamadı");
        }
        try {
            foundCustomer.buyBook(foundBook.getPrice());
            balance += foundBook.getPrice();
            System.out.println("\nKitap başarıyla satın alındı");
            foundCustomer.setBalance(0);
            foundBook.setName("gtftft");
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }
        System.out.println("Bakiye: " + balance);
    }
}

