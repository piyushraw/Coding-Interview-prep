public class MoveZeroes {

    public static int[] moveZeroesEnd(int[] nums) {

              int n=nums.length;
              int[] arr=new int[n];
              int idx=0;

              for (int i=0;i<n;i++) { 
                     if(nums[i]>00) {
                    arr[idx++] = nums[i];
                     }
                   }
                   
                   for(int i=0;i<n;i++) {
                        if(nums[i] ==0) {
                            arr[idx++]=nums[i];
                        } 
                         }
                   return arr;    
    }

    public static void main(String[] args) {

            int[] nums={0,2,3,1,0,0,4,3,7,87,54,0};
            int[] result=moveZeroesEnd(nums);

              for(int res:result) {
                System.out.println(res+" ");
              }
    }
}
