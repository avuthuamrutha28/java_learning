package collections;
import java.util.*;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> Students = new ArrayList<>();


        while (true) {
            System.out.println("\n-----STUDENT MANAGER-----");
            System.out.println("1.Add student: ");
            System.out.println("2.View all students: ");
            System.out.println("3.Search students by Id: ");
            System.out.println("4.Delete student by Id: ");
            System.out.println("5.Sort by marks: ");
            System.out.println("6.Exit");
            System.out.print("Choose your choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student marks: ");
                    double marks = scanner.nextDouble();
                    Students.add(new Student(id, name, marks ));
                    System.out.print("Student detailes added");
                    break;

                case 2:
                    System.out.println("\n-----Student List-----");
                    for(Student s:Students) {
                        System.out.println(s);

                    }

                    break;

                case 3:
                    System.out.print("Enter id to serach: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (Student s : Students) {
                        if (s.id == searchId) {
                            System.out.println("Found: " + s);
                            found = true;
                            break;

                        }
                    }

                    if (!found) {
                        System.out.println("Student with Id " + searchId + "not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter id to delete: ");
                    int delId = scanner.nextInt();
                    boolean removed = Students.removeIf(s -> s.id == delId);

                    if (removed) {
                        System.out.println("Students deleted.");
                    }else {
                        System.out.println("Student with ID" + delId + "not found.");
                    }
                    break;
                case 5:
                    System.out.println("Sorted by marks(Low to high): " );
                    Students.sort(Comparator.comparingDouble(s -> s.marks));

                    for (Student s : Students){
                        System.out.println(s);
                    }
                    break;

                case 6:
                    System.out.println("Existing...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");


                }

            }
        }

    }

