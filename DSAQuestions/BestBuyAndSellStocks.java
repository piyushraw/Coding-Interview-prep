public class BestBuyAndSellStocks {

    public static int findMaximunProfit(int[] prices) {
        // Logic comes here

        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price: prices) {
               if(price< minPrice) {
                    minPrice=price;
               } else { 
                    maxProfit=Math.max(maxProfit,price-minPrice);
               }
        }
        return maxProfit; 
    }

    public static void main(String[] args) {
        int[] Prices={10,1,5,6,7,1};
        int[] Prices1={10,8,7,5,2};
        System.out.println(findMaximunProfit(Prices));
        System.out.println(findMaximunProfit(Prices1));
    }
}
