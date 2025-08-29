public class Print {

    public static void print(int n) {

        // Printing Hello World 5 times

        for(int i=1;i<=n;i++) {
            System.out.println("Hello World");
        }
    }
    public static void main(String[] args) {
        Print print=new Print();
        int n=5; 
        print(n);
    }  
}
