package adv1_Arrays;

public class BestTimeToBuySTock {
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4}; //1,2,3,4,5
		System.out.println(maxProfit(arr));
		System.out.println(approach2(arr));
	}
	private static int maxProfit(int[] prices) {
		int profit = 0;
		int n = prices.length;
        int max = prices[n-1];
        
       
        for(int i= n-2;i>=0;i--){
        	int curr = 0;
            max = Math.max(max, prices[i]);
            if(max > prices[i]) {
            	curr = max - prices[i];
            	max = prices[i];
            	profit += curr;
            }
            
        }
        return profit;
	}
	
	private static int approach2(int [] prices) {
		int ans = 0;
		for(int i=0;i<prices.length-1;i++) {
			if(prices[i+1] > prices[i] )
			     ans += (prices[i+1]-prices[i]);
		}
		return ans;
	}
}
