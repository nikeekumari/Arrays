public class buyORsell {
    public static int maxProfit(int[] prices){
        //at the beginning the minimum price is the first price
        int buy_price=prices[0];
        //since only first price ia available so after selling no extra profit 
        int profit=0;
        for(int i=1;i<prices.length;i++){
            //if current price is less than buy price then onlu update the buy price
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }else{
                //check for better profit
                //try to sell if new price >buy price
                //current profit=today's price-buy_price
                //update maximum profit when needed
                int curr_profit=prices[i]-buy_price;
                profit=Math.max(curr_profit,profit);
            }
        }
        return profit;
    }
public static void main(String[] args){
    int prices[]={7,1,5,3,6,4};
    System.out.println(maxProfit(prices));
}
}


            
