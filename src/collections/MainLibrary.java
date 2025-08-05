package collections;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // Add sample books
        library.addBook(new Book(101, "Java Basics", "John"));
        library.addBook(new Book(102, "Python Crash Course", "Alice"));
        library.addBook(new Book(103, "C++ for Beginners", "Bob"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Show all books");
            System.out.println("2. Borrow book");
            System.out.println("3. Return book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book ID to borrow: ");
                    int borrowId = scanner.nextInt();
                    library.borrowBook(borrowId);
                    break;
                case 3:
                    System.out.print("Enter book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;
                case 4:
                    System.out.println("Thanks for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

