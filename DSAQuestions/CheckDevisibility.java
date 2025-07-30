public class CheckDevisibility {

    public static boolean FindDevisibiltyNumber(int n) {
                    int x=n;
                    int sum=0;
                    int product=1;

                    while(x>0) {
                        int digit=x%10;
                        sum=sum+digit;
                        product=product*digit;
                        x=x/10;
                    }
                    int total=sum+product;

                    return n%total==0; 
    }

    public static void main(String[] args) {
        int n=99;
      System.out.println(FindDevisibiltyNumber(n));
    }
}
