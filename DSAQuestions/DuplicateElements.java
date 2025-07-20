import java.util.HashSet;
public class DuplicateElements {

       public static boolean findDuplicates(int[] nums) {

        HashSet<Integer> set= new HashSet<>(); 
            for(int num: nums) {

                  if(set.contains(num)) {
                      return true;
                  }
                  set.add(num);
              }
                 return false;
          }

       public static void main(String[] args) {

             int[] nums={1,2,3,3};
             int[] nums1={1,2,3,4};

             System.out.println(findDuplicates(nums));
             System.out.println(findDuplicates(nums1));
       }
}
