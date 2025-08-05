package collections;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(5);
        numbers.add(20);
        numbers.add(50);
        numbers.add(10);
        numbers.add(5);

        System.out.println("Numbers: " + numbers);
    }
}
