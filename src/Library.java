import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method for add books into library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method that shows a list of available books
    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    // Method to borrow book
    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.setBorrowed(true);
                return true;
            }
        }
        return false;
    }

    // Method to return book
    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isBorrowed()) {
                book.setBorrowed(false);
                return true;
            }
        }
        return false;
    }
}
