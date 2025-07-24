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

    public static void main(String[] args) {

        int[] nums={1,-2,3,-4,5,-6};
        int[] result=negativeNumbersToBeginning(nums);
       
         for(int res: result) {
          System.out.println(res+" ");
         }
    }
}
