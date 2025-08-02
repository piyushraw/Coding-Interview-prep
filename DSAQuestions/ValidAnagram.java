
import java.util.HashMap;
public class ValidAnagram {

    public static boolean findValidAnagram(String firsString, String secondString) {

        if(firsString.length()!=secondString.length()) {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: firsString.toCharArray()) {
              map.put(c,map.getOrDefault(c,0)+1);
        }
          for(char ch: secondString.toCharArray()) {
                  if(map.containsKey(ch)) {
                    map.put(ch,map.get(ch)-1);
          }
        }
             for(int freq:map.values()) {
                if(freq!=0) {
                    return false;
                }
             }
             return true;
    }
    public static void main(String[] args){

        String firstString="jam";
        String secondtString="jar";
        System.out.println(findValidAnagram(firstString, secondtString));
    }
}
