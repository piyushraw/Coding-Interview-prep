import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingDeque;

public class firstLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"hello");
        map.put(0,"Hi");

        System.out.println(map);
    }
}
