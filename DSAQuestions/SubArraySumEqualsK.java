public class SubArraySumEqualsK {

        public static int findSubArraySum(int[] nums,int k) {

            int n=nums.length;
             int[] prefixSum=new int[n];
             prefixSum[0]=nums[0];
             for(int i=1;i<n;i++) {
                  prefixSum[i]=prefixSum[i-1] + nums[i];
             }

             int count=0;
              for(int i=0;i<n;i++) {
                for(int j=i;j<n;j++) {
                      int sum=0;
                       if(i==0) {
                        sum=prefixSum[j];
                       } else {
                         sum=prefixSum[j]-prefixSum[i-1];
                       }
                       if(sum==k) {
                        count+=1;
                       }
                }
              }
              return count;
        }

    public static void main(String[] args) {

        int[] nums={1,1,1};
        int k=2;
        System.out.println(findSubArraySum(nums, k));
    }
}
