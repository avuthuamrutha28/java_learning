//mini project on arrays that covers array, 2D array and varargs


import java.util.Scanner;

public class Arraysminiproject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students:");
        int studentCount = scanner.nextInt();

        System.out.print("Enter number of subjects:");
        int subjectCount = scanner.nextInt();


        String[] studentNames = new String[studentCount];
        int[][] marks = new int[studentCount] [subjectCount];

        for (int i =0; i < studentCount; i++) {
            scanner.nextLine();
            System.out.print("\nEnter name of student " + (i +1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter marks for " + studentNames[i] + ": ");
            for (int j = 0; j < subjectCount; j++){
                System.out.print("subject " + (j+1) + ": ");
                marks[i][j] = scanner.nextInt();
            }

        }

        System.out.println("\n----- Marksheet -----");

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Name: " + studentNames[i]);

            System.out.println("Marks: ");
            for (int j = 0; j < subjectCount; j++){
                System.out.print(marks[i][j] + " ");
            }

            double avg = calculateAverage(marks[i]);
            int total = (int) (avg * subjectCount);
            char grade = getGrade(avg);

            System.out.println("\nTotal: " + total);
            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Grade: " + grade);
            System.out.println();
        }

        scanner.close();



    }

    public static double calculateAverage(int...marks){
        if (marks.length == 0) return 0;
        int sum =  0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public static char getGrade(double avg){
        int range = (int) avg/10;
        switch(range){
            case 10:
            case 9:
            case 8:
                return 'A';
            case 7:
                return 'B';
            case 6:
            case 5:
                return 'C';
            default:
                return 'F';





        }

    }

}


