package collections;
import java.util.*;

public class MapExample2 {
    public static void main(String[] args){
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Bheem");
        students.put(2, "Arjun");
        students.put(3, "Krishna");

        for(Map.Entry<Integer, String> entry:students.entrySet()){
            System.out.println("ID:" + " " + entry.getKey() + " " + "Name:" + " " + entry.getValue());
        }

        if(students.containsKey(1)){
            System.out.println("This is" + " " + students.get(1) + " " + "ID");
        }

        if(students.containsValue("Krishna")){
            for(Map.Entry<Integer, String> entry : students.entrySet())
                if(entry.getValue().equals("Krishna")){
                    System.out.println("The ID for Krishna is: " + students.get("Krishna"));

                }
        students.remove(2);
            System.out.println(students);


        }
    }
}
