import java.util.Stack;
public class MyStack {

    public static void main(String[] args) {
        Stack<Integer>stk=new Stack<>();
        stk.push(5);
        stk.push(4);
        stk.pop();
        System.out.println(stk.peek());
    }
}
 