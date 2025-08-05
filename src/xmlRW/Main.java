package xmlRW;



import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Amrutha", 95));
        students.add(new Student(2, "Rahul", 88));

        String filePath = "students.xml";

        // Write to XML
        XMLWriter.writeStudentsToXML(students, filePath);

        // Read from XML
        System.out.println("Reading from XML:");
        XMLReader.readStudentsFromXML(filePath);
    }
}

