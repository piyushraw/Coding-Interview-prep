public class CalculateSum {
     
    public static int findTotalSum(int[] arr) {
          
          int n=arr.length;
          int result=0;
        for(int i=0;i<n;i++) {
            result=result+arr[i];
        } 
        return result;
    }

    public static int countEvenNumbers(int[] nums) {

               int n=nums.length;
               int count=0;

             for(int i=0;i<n;i++) {
                if(nums[i]%2==0) {
                    count++;
                }
             }
              return count;
}

public static int[] reverseArray(int[] nums) {
             
             int n=nums.length;
             int[] res=new int[n];
             int idx=0;

             for(int i=n-1;i>=0;i--) {
                   res[idx++]=nums[i];
             }
             return res;
}

     public static int findSmallest(int[] nums) {
                  
          int n=nums.length;
          int small=nums[0];

          for(int i=0;i<n;i++) {
              if(nums[i] < small) {
                     small=nums[i];
              }
          }
          return small;
     }

    public static void main(String[] args) {

        int[] arr={2,4,6,8,10};
        int[] nums={1,2,3,4,5,6};
        int[] num={1,2,3,4,5};
        int[] result={12,5,7,3,19};

        int[] reverseCount=reverseArray(num);

        System.out.println(reverseCount.toString());
        System.out.println(findTotalSum(arr));
        System.out.println(countEvenNumbers(nums));
        System.out.println(findSmallest(result));
    } 
}
