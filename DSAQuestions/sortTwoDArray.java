
import java.util.Arrays;
import java.util.Comparator;

public class sortTwoDArray {

      public static void main(String[] args) {

        int[][] arr={{3,2}, {1,4}, {2,5}};
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));

        for(int[] row: arr){
        System.out.println(Arrays.toString(row));
            }
           }
            }
