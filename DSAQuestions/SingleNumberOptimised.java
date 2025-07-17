public class SingleNumberOptimised {

    public static int findSingleNumberOptimised(int[] nums) {
                    
        int n=nums.length;
        int singleNumber=0;
        
         for(int i=0;i<n;i++) {
             singleNumber=singleNumber^nums[i]; 
         }
         return singleNumber;       
    }
    public static void main(String[] args) {
             int[] nums={4,1,2,1,2};
             System.out.println(findSingleNumberOptimised(nums));
    }
}
