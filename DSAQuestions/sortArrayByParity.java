public class sortArrayByParity {

    public static int[] findArrayByParity(int[] input) {

          int n=input.length;
          int[] newOne=new int[n];
             int idx=0;

            for(int i=0;i<n;i++) {
                if(input[i] % 2 == 0) {
                newOne[idx++]=input[i];
                }  
                }  
                for(int j=0;j<n;j++) {
                    if(input[j] % 2 !=0) {
                    newOne[idx++]=input[j];
                }   
            }
            return newOne;
        }

    public static void main(String[] args) {
           
        int[] input={3,1,2,4};
        int[] result= findArrayByParity(input);

           for(int res: result) {
                System.out.println(res+" ");
            }  
    }
}