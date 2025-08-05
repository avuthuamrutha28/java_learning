package collections;
import java.util.*;

public class StreamExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "orange", "pineapple", "avacado");

        list.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .sorted()
                .forEach(System.out::println);

    }
}
