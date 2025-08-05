package ExcelPoi;

public class Student {
    private String name;
    private int roll;
    private double marks;

    public Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }
    public double getMarks() { return marks; }
}
