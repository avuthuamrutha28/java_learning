import java.util.*; // ✅ Still works

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List <Student> studentList = new ArrayList();

        while (true) {
            System.out.println("\n1. Add student with course");
            System.out.println("2. Add student without course");
            System.out.println("3. View All Students");
            System.out.println("4. Exit");
            System.out.print("Enter choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice==1){
                System.out.print("Enter Roll No: ");
                int roll = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Course: ");
                String course = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                studentList.add(new Student(roll, name, course));
            }else if (choice==2){
                System.out.print("Enter Roll No: ");
                int roll = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                studentList.add(new Student(roll, name));
            }else if (choice==3){
                for (Student student:studentList){
                    student.showDetails();
                }
            }else if (choice==4){
                System.out.println("Exiting...");
                break;

            }else{
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
