public class Sell_Buy_Stock {
  
 public static void main(String[] args) {
  int arr[] = {7,1,5,4,3,6,9,8};
  int maxProfit =  maxProfit(arr);
  System.out.println(maxProfit);
 }

    public static int maxProfit(int[] prices) {
      int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i< prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else if(prices[i]- min>maxprofit){
                maxprofit = prices[i] - min;
            }
        }
        return maxprofit;
    }

}
