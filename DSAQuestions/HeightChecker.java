
import java.util.Arrays;

public class HeightChecker {

    public static int haveHeightChecker(int[] nums) {

              int n=nums.length;
              int[] expected=new int[n];
              int index=0;
              
                for(int num:nums) {
                expected[index++]=num;
              }
              Arrays.sort(expected);

              int count=0;
              for(int i=0;i<n;i++) {
                   if(nums[i]!=expected[i]) {
                      count++;
                   }
              }
              return count;
           } 

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(haveHeightChecker(nums));
    }
}
