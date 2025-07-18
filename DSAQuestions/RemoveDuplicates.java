import java.util.HashSet;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

            int n=nums.length;   
           HashSet<Integer>set=new HashSet<>(n);  
                    for(int num: nums) {
                        set.add(num);
                    }   
                  int k= set.size();
                  return k;
    }

       public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
