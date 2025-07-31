import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapCount {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();

        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(8);
        list.add(10);

        int n=list.size();
        for(int i=0;i<n;i++) {
            int num=list.get(i);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int element:map.keySet()) {
            System.out.println(element);
        }
    }
}
