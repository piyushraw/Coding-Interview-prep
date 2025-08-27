
import java.util.Arrays;
public class SubArrayGrouping {

    public static int findSubArrayGrouping(int[] nums, int k) {

                  Arrays.sort(nums);
                  int n=nums.length;
                  int count=0;
                  int size=0;

                  for(int i=n-1;i>=0;i--) {
                    size++;
                    int minVal=nums[i];
                    if(size*minVal >= k) {
                          count++;
                          size=0;
                    }
                  }
                  return count;
            }
    public static void main(String[] args) {
        int[] nums={2,3,5,1,4};
        int k=6;
        System.out.println(findSubArrayGrouping(nums, k));
    }
}
