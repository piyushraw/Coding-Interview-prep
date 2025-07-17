public class SingleNumber {

    public static int findSingleOne(int[] nums){

        int n=nums.length;

        for(int i=0;i<n;i++) {
            int count=0;
            for(int j=0;j<n;j++) {
                if(nums[i]==nums[j]) {
                       count++;
                }  
                }
                if(count==1){
                    return nums[i];
                }
            }
            return 0;
        }

       public static void main(String[] args) {
           int[] nums={4,1,2,1,2};
           System.out.println(findSingleOne(nums));
       }
}
