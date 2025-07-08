
import java.util.*;
public class firstLinkedList {

    public static void main(String[] args) {
        
         LinkedList<String> list=new LinkedList<>();
         list.add("Hi");                     //  O(1)
         list.addFirst("Good morning");      //  O(1)
         list.addLast("How are you");        //  O(1)
         list.add(1,"B");        //  O(n)
         System.out.println(list);               
         list.remove(2);                  // O(n)

         System.out.println(list);              
         System.out.println(list.get(1));   //O(n)  
         System.out.println(list.set(1,"Damn"));     //O(n)
         System.out.println(list.size());         // O(1)  
         System.out.println(list); 

         Collections.sort(list);
         System.out.println(list); 
    }
}
