
import java.util.Arrays;
public class AscendingOrder {

    public static int[] findAscendingOrder(int[] nums) {
                
             int n=nums.length;
             int temp=0;

             for(int i=0;i<n-1;i++) {
                for(int j=0;j<n-1;j++) {

                    if(nums[j] > nums[j+1]) {
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
             }
             return nums;
    }

    public static int[] sorting(int[] nums) {
             Arrays.sort(nums);
             return nums;
    }

    public static void main(String[] args) {
        int[] nums={3,1,4,2};
        int[] result=findAscendingOrder(nums);
        for(int res:result) {
             System.out.println(res);
        }
        System.out.println();
        sorting(nums);
        for(int res:result) {
             System.out.println(res);
        }
    }
}
