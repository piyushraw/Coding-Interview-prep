import java.util.HashSet;
public class HappyNumber {

    public static boolean findHappyNumber(int n) {

        // Happy Number
         
        HashSet<Integer>seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)) {
                  seen.add(n);
                  n=NextGen(n);
        }
        return n==1;
    } 
        public static int NextGen(int num) {

            int totalSum=0;

               while(num>0) {
                int digit=num%10;
                totalSum+=digit*digit;
                num=num/10;
               }
               return totalSum;
        }

    public static void main(String[] args) {
        System.out.println(findHappyNumber(2)); 
    }
}
