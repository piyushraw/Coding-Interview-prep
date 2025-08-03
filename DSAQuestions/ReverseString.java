public class ReverseString {

    public void reverseString(char[] s) {

        int n=s.length;
        char[] ch=new char[n];
        int idx=0;
        for(int i=n-1;i>=0;i--) {
            ch[idx++]= s[i];
        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
       ReverseString rs=new ReverseString();
        char[] s={'h','e','l','l','o'};
        rs.reverseString(s);
    }
}
