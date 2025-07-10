public class FactoryPattern {

    interface Drink{
        void serve();
    }

    static class Tea implements Drink{
          public void serve() {
            System.out.println("Serving Tea");
          }
    }

    static class Coffee implements Drink{
        public void serve() {
            System.out.println("Serving Coffee");
        }
    }

    static class Juice implements Drink {
          public void serve() {
            System.out.println("Serving Juice");
          }
    }

    static class DrinkFactory{
        
            public Drink getDrink(String type) {
                 if(type.equalsIgnoreCase("tea")) {
                      return new Tea();
                 } else if (type.equalsIgnoreCase("coffee")) {
                         return new Coffee();
                 } else if (type.equalsIgnoreCase("juice")) {
                        return new Juice();
                 }  else {
                    return null;
                 }
            }
    }

    public static void main(String[] args) {

              DrinkFactory factory=new DrinkFactory();
               Drink myDrink1=factory.getDrink("tea");
               myDrink1.serve();
               Drink myDrink2=factory.getDrink("coffee");
               myDrink2.serve();
               Drink myDrink3=factory.getDrink("juice");
               myDrink3.serve();
    }
}
