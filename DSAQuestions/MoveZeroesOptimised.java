public class MoveZeroesOptimised {

    public static int[] moveZeroesToEnd(int[] nums) {

        int n =nums.length;
        int nonZero =0;

        for (int i=0;i<n;i++) {
            if (nums[i]>0) {
                nums[nonZero++] = nums[i];
            }
        }

        for (int i=0;i<n;i++) {
            if (nums[i]==0) {
                nums[nonZero++] = nums[i];
            }
            
            }   
               return nums;
            }  
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,0,0,4,0};
        int[] result = moveZeroesToEnd(nums);
        for (int res : result) {
            System.out.println(res + " ");

        }
}
}
