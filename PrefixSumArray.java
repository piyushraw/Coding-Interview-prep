
import java.util.*;
public class PrefixSumArray {
    public static int[] findPrefixSum(int[] arr) {

        int n=arr.length;
        int[] prefixSum=new int[n];
        prefixSum[0]=arr[0];

        for(int i=1;i<n;i++) {
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
           return prefixSum;           
        } 
    public static void main(String[] args) {

           int[] arr={2,5,7,10,12,5};
           int[] result=findPrefixSum(arr);
           System.out.println(Arrays.toString(result));
    }
}
