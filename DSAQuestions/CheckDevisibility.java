public class CheckDevisibility {

    //Check Divisiblity

    public static boolean FindDevisibiltyNumber(int n) {
                    int x=n;
                    int sum=0;
                    int product=1;
        

                    while(x>0) {
                        int digit=x%10;  // Get the last digit
                        sum=sum+digit;  // add to sum
                        product=product*digit;  // Multiply with product
                        x=x/10; // Remove last digit
                    }
                    int total=sum+product;

                    return n%total==0; 
    }

    public static void main(String[] args) {
        int n=99;
      System.out.println(FindDevisibiltyNumber(n));
    }
}
