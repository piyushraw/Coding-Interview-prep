
import java.util.*;
public class firstHashMap {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map=new HashMap<>();
          List<Integer> list=Arrays.asList(5,5,5,6,8,8,8,10);

          for(int count: list) {
                map.put(count,map.getOrDefault(count,0)+1);
          }
          System.out.println(list.size());
          System.out.println(map);
    } 
}
