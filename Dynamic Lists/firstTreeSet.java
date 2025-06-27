import java.util.*;
public class firstTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> TSet=new TreeSet<>();

        TSet.add(10);
        TSet.add(40);
        TSet.add(30);
        TSet.add(10);
        TSet.add(60);
        TSet.add(50);
        TSet.add(20);
        TSet.add(0); 
        
        TSet.remove(40);
       System.out.println(TSet.contains(40));
       System.out.println(TSet.first());
       System.out.println(TSet.last());

       System.out.println(TSet.higher(10));
       System.out.println(TSet.lower(50));

        System.out.println(TSet);
    }
}
