public class RotateArray {

    public void rotate(int[] nums, int k) {

        int n=nums.length;
        int[] arr=new int[n];
        int idx=0;
        int idm=0;

        //Rotation of array

        for(int i=n-1;i>=0;i--) {
            arr[idx++]=nums[i];
        }
        int[] arr1=new int[n];

        for(int i=k-1;i>=0;i--) {
            arr1[idm++]=arr[i];
        }
        for(int i=n-1;i>=k;i++) {
            arr1[idm++]=arr[i];
        }
        for(int newArr:arr1) {
            System.out.println(newArr+" ");
        }
    }
    public static void main(String[] args) {
        RotateArray ra=new RotateArray();
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
       ra.rotate(nums, k);
    }
}
