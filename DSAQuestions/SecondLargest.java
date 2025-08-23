
import java.util.Arrays;
public class SecondLargest {

      public static int findSecondLargest(int[] nums) {
                   
                 Arrays.sort(nums);     // O(nlogn). {2,8,50,70,100}
                int n=nums.length;      // 5
                int max=nums[n-1];      // max= 5-1=4

                for(int i=n-2;i>=0;i--) {
                       if(nums[i] != max) {
                        return nums[i];
                       }
                }
                return 0;     
      }

        public static int findSecondLargestElement(int[] nums) {

                      int max=nums[0];

                        for(int num: nums) {
                              if(num > max) 
                                    max=num;
                        }
                            int secondMax=Integer.MIN_VALUE;
                            for(int num: nums) {
                                     if(num < max && num > secondMax) {
                                         secondMax=num;
                                     }     
                            }
                            return secondMax;
        }

    public static void main(String[] args) {
        int[] nums={100,50,70,8,2};
        System.out.println(findSecondLargest(nums)); 
        System.out.println(findSecondLargestElement(nums));  
    }
}
