
import java.util.HashMap;

public class ValidAnagram {

    public static boolean findValidAnagram(String firsString, String secondString) {

              HashMap<Character,Integer> map= new HashMap<>();

              for(char c: firsString.toCharArray()) {
                
                     map.put(c,map.getOrDefault(c,0)+1);
              }

              for(char c: secondString.toCharArray()) {
                     if(!map.containsKey(c)) {
                        return false;
                     } 

                     map.put(c,map.get(c)-1);
                       if(map.get(c) < 0)  {
                        return false;
                    }
              }

          return true;
    }

    public static void main(String[] args){

        String firstString="jar";
        String secondtString="jam";
        String thirdString="carrace";
        String fourthtString="racecar";

        System.out.println(findValidAnagram(firstString, secondtString));
        System.out.println(findValidAnagram(thirdString, fourthtString));
    }
}
