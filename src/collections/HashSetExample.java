package collections;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");

        System.out.println("fruits: " + fruits);

    }
}
