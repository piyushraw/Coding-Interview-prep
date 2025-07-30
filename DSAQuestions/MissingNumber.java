public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
           
             int n=nums.length;
             int number=0;
             int sum=0;

             for(int i=0;i<n;i++) {
                   number=number+nums[i];
                }
             for(int i=0;i<=n;i++) {
                sum=sum+i;
             }
             
             int total=sum-number;
             return total;
            }

    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingNumber(nums));
    } 
}
