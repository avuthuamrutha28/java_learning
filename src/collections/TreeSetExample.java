package collections;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<String> cities = new TreeSet<>();

        cities.add("Bangloore");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Hyderabad");
        cities.add("Kerala");

        System.out.println("Cities: " + cities);
    }
}
