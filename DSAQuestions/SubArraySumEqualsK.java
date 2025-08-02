import java.util.HashMap;
public class SubArraySumEqualsK {


        public static int findSubArraySum(int[] nums,int k) {

          int sum=0;
          int ans=0;
          int n=nums.length;

          HashMap<Integer,Integer> map=new HashMap<>();
          map.put(0,1);

          for(int i=0;i<n;i++) {
            sum=sum+nums[i];
             int temp=sum-k;

             if(map.containsKey(temp)){
              ans=ans+map.get(temp);
             }
             map.put(sum,map.getOrDefault(sum,0)+1);
          }
          return ans;
        }

    public static void main(String[] args) {

        int[] nums={1,2,3};
        int k=3;
        System.out.println(findSubArraySum(nums, k));
    }
}
