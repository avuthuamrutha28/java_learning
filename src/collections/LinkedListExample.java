package collections;

import java.util.*;
public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.addFirst(10);
        numbers.addLast(15);
        System.out.println("before removel: " + numbers);

        numbers.removeFirst();

        System.out.println("after removel: " + numbers);

        numbers.size();
        System.out.println();
    }
}
