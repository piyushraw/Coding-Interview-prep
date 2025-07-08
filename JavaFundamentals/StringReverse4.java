
import java.util.*;
import java.util.stream.Collectors;

public class StringReverse4 {

      public static String isReverse4(String str ) {
             List<Character> chars=new ArrayList<>();
             for(char ch: str.toCharArray()) {
                          chars.add(ch);
             }
             Collections.reverse(chars);
             String reversed=chars.stream().map(String::valueOf).collect(Collectors.joining());
             return reversed;
        }
    public static void main(String[] args) {
        String str="Let's go to Gurgaon";
        System.out.println(isReverse4(str));
    } 
}
