package collections;
import java.util.*;

public class SetOperations {
    public static void main(String[] args){
        Set<String>SetA = new HashSet<>();
        Set<String>SetB = new HashSet<>();

        SetA.add("Apple");
        SetA.add("Banana");
        SetA.add("Cherry");

        SetB.add("Banana");
        SetB.add("Date");
        SetB.add("Berry");

        System.out.println("Set A: " + SetA);
        System.out.println("Set B: " + SetB);

        System.out.println("\n Does Set A contain Apple?" + SetA.contains("Apple"));

        SetA.remove("Cherry");
        System.out.println("Set A after removing Cherry: " + SetA);

        Set<String>Union = new HashSet<>(SetA);
        Union.addAll(SetB);
        System.out.println("Union of SetA And SetB: " + Union);

        Set<String> Intersection = new HashSet<>(SetA);
        Intersection.retainAll(SetB);
        System.out.println(" Intersection of SetA and SetB: " + Intersection);

        Set<String>Difference = new HashSet<>(SetA);
        Difference.removeAll(SetB);
        System.out.println("Difference of SetA and SetB: " + Difference);




    }
}
