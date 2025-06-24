import java.util.*;
public class firstLinkedList {

    public static void main(String[] args) {
        
         LinkedList<String> list=new LinkedList<>();
         list.add("Hi");
         list.addFirst("Good morning");
         list.addLast("How are you");

         System.out.println(list);

         list.removeFirst();
         list.removeLast();
         list.add(1,"B");
         System.out.println(list);  //[Hi,B]
         System.out.println(list.get(0)); //[Hi]
         System.out.println(list.size()); // 2
    }
    
}
