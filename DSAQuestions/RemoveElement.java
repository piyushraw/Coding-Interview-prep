public class RemoveElement {

    public static int elementRemove(int[] nums, int val) {
            
            int left=0;
            int n=nums.length;
            for(int right=0;right<n;right++) {
                if(nums[right] !=val)  {
                     nums[left]=nums[right];
                     left++;
                }
            }  
            return left;  
    }
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;
        System.out.println(elementRemove(nums, val)); 
     }
}
