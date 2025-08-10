import java.util.HashMap;
import java.util.Map;
public class MostFrequentElement {

    public static int findMostFrequentElement(int[] nums) {

                HashMap<Integer,Integer>map=new HashMap<>();
                for(int num: nums) {
                    map.put(num,map.getOrDefault(num,0)+1);
                }
                int max=0;
                int answer=Integer.MAX_VALUE;

                for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
                      int key=entry.getKey();                       // {5-3,4-1,6-3}
                      int freq=entry.getValue();  

                      if(freq>max) { // Hey
                            max=freq;       
                         }     
                      }
                      return max;
                 }

    public static void main(String[] args) {
             int[] nums={5,5,5,4,6,6,6};
             System.out.println(findMostFrequentElement(nums));
    }
}
