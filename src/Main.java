public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        Book comic1 = new Book("The Amazing Spider-Man", "Stan Lee");
        Book comic2 = new Book("Batman: The Dark Knight Returns", "Frank Miller");
        Book comic3 = new Book("Watchmen", "Alan Moore");

        library.addBook(comic1);
        library.addBook(comic2);
        library.addBook(comic3);

        library.displayAvailableBooks();

        if (library.borrowBook("The Amazing Spider-Man")) {
            System.out.println("Successfully borrowed 'The Amazing Spider-Man'.");
        } else {
            System.out.println("'The Amazing Spider-Man' is not available.");
        }

        library.displayAvailableBooks();

        if (library.returnBook("The Amazing Spider-Man")) {
            System.out.println("Successfully returned 'The Amazing Spider-Man'.");
        } else {
            System.out.println("'The Amazing Spider-Man' was not borrowed.");
        }

        library.displayAvailableBooks();
    }
}
