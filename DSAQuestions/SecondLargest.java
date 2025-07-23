
import java.util.Arrays;

public class SecondLargest {

      public static int findSecondLargest(int[] nums) {
                    
                  Arrays.sort(nums);      // {2,5,8,10,20} O(nlogn)

                  int n=nums.length;      //  5
                  int max=nums[n-1];      // 20

                  for(int i=n-2;i>=0;i--) {
                         if(nums[i] != max) {
                            return nums[i];
                         }
                  }
                   return -1; 
      }

    public static void main(String[] args) {
        int[] nums={10,5,20,8,2};
        System.out.println(findSecondLargest(nums));   
    }
}
