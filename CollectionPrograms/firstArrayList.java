
import java.util.*;
public class firstArrayList {

    public static void main(String[] args) {

   List<String> firstList=new ArrayList();

   firstList.add("Apple");
   firstList.add("Banana");
   firstList.add("Kiwi");        // O(1)
   firstList.add("Mango");
   firstList.add("Litchi");

     firstList.add(1,"Pineapple");    // O(n)
     System.out.println(firstList.size()); 
     System.out.println(firstList.isEmpty());          // O(1)
     System.out.println(firstList.get(3));     // O(1);
     System.out.println(firstList.set(3,"Cucumber"));    // O(1)
     System.out.println(firstList.remove(4));      //O(n)
     System.out.println(firstList);

     Collections.sort(firstList);
     System.out.println(firstList);
}
}
