import java.util.*;

public class FirstStack {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        
        stack.push("A");        // O(1)
        stack.push("B");        // O(1)
        stack.push("C");        // O(1)

        System.out.println(stack); // [A, B, C]

        System.out.println(stack.pop());   // O(1) 
        System.out.println(stack.peek());  // O(1) 
        System.out.println(stack.isEmpty()); // O(1)
        System.out.println(stack.size());    // O(1)

        System.out.println(stack); // [A, B]
    }
}
