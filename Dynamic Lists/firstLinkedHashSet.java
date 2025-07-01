import java.util.*;

public class firstLinkedHashSet {

    public static void main(String[] args) {
        
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        set.add("Apple");      // O(1)
        set.add("Banana");     // O(1)
        set.add("Cherry");     // O(1)
        set.add("Banana");     // O(1) — duplicate, ignored

        System.out.println(set); // [Apple, Banana, Cherry] — insertion order preserved

        set.remove("Apple");     // O(1)
        System.out.println(set.contains("Cherry")); // O(1)
        System.out.println(set.size());             // O(1)
        System.out.println(set.isEmpty());          // O(1)

        System.out.println(set); // [Banana, Cherry]
    }
}
