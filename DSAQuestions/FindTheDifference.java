import java.util.HashMap;
import java.util.Map;
public class FindTheDifference {

    public static char findTheDifferentCharacter(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ans:s.toCharArray()) {
            map.put(ans,map.getOrDefault(ans,0)+1);
        }
          for(char result:t.toCharArray()) {
            map.put(result,map.getOrDefault(result,0)-1);
          }

          for(Map.Entry<Character,Integer> entry:map.entrySet()) {
               char key=entry.getKey();
               int value=entry.getValue();
          
          if(value==-1) {
            return key;
          }
        }
           return ' ';
        }
    public static void main(String[] args) {

        String s="abcd";
        String t="abcde";
        System.out.println(findTheDifferentCharacter(s,t));
    }
}
