import java.util.HashMap;
public class FirstNonRepeatingElement {

    public static int findFirstNonRepeatingElement(int[] nums) {

            HashMap<Integer,Integer> map=new HashMap<>();
               for(int num:nums) {
                    map.put(num,map.getOrDefault(num,0)+1);
               }
               
                      for(int result:nums) {
                        if(map.get(result)==1) {
                            return result;
                        }
                      }
                      return -1;
    }

    public static void main(String[] args) {
        int[] nums={4,5,1,2,0,4};
        System.out.println(findFirstNonRepeatingElement(nums));
    }
}
