public class Maximum69 {

    public static int findMaximum69(int num) {

        String str=String.valueOf(num);
        int[] newArr=new int[str.length()];

        for(int i=0;i<str.length();i++) {
              newArr[i]=str.charAt(i)-'0';
        }
        int n=newArr.length;

        for(int i=0;i<n;i++) {
               if(newArr[i]==6) {
                newArr[i]=9;
                break;
               }
        }
        int number=0;
        for(int digit: newArr) {
                   number=number*10+digit;  
        }
        return number;
    }

    public static void main(String[] args) {
        int n=9999;
        System.out.println(findMaximum69(n));
    }
}
