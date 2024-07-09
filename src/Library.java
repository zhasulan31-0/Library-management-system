import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
    System.out.println("Library Inventory:");
    for (Book book : books) {
        String status = book.isBorrowed() ? "Not Available" : "Available";
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " - " + status);
    }
}



    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.setBorrowed(true);
                return true;
            }
        }
        return false;
    }

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

