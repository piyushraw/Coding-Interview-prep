public class ReverseANumber {

    public static int reverseNumber(int num) {
               
        int revNum=0;   // reverse number

        while(num!=0) {
        int digit=num%10;
        revNum= revNum*10+digit;
        num=num/10;
        } 
    return revNum;
    }

    public static void main(String[] args) {
        int num=123;
        int num1=-123;
        int num2=120;
        System.out.println(reverseNumber(num));
        System.out.println(reverseNumber(num1));
        System.out.println(reverseNumber(num2));
    }
}
