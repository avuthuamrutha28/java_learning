 import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n Menu");
            System.out.println("1. Add");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square");
            System.out.println("6. Exit");
            System.out.print("Enter your choice(1-6): ");
            choice=scanner.nextInt();

            if(choice==6){
                System.out.println("Exiting! Thanks(❁´◡`❁)");
                break;
            }

            int num1 = 0, num2 = 0;
            double result;


            if(choice != 5) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
            } else {
                System.out.print("Enter number to square: ");
                num1 = scanner.nextInt();
            }

            switch (choice) {

                case 1:
                    result = Add(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = Subtraction(num1,num2);
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = Multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    result = Divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 5:
                    result = Square(num1);
                    System.out.println("Square is: " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

        }while (true);

        scanner.close();





    }

    public static int Add(int a, int b) {
        return a + b;
    }

    public static double Add(double a, double b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static double Divide(int a, int b) {
        if (b==0) {
            System.out.println("cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static int Square(int a) {
        return a * a;
    }

}
