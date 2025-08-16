import java.util.ArrayList;
import java.util.List;
public class CommonElement {

    public static List<Integer> findCommonElement(int[] list1, int[] list2 ) {

                int left=0;
                int right=0;

                List<Integer>list=new ArrayList<>();
                while(left<list1.length && right<list2.length) {

                    if(list1[left]== list2[right]) {
                        if(list.isEmpty() || list.get(list.size()-1) != list1[left]) {
                          list.add(list1[left]);
                    }
                            left++;
                            right++;
                } else if(list1[left]<list2[right]) {
                         left++;
                } else {
                    right++;
                }
                   }
                       return list;
                 }

    public static int[] SearchCommonElement(int[] list1, int[] list2 ) {

                         
                         List<Integer>list=new ArrayList<>();

                          for(int i=0;i<list1.length;i++) {
                            for(int j=0;j<list2.length;j++) {
                                if(list1[i]== list2[j]) {
                                    list.add(list1[i]);
                                }
                            }
                        }
                        int[] newArr =new int[list.size()];
                        for(int i=0;i<list.size();i++) {
                                newArr[i]= list.get(i);
                          }
                        return newArr;    
                    }

    public static void main(String[] args) {
           
              int[] list1={1,2,3,4,5};
              int[] list2={2,4,5,6};

              List<Integer> common= findCommonElement(list1, list2);
              System.out.println(common);

              int[] result=SearchCommonElement(list1, list2);
                 for(int num: result) {
                    System.out.println(num+" ");
                 }
             }
        }
