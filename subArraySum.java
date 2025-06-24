
import java.util.*;
public class subArraySum {

    public static int findSubarraySum(int[] nums, int k) {

      int n=nums.length;

      HashMap<Integer,Integer> map=new HashMap<>();
      
      map.put(0,1);
      int currentSumCalculatedSoFar=0;
      int answer=0;

      for(int i=0;i<n;i++) {

        currentSumCalculatedSoFar+=nums[i];

        int temp=currentSumCalculatedSoFar-k;

        if(map.containsKey(temp)) {
            answer+=map.get(temp);
        }
           map.put(currentSumCalculatedSoFar,map.getOrDefault(currentSumCalculatedSoFar,0)+1);
       }
         return answer;
        }
    public static void main(String[] args) {

        int[] nums={1,1,1};
        int k=2;
        System.out.println(findSubarraySum(nums,k));
    } 
}
