
public class ValidPalindrome {

    public static boolean isPalindrome(String str) {

        str=str.toLowerCase().replaceAll("[^a-z0-9]","");

        int n=str.length();
        String ModifiedString="";

          for(int i=n-1;i>=0;i--) {
             ModifiedString=ModifiedString+str.charAt(i);
          }
          
          if(str.equals(ModifiedString)) {
            return true;
          } 
          return false;
    }

    public static void main(String[] args) {
           String str="Was it a car or a cat I saw?";
           System.out.println(isPalindrome(str));   
    } 
}
