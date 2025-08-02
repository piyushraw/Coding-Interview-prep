import java.util.HashMap;
public class HashMapfreq {

    public static void main(String[] args) {

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(4,4);
        map.put(5,1);
        map.put(10,1);

        int key=10;
        if(map.containsKey(key)){
            System.out.println("Yes it is there");
        } else {
            System.out.println("No it is not there");
        }
    }
}
