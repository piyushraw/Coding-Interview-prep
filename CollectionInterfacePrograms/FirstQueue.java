import java.util.*;

public class FirstQueue {

    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        queue.add("One");       // O(1)
        queue.add("Two");       // O(1)
        queue.add("Three");     // O(1)

        System.out.println(queue); 

        System.out.println(queue.remove()); // O(1) 
        System.out.println(queue.peek());   // O(1) 
        System.out.println(queue.isEmpty()); // O(1)
        System.out.println(queue.size());    // O(1)

        System.out.println(queue); 
    }
}
