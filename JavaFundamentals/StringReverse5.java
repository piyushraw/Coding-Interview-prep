
import java.util.*;
public class StringReverse5 {

     public static String isReverse5(String str ) {
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray()) {
            stack.add(c);
        }

        StringBuilder reversed=new StringBuilder();
        while(!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
          return reversed.toString();
        }
    public static void main(String[] args) {
        String str="Piyush";
        System.out.println(isReverse5(str));
    }  
}
