public class StringReverse3 {

     public static String isReverse3(String str ) {
               char[] chars=str.toCharArray();
               int n=chars.length;
               int left=0;
               int right=n-1;
               while(left<right) {
                    char temp= chars[left];
                     chars[left]=chars[right];
                     chars[right]=temp;   
                     left++;
                     right--;
               }
               String reversed=new String(chars);
               return reversed;
        }

    public static void main(String[] args) {
        String str="Good Morning";
        System.out.println(isReverse3(str));
    } 
}
