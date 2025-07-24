public class NegativeNumbers {
 // Taking o(n) space and O(n) time complexity but need to improve on space side.

     public static  int[] negativeNumbersToBeginning(int[] nums) {
        int n=nums.length;
        int[] newArr=new int[n];
        int idx=0;

        for(int i=0;i<n;i++) {
              if(nums[i] <0) {
                newArr[idx++]=nums[i];
              }
        }

        for(int i=0;i<n;i++) {
            if(nums[i] > 0) {
                newArr[idx++]=nums[i];
            }
        }
       return newArr;
    }

    public static int[] begininningNegativeNumber(int[] nums) {

           int n=nums.length;
           int left=0;
           int right=n-1;

           while(left<right) {

            if(nums[left] < 0) {
               left++;
            } else if(nums[right] >=0){
                   right--;
            } else {
                int temp=nums[left];
                 nums[left]=nums[right];
                 nums[right]=temp;
                 left++;
                 right--;
            }
           }
             return nums;
    } 

    public static void main(String[] args) {

        int[] nums={1,-2,3,-4,5,-6};
        int[] result=negativeNumbersToBeginning(nums);
        int[] result2=begininningNegativeNumber(nums);

        for(int res2:result2) {
            System.out.println(res2+" ");
        }
       
         for(int res: result) {
          System.out.println(res+" ");
         }
    }
}
