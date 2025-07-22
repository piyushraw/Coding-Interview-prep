public class SecondLargest {

      public static int findSecondLargest(int[] nums) {
                    
                  int n=nums.length;
                  int max=nums[0];

                 for(int i=0;i<n;i++) {
                      if(nums[i]>max) {
                         max=nums[i];
                      }
                 }
                   
                
                
      }

    public static void main(String[] args) {
        int[] nums={10,5,20,8,15};
        System.out.println(findSecondLargest(nums));   
    }
}
