
import java.util.*;

public class firstTreeSet {

    public static void main(String[] args) {
        
        TreeSet<String> set = new TreeSet<>();

        set.add("Delta");     // O(log n)
        set.add("Alpha");     // O(log n)
        set.add("Charlie");   // O(log n)
        set.add("Bravo");     // O(log n)

        System.out.println(set); // [Alpha, Bravo, Charlie, Delta] — sorted order

        set.remove("Delta");     // O(log n)
        System.out.println(set.contains("Charlie")); // O(log n)
        System.out.println(set.size());              // O(1)
        System.out.println(set.isEmpty());           // O(1)

        System.out.println(set.first());             // O(log n)
        System.out.println(set.last());              // O(log n)

        System.out.println(set); // [Alpha, Bravo, Charlie]
    }
}
