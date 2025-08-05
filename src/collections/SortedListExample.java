package collections;
import java.util.*;

public class SortedListExample {
    public static void main (String[] args){
        List<Integer> nums = Arrays.asList(4,2,8,1);
        Collections.sort(nums);
        System.out.println("Sorted numbers: " + nums);

    }
}
