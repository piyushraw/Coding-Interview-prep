public class CompressString {
    public static String findCompressStringCount(String str) {

        StringBuilder result=new StringBuilder(); 
        int n=str.length();

        for(int i=0;i<n;i++) {
            char currentChar=str.charAt(i);
            int count=0;

            while(i<n && str.charAt(i) == currentChar) {
                count++;
                i++;
            }
            result.append(currentChar).append(count);
        }
           return result.toString();
      }   
    
    public static void main(String[] args) {
        String str="aaaaabbbcc";
        String result=findCompressStringCount(str);
        System.out.println(result);
     }
   }
