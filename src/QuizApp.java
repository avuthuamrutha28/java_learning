import java.util.Scanner;
import java.util.Random;
public class QuizApp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random =new Random();
        int score = 0;

        System.out.println("🎈Welcome to the java Quiz!🎈");

        System.out.print("Enter your Name:");
        String name = scanner.nextLine();
        System.out.printf("Hello%s! Let's start the quiz.\n\n", name);

        System.out.println("Q1.What is the correct syntax to declare a variable in java?");
        System.out.println("A. int x = 5;");
        System.out.println("B. x = int 5;");
        System.out.println("C. 5 = int x;");
        System.out.print("your answer is (A/B/C): ");
        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase ("A")) {
            System.out.println("✅ Correct\n");
            score++;
        } else {
            System.out.println("❌ Wrong answer\n");
            System.out.println("Correct answer is: A\n");
        }

        //second question
        int number = random.nextInt(10);
        System.out.printf("Q2. Guess a number between 0 and 9: ");
        int guess = scanner.nextInt();
        scanner.nextLine();

        if (guess == number) {
            System.out.println("yes your guess is correct.");
            score++;
        } else {
            if (guess > number) {
                System.out.println("your guess is Too high! The number is: " +number);
            } else {
                System.out.println("your guess is Too low! The number is: "+number);
            }
        }

        //3rd question
        System.out.println("\nQ3. What is the output of \"Java\".toUpperCase()?");
        System.out.println("A. java");
        System.out.println("B. JAVA");
        System.out.println("c. Java");
        System.out.print("Your answer is (A/B/C):");
        String answer3 = scanner.nextLine();

        if (answer3.equalsIgnoreCase("B")) {
            System.out.println("✅Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong answer! The correct answer is: B\n");
        }

        System.out.printf("\n%s, Your final score is: %d/3\n", name, score);
         if (score==3) {
             System.out.println("Excellent you are a Java pro.");
         } else if (score==2) {
             System.out.println("Good job! Keep practicing.");
         } else {
             System.out.println("Don't worry, Practice more you will be perfect.");
         }
         scanner.close();




    }
}
