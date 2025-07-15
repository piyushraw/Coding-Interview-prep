public class MoveZeroesOptimised {

    public static int[] moveZeroesToEnd(int[] nums) {

           int n=nums.length;
            int left=0;
            int right=n-1;

            while(left < right) {
                 
                 if(nums[left]>0) {
                      left++;
                 }   else if(nums[right]==0) {
                          right--;
                 } else {
                        int temp=nums[left];
                          nums[left]=nums[right];
                          nums[right]=temp;
                 }
            }
            return nums;
    }     
     public static void main(String[] args)  {
        int[] nums={0,2,3,4,0,0,4,0};
        int[] result=moveZeroesToEnd(nums);

        for(int res:result) {
            System.out.println(res+" ");
        }
}
}
