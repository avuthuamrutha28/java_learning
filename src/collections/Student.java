package collections;
import java.util.*;
class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks){
        this.id= id;
        this.name = name;
        this.marks = marks;


    }



    public String toString(){
        return "Id: " + id + "\n Name: " + name + "\n Marks: " + marks;
    }


}
