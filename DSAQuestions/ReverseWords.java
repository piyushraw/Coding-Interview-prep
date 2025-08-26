public class ReverseWords {

    public static String reverseTheWords(String s) {

        StringBuilder result=new StringBuilder();
        int n=s.length();
        int left=0;

            for(int i=0;i<n;i++) {
                if(s.charAt(i)==' '|| i==n-1) {
                     int end=s.charAt(i)==' '? i-1:i;
                        for(int j=end;j>=left;j--) {
                            result.append(s.charAt(j));
                        }
                        if(i!=n-1) {
                            result.append(' ');
                        }
                        left=i+1;
                     }
                }
                return result.toString();
            }
    public static void main(String[] args) {
        String s="Mr Ding";
        System.out.println(reverseTheWords(s));
    }
}



// 