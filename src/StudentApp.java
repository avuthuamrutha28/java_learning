/*You're building a student console app that does the following:

Takes full name and extracts the first name using substring().

Validates if a student can take the exam based on:

Age >= 18

Has valid student ID

Uses ternary to display Pass/Fail based on marks.

Uses enhanced switch to display a message based on the student's branch:

CSE, ECE, EEE, MECH, etc.*/

import java.util.Scanner;
public class StudentApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //getting full name and substring
        System.out.print("Enter your name:");
        String fullName = scanner.nextLine();
        int spaceIndex = fullName.indexOf(" ");
        String firstName = (spaceIndex != -1) ? fullName.substring(0,spaceIndex) : fullName;

        //age and id check
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        System.out.print("Do you have a student ID(true/false)?");
        boolean hashId = scanner.nextBoolean();

        boolean eligible = (age >= 18) && hashId;
        System.out.println(eligible ? "You are eligible for the exam." : "You are not eligible.");

        //to teat pass or fail
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result:" + result);
        scanner.nextLine();

        //branch message
        System.out.print("Enter your branch (CSE, ECE, EEE, MECH): ");
        String branch = scanner.nextLine();

        String message = switch (branch) {
            case "CSE" -> "you belong to Computer Science!";
            case "ECE" -> "You belong to Electronics!";
            case "EEE" -> "Electrical branch detected!";
            case "MECH" -> "Mechanical minds at work!";
            default -> "Branch not recognized.";
        };

        System.out.println("Branch Info: " + message);

        System.out.println("\n Good Luck," + firstName + "!");
        scanner.close();
    }

}
