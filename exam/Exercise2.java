import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book { " + "Title: '" + title + "', Author: '" + author + "' }";
    }
}

class BookShelf {
    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(String title) {

        Book b1= find(title);
	if (b1!= null) {
	    books.remove(b1);
	}
    }

    public Book find(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("\nFound Book: '" + title + "'");
                return book;
            }
        }

	// System.out.println("\n The book: '" + title + "' not found.");
        return null;
    }

    public void display() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class Exercise2{

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.add(new Book("Robotics", "Richard Murray"));
        shelf.add(new Book("Optimization based control", "Ahmed Kheddar"));
        shelf.add(new Book("Probabilistic Principal Component Analysis", "ME Tipping"));

        System.out.println("List all the Books on the BookShelf:");
        shelf.display();

        shelf.find("Robotics");
        
        System.out.println("Removing 'Optimization based control' from shelf.");

	shelf.remove("Impact-Aware robotics");
	shelf.remove("Optimization based control");

        System.out.println("Updated BookShelf:");
        shelf.display();
    }

}
