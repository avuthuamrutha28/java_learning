package collections;
import java.util.*;

public class MapExample1 {
    public static void main(String[] args){
        Map<String, String> countrycapital = new HashMap<>();
        //to get in order as we insert use LinkedHashMap
        //use TreeMap to get in sorted based on keys

        countrycapital.put("India", "Delhi");
        countrycapital.put("USA", "Washington D.C.");
        countrycapital.put("France", "Paris");

        System.out.println("Capital of India" + " " + countrycapital.get("India"));
        System.out.println("All Countries: " + countrycapital.keySet());
        System.out.println("All Capitals: " + countrycapital.values());
        System.out.println("All countries and capitals: " + " " + countrycapital.entrySet());

    }
}
