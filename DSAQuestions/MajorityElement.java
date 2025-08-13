public class MajorityElement {

    //   Tried with attendance(Frequency array) but it will not handle negative numbers.

    public static int findMajorityElement(int[] nums) {

                int n=nums.length;
                int ans=n/2;

                int max=0;
                for(int maxval:nums) {
                      if(maxval>max) {
                         max=maxval;
                      }
                }
                int[] newArr=new int[max+1];
                   for(int answer: nums) {
                         newArr[answer]++;
                   }

                   int m=newArr.length;
                   for(int i=0;i<m;i++) {

                       if(newArr[i]>ans) {
                           return i;
                       }
                   }
                   return -1;
                } 


    // Now lets try to do it with HashMap store the frequency of each element and compare it with variable storing n/2 and return that key.

    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(findMajorityElement(nums));
    }
}


