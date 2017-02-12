package medium;

public class CoinChange_322 {
	public static int max = 1000000;
	public int search(int[] coins, int resAmount,int idx){
		
		if(resAmount < 0) return max;
		if(idx > coins.length-1) return max;
		if(resAmount == 0) return 0;
        return   Math.min(search(coins,resAmount-coins[idx],idx)+1, search(coins,resAmount,idx+1));

	}
	 public int coinChange(int[] coins, int amount) {
		 int[] dp = new int[amount+1];
		 for(int i =1 ; i < dp.length; i ++) {
			 dp[i] = Integer.MAX_VALUE-1;
		 }
         for(int i = 1 ; i < dp.length; i ++){
        	 for(int j = 0; j < coins.length; j ++){
        		 if(i >= coins[j]) dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
        	 }
         }
         if(dp[amount] == Integer.MAX_VALUE-2) return -1;
         else return dp[amount];
	   }
	 public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE-1);
	}
}
