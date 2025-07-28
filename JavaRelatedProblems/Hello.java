// Can you print Hello without main method

public class Hello {
    static {
        System.out.println("Hello");
        System.exit(0);  // Shutdown the JVM-> JVM will not go to find main method. 
    }    
}
