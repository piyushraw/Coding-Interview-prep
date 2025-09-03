public class ClimbingStairs {

    public static int findClimbingStairs(int n) {

        // climbing stairs

           if(n==1||n==2) {
            return n;
           }
               int first=1;
               int second=2;

               for(int i=3;i<=n;i++) {
                        int next=first+second;
                            first=second;
                            second=next;
               }
               return second;
    }

    public static void main(String[] args) {
           int n=4;
           System.out.println(findClimbingStairs(n));
    }
}
