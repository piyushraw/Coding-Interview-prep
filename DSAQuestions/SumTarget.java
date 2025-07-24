import java.util.HashSet;
public class SumTarget {

    public static int[] findSumTarget(int[] nums, int targetSum) {

           int n=nums.length;

           for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[i] + nums[j] == targetSum) {
                       return new int[] {nums[i],nums[j]};
                }
            }
           }
           return new int[]{};      
    } 

     public static void findSumTarget2(int[] nums,int targetSum) {
           
        HashSet<Integer>set=new HashSet<>();   // set= empty

        for(int num: nums) {
            int compliment=targetSum-num;
               if(set.contains(compliment)) {
                     System.out.println("("+compliment+","+num+")");
               } 
               set.add(num);
        }

     }

    public static void main(String[] args) {
        int [] nums={2,7,4,5,1,3};
        int targetSum=6;

        findSumTarget2(nums, targetSum);

       int[] result= findSumTarget(nums, targetSum);
        for(int res: result) {
               System.out.println(res+" ");
        }     
    }
}
