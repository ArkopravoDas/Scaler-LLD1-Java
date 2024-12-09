package LibraryManagement_Labs2;

public class NovelBook extends Book {
    private String genre;

    NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }
    @Override
    public void displayBookDetails(){
        System.out.println("Genre: " + genre);
    }
}
