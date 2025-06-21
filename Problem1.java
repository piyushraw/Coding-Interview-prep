
public class Problem1 {

    public static boolean findDuplicate(int[] nums) {
         int n= nums.length;

          for(int i=0;i<n;i++) {

            for(int j=i+1;j<n;j++) {

                  if(nums[i]== nums[j]) {

                         return true;
                  }
              }

          }
                return false;         
    }

    /* 
    TC:  O(n^2) 
    SC:  O(1) 
    */  
   
    public static void main(String[] args){

        int [] nums={1,2,3,3};
        int[] nums1={1,2,3,4};

        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicate(nums1));

    }
    
}
