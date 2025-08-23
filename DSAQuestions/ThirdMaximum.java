public class ThirdMaximum {

    public static int findThirdMaximumNumber(int[] nums) {

             int n=nums.length;
             int max=nums[0];

             for(int i=0;i<n;i++) {
                   if(nums[i]> max) {
                        max=nums[i];
                   }
             }
             int secondMax=Integer.MIN_VALUE;
             for(int num: nums) {
                   if(num<max && num>secondMax) {
                             secondMax=num;
                   }
             }
             int thirdMax=Integer.MIN_VALUE;
             for(int num:nums) {
                    if(num<max && num<secondMax && num>thirdMax) {
                            thirdMax=num;
                    }
             }
             return secondMax;
            }

    public static void main(String[] args) {
        int[] nums={3,2,1,4};
        System.out.println(findThirdMaximumNumber(nums));
    }
}
