
public class TopKFrequentElement {

    public static int[] findTopKFrequentElements(int[] nums, int k) {

        int n=nums.length;
        int count=0;
        int[] result=new int[n];
        int idx=0;

        for(int i=0;i<n;i++) {
              for(int j=i+1;j<n;j++) {
                if(nums[i]==nums[j]) {
                    count++;
                }
                result[idx++]=count;

              }
        }
        return result;
    }
 
    public static void main(String[] args) {

        int[] nums={1,1,1,2,2,3};
        int k=2;
        int[] result=findTopKFrequentElements(nums, k);
        for(int res: result){
            System.out.println(res+" ");
        }
    }
}



/*  Yeh question try karna : 

Top K Frequent Elements
Given an integer array and a number k, find the k most frequent elements in the array.

Example One
{
"arr": [1, 2, 3, 3, 2, 4, 3, 1, 1],
"k": 2
}
Output:

[3, 1] */