public class DutchNationalFlag { 

    public static int[] maintainSort(int[] nums) {

        int n=nums.length;

         for(int i=0;i<n-1;i++) {
            for (int j=0;j<n-1;j++) {

                if(nums[j]> nums[j+1]) {
                     int temp=nums[j];
                       nums[j]=nums[j+1];
                       nums[j+1]=temp;
                }
            }
         }
         return nums; 
    }
    
 public static void main(String[] args) {
    int[] nums={2,0,2,1,1,0};
    int[] result=maintainSort(nums);
    for(int res:result) {
        System.out.println(res+" ");
    }
}
}
