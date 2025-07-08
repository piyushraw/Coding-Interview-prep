public class StringReverse2 {

     public static String isReverse2(String str ) {
           String reversed= new StringBuilder(str).reverse().toString();
           return reversed;
        }
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(isReverse2(str));
    } 
}
