
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTwoDArrayList {

    public static void main(String[] args) {
          
       List<List<Integer>> list=new ArrayList<>();
       list.add(Arrays.asList(3,2));
       list.add(Arrays.asList(1,4));
       list.add(Arrays.asList(2,5));

       list.sort(Comparator.comparingInt(a->a.get(0)));

       for(List<Integer> row : list){
           System.out.println(row);
       }
    }
}
