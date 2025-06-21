
public class TwoSum {

  public static int[] findTargetSum(int[] nums,int target) {

       int num= nums.length;

       int leftPointer=0;
       int rightPointer=num-1;

       while(leftPointer< rightPointer) {

             if(nums[leftPointer] + nums[rightPointer] == target) {

                       return new int[]{leftPointer, rightPointer};

             }  else if(nums[leftPointer] + nums[rightPointer] > target) {
                        rightPointer--;
             }  else {
                        leftPointer++;
             }
       }

       return new int[]{};
}

/* 

 TC: O(N)
 SC: O(1)

 */

public static void main(String[] args) {

        int[] nums={3,4,5,6};
        int target=7;

        int[] output=findTargetSum(nums, target);
           for(int num: output) {
             System.out.println(num+" ");
            }
          }
        }
