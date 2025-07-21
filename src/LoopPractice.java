import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Print numbers from 1 to N");
            System.out.println("2. Print even numbers from 1 to N");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            if (choice == 1) {
                int n;
                do {
                    System.out.print("Enter a positive number: ");
                    n = scanner.nextInt();
                } while (n <= 0);  // do-while ensures at least one input

                System.out.println("Numbers from 1 to " + n + ":");
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }

            } else if (choice == 2) {
                int n;
                do {
                    System.out.print("Enter a positive number: ");
                    n = scanner.nextInt();
                } while (n <= 0);

                System.out.println("Even numbers from 1 to " + n + ":");
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        continue;  // skip odd numbers
                    }
                    System.out.print(i + " ");
                }

            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;  // exit the while loop and program
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
