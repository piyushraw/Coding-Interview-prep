
import java.util.Arrays;
public class ContainsDuplicate {

    public static boolean findDuplicate(int[] nums) {
                
                int n=nums.length;
                for(int i=0;i<n;i++) {
                    for(int j=i+1;j<n;j++) {
                          if(nums[i]==nums[j]) {
                               return true;
                          }
                    }
                }
                return false;
         }

         public static boolean findDuplicateContainsSorting(int[] nums) {
              
                         Arrays.sort(nums);
                         int n=nums.length;

                         for(int i=1;i<n;i++) {
                            if(nums[i]==nums[i-1]) {
                                return true;
                            }
                         }
                         return false;                  
                    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicateContainsSorting(nums));
    } 
}
