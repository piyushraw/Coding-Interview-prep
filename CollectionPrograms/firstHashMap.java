import java.util.*;

public class firstHashMap {

    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "Three");       // O(1)
        map.put(1, "One");         // O(1)
        map.put(2, "Two");         // O(1)
        map.put(1, "Uno");         // O(1) — updates value for key 1

        System.out.println(map);   // Order is NOT guaranteed

        System.out.println(map.get(2));    // O(1)
        map.remove(3);                     // O(1)
        System.out.println(map.containsKey(1)); // O(1)
        System.out.println(map.size());         // O(1)
        System.out.println(map.isEmpty());      // O(1)
    }
}
