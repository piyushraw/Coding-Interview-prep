import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class NumbersDisappearedInArray {

    public static List<Integer>findDisappearedNumberInArray(int[] nums) {
                 
             int n=nums.length;

             HashSet<Integer>set=new HashSet<>();
             List<Integer>list=new ArrayList<>();
             for(int num:nums) {
                   set.add(num);
             }
             for(int i=1;i<=n;i++) {
                   if(!set.contains(i)) {
                        list.add(i);
                   }
             }
             return list;
         } 

    public static void main(String[] args) {
        int[]nums={4,3,2,7,8,2,3,1};
        List<Integer>result=findDisappearedNumberInArray(nums);
        System.out.println(result);
    }
}
