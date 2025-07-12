public class ContainerWithMostWater {

    public static int findMaxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int maxArea=0;

        while(left<right) {
            
                int h =Math.min(heights[left],heights[right]);
                int w=right-left;
                maxArea=Math.max(maxArea,h*w);

                if(heights[left] < heights[right] ) {
                         left++;
                } else {
                         right--;
                }
        }
        return maxArea; 
    }

    public static void main(String[] args) {

        int[] heights={1,7,2,5,4,7,3,6};
        System.out.println(findMaxArea(heights));  
    }
}
