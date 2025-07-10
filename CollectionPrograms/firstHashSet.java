import java.util.*;

public class firstHashSet {

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();

        set.add("Apple");       // O(1)
        set.add("Banana");      // O(1)
        set.add("Cherry");      // O(1)
        set.add("Banana");      // O(1) — duplicate, ignored

        System.out.println(set); // Order NOT guaranteed

        set.remove("Cherry");     // O(1)
        System.out.println(set.contains("Apple")); // O(1)
        System.out.println(set.size());            // O(1)
        System.out.println(set.isEmpty());         // O(1)

        set.clear();                    // O(n)
        System.out.println(set);        // []
        System.out.println(set.isEmpty()); // true
    }
}
