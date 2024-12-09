package LibraryManagement_Labs2;

public class Client {
    public static void main(String[] args) {
        LibraryManagementSystem lbms = new LibraryManagementSystem();

        Book book1 = new TextBook("Ncert", "123", "Arko", 1, "Science");
        Book book2 = new NovelBook("245", "Champak", "Arko", "Comic");

        lbms.addBook(book1);
        lbms.addBook(book2);

        User user = new Member("Arko", "");
        User user2 = new Member("Mohit", "");

        lbms.registerUser(user);
        lbms.registerUser(user2);

        if(book1.lend(user)){
            System.out.println("Successfully lent the book");
        }

        if(book1.lend(user2)){
            System.out.println("Successfully lent the book");
        }
        else{
            System.out.println("Book is already lent");
        }

        book1.returnBook(user);

    }
}
