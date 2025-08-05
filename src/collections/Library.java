package collections;



import java.util.*;

public class Library {
    private Map<Integer, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void showAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void borrowBook(int id) {
        Book book = books.get(id);
        if (book != null) {
            if (book.isAvailable()) {
                book.borrowBook();
                System.out.println("You borrowed: " + book.getTitle());
            } else {
                System.out.println("Book is already borrowed.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(int id) {
        Book book = books.get(id);
        if (book != null) {
            if (!book.isAvailable()) {
                book.returnBook();
                System.out.println("You returned: " + book.getTitle());
            } else {
                System.out.println("Book was not borrowed.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}

