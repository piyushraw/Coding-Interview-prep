public class StringReverse {

    public static String isReverse(String str ) {
        String revString="";
        int n=str.length();
        for(int i=n-1;i>=0;i--) {
            revString+=str.charAt(i);  
        }
        return revString;
        }
    public static void main(String[] args) {
        String str="Piyush";
        System.out.println(isReverse(str));
    } 
}
