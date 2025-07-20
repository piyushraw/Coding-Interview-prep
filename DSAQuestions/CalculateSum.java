public class CalculateSum {
     
    public static int FindTotalSum(int[] arr) {
          
          int n=arr.length;
          int result=0;
        for(int i=0;i<n;i++) {
            result=result+arr[i];
        } 
        return result;
    }

    public static void main(String[] args) {

        int[] nums={2,4,6,8,10};
        System.out.println(FindTotalSum(nums));
    } 
}
