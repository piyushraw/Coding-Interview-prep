
public class PlusOne {

    public static int[] findPlusOne(int[] nums) {
           
            int n=nums.length;
            int newNumber=0;

            for(int i=0;i<n;i++) {
                newNumber=newNumber*10+nums[i];
            }
            newNumber+=1;                                                                                                                                                                                                                                                                                                                                                                                                      
            String str=Integer.toString(newNumber);

            int[] result=new int[str.length()];
            for(int i=0;i<str.length();i++) {
                  result[i]=str.charAt(i)-'0';    
            }
            return result;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] result=findPlusOne(nums);
        for(int res:result){
            System.out.println(res+" ");
        }
    }
}
