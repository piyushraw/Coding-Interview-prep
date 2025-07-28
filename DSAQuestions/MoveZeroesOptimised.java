public class MoveZeroesOptimised {

    public void moveZeroesToEnd(int[] nums) {

                  int n=nums.length;
                  int nonZero=0;

                  for(int i=0;i<n;i++) {

                       if(nums[i]!=0) {
                         nums[nonZero++]=nums[i];
                       }
                  }

                  while(nonZero<n) {
                    nums[nonZero++]=0;
                  }
          
    }     
     public static void main(String[] args)  {

          int[] nums={0,3,4,2,1,6,7,0,4,0,3,0};

           MoveZeroesOptimised mzo=new MoveZeroesOptimised();
           mzo.moveZeroesToEnd(nums);

           for(int res: nums){
               System.out.println(res+" ");
           }
}
}
