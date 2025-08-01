import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapCount {

    public static void main(String[] args) {

        HashMap<Integer,Integer> freq=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(10);

        for(int num:list) {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int res:freq.keySet()){
        System.out.println(res+ "->" +freq.get(res));
    }
    }
}
