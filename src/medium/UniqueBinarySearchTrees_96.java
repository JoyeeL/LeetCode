package medium;

public class UniqueBinarySearchTrees_96 {
	 public int numTrees(int n) {
	        int[] dp = new int[n+1];
	        dp[0] = 1;
	        dp[1] = 1;
	        for(int i = 2; i <= n; i ++){
	        	for(int j = 0 ; j < i; j ++ ){
	        		dp[i] =dp[i] + dp[j] * dp[i-j-1];
	        	}
	        }
	        return dp[n];
	    }
	 public static void main(String[] args) {
		int n = 4;
		UniqueBinarySearchTrees_96 ust = new UniqueBinarySearchTrees_96();
		System.out.println(ust.numTrees(n));
	}
}
