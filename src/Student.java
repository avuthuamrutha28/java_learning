public class Student {
    int rollNo;
    String name;
    String course;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
        this.course = "Not Assigned";
    }

    Student(int rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = "course";
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Course: " + course);
    }
}
