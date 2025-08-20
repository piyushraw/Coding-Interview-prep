
public class CountGoodTriplets {

    public static int findGoodTriplets(int[] nums, int a, int b, int c ) {

            int n=nums.length;
            int count=0;

            for(int i=0;i<n;i++) {
                for(int j=i+1;j<n;j++) {
                    for(int k=i+2;k<n;k++) {

                        if(i>=0 && j>i && k>j && n>k) {
                            if(Math.abs(nums[i]-nums[j])<=a && Math.abs(nums[j]-nums[k])<=b && Math.abs(nums[i]-nums[k])<=c) {
                                count++;
                            }
                        }
                    }
                }
            }
            return count;
    }

    public static void main(String[] args) {

        int[] arr={3,0,1,1,9,7};
        int a=7;
        int b=2;
        int c=3;
        System.out.println(findGoodTriplets(arr, a, b, c));
    }
}
