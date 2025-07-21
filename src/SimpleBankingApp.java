import java.util.Scanner;
public class SimpleBankingApp {
    static double balance = 1100.00;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Bank");
        System.out.println("_________________");

        do {
            System.out.println("\n ==========MENU==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.print("Thank you for banking with us!");
                    break;

                default:
                    System.out.print("Invalid choice. Try again.");

            }
        } while (choice!=4);
        scanner.close();
    }

    public static void checkBalance() {
        System.out.printf("Your current balance is: %.2f\n", balance);
    }

    public static void deposit(double amount) {
        if (amount>0) {
            balance += amount;
            System.out.printf("%.2f deposited successfully.\n", amount);

        }else {
            System.out.println("Invalid deposit amount");
        }
    }

    public static void withdraw(double amount) {
        if (amount>balance){
            System.out.println("Insufficient balance.");
        }else if (amount<=0) {
            System.out.println("Invalid withdrawal amount.");
        }else {
            balance -= amount;
            System.out.printf("%.2f withdrawn successfully.\n", amount);

        }
    }
}
