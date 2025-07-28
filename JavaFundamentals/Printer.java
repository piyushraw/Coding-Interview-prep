// Singleton class 
class Printer {
    private static Printer instance;
    private String status;

    private Printer() {
          System.out.println("Hello Printer");
          status="Idle";
    }

    public static Printer getInstance() {
        if(instance ==null) {
              instance =new Printer();
        }
        return instance;
    }

      public void setStatus(String newStatus) {
               this.status=newStatus;
      }

      public String getStatus() {
          return this.status;
      }

public class Main {

      public static void main(String[] args) {

        Printer p1=Printer.getInstance();
        p1.setStatus("Printing document");
        Printer p2=Printer.getInstance();

        System.out.println("p1 status="+ p1.getStatus());
        System.out.println("p2 status="+ p2.getStatus());
        System.out.println(p1==p2);
      }
}

}