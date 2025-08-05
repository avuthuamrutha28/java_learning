package collections;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Before Removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        boolean removed = fruits.remove("Mango");
        System.out.println("\nWas 'Apple' removed? " + removed);

        System.out.println("\nAfter Removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
