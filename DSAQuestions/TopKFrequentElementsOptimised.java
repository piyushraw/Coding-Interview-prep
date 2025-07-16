import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElementsOptimised {

    public static int[] findTopKElements(int[] nums,int k) {
               
           HashMap<Integer,Integer>map=new HashMap<>();
           for(int num:nums) {
                map.put(num,map.getOrDefault(num,0)+1);
           }

           PriorityQueue<Integer>maxHeap=new PriorityQueue<>(
            (a,b)->map.get(b)-map.get(a)
           );

           maxHeap.addAll(map.keySet());

           int[] arr=new int[k];
           for(int i=0;i<k;i++) {
               arr[i]=maxHeap.poll();
           }
           return arr;
    }

    public static void main(String[] args) {

        int[] nums={1,2,2,3,3,3};
        int k=2;
        int[] result=findTopKElements(nums, k);
        for(int res:result) {
            System.out.println(res+" ");
        }
    }
}
