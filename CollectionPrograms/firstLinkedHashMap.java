import java.util.*;

public class firstLinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Three");       // O(1)
        map.put(1, "One");         // O(1)
        map.put(2, "Two");         // O(1)

        System.out.println(map);   // Order preserved: insertion order

        System.out.println(map.get(1));    // O(1)
        map.remove(3);                     // O(1)
        System.out.println(map.containsKey(2)); // O(1)
        System.out.println(map.size());         // O(1)
        System.out.println(map.isEmpty());      // O(1)
    }
}
