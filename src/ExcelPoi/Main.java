package ExcelPoi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 101, 87.5),
                new Student("Bob", 102, 91.2),
                new Student("Charlie", 103, 78.9)
        );

        // Write to Excel
        ExcelWriter.writeStudentsToExcel(students);

        // Read from Excel
        List<Student> loaded = ExcelReader.readStudentsFromExcel();
        System.out.println("\n📋 Loaded from Excel:");
        for (Student s : loaded) {
            System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll() + ", Marks: " + s.getMarks());
        }
    }
}

