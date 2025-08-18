public class ValidMountainArray {

    public static boolean findValidMountainArray(int[] arr) {
                     
                if(arr.length<3) {
                    return false;
                } 

                int i=0;
                while(i+1<arr.length && arr[i]<arr[i+1]) {
                    i++;
                }
                if(i==0||i==arr.length-1) {
                    return false;
                }

                while(i+1<arr.length && arr[i]>arr[i+1]) {
                    i++;
                }
                if(i==arr.length-1) {
                    return true;
                }
                 return false;
                }

    public static void main(String[] args) {
          
        int[] arr={3,5,5};
        System.out.println(findValidMountainArray(arr));
    }
}
