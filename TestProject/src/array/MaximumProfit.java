    package array;

public class MaximumProfit {

    public static void main(String[] args) {
        
        int[] price = {100,180,260,310,40,535,695};
        int profit=0;
        for(int i=0;i<price.length-1;i++) {
            if(price[i]<price[i+1]) {
                profit = findMaxProfitOneBuy(price);
            }
        }
        System.out.println("Maximum possible profit in one buy ="+profit);
    }
    
    public static int findMaxProfitOneBuy(int[] price) {
        int profit=0;
        int len = price.length;
        for(int i=0;i<len;i++) {
            for(int j=i+1;j<len;j++) {
                if((price[j]-price[i])>profit)
                    profit = price[j]-price[i];
            }
        }
        return profit;
    }
    
    public static int findMaxProfitMultipleBuys(int[] price) {
        int profit=0;
        int len=price.length;
        
        return profit;
    }

}
