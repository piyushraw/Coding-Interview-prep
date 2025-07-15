public class SortArraysByParityOptimised {

    public static int[] findArraysByParityOptimised(int[] nums) {

              int n= nums.length;
              int left=0;
              int right=n-1;

              while(left< right)  { 

                  if(nums[left] % 2 ==0) {
                            left++;
                  } else if(nums[right] % 2 !=0) {
                        right--;
                  }
                  else {
                        int temp= nums[left];
                        nums[left]=nums[right];
                        nums[right]=temp;
                        left++;
                        right--;
                  }
              }
              return nums;
             }
       public static void main(String[] args) {

        int[] nums={3,1,2,4};
        int[] result=findArraysByParityOptimised(nums);
         for(int res:result) {
            System.out.println(res+" ");
        }          
       }
}
