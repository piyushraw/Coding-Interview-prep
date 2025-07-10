import java.util.*;

public class FirstTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");       // O(log n)
        map.put(1, "One");         // O(log n)
        map.put(2, "Two");         // O(log n)

        System.out.println(map);   // Keys are sorted: [1, 2, 3]

        System.out.println(map.get(2));    // O(log n)
        map.remove(3);                     // O(log n)
        System.out.println(map.containsKey(1)); // O(log n)
        System.out.println(map.size());         // O(1)
        System.out.println(map.isEmpty());      // O(1)

        System.out.println("First key: " + map.firstKey()); // O(log n)
        System.out.println("Last key: " + map.lastKey());   // O(log n)
    }
}
