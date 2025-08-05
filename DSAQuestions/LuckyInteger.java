import java.util.HashMap;
import java.util.Map;
public class LuckyInteger {

    public static int findLuckyInteger(int[] arr) {

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr) {
              map.put(num,map.getOrDefault(num,0)+1);
           }
        int max=-1;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
                  int key=entry.getKey();
                  int value=entry.getValue();

                  if(key==value) {
                         if(key>max) {
                           max=key;
                         }
                  }    
              }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,3};
        System.out.println(findLuckyInteger(nums));
    }
}
