import java.util.Arrays;

public class TwoSumII {

    public static int[] findTwoSum(int[] arr1, int[] arr2, int target) {

             int n=arr1.length;
             int m=arr2.length;
             
             int left=0;
             int right=m-1;

               while(left<n && right>=0) {
                  
                   if(arr1[left]+arr2[right]== target) {
                    return new int[]{left, right};
                   } else if( arr1[left]+ arr2[right] < target) {
                           left++;
                   } else {
                        right--;
                   }
               }
              return new int[]{-1,-1};   
            }

    public static void main(String[] args) {

           int[] arr1={5,7,12,20,25,40};
           int[] arr2={2,4,10,20};
           int target=16;

           int[] result=findTwoSum(arr1,arr2,target);
               System.out.println(Arrays.toString(result));
    }
}
