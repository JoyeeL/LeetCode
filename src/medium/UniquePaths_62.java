package medium;

/*
 * return uniquePath(m-1,n)+uniquePath(m,n-1);
 * if (m == 0 || n == 0)return 1;
 */
public class UniquePaths_62 {
	public int uniquePaths(int m, int n) {
		int[][] dp = new int[m][n];
		dp[0][0] = 1;
		for(int i = 1; i < m ; i ++)dp[i][0] = 1;
		for(int j = 1; j < n ; j ++)dp[0][j] = 1;
        for(int i = 1; i < m ; i ++){
        	for(int j = 1; j < n; j ++){
        		dp[i][j] = dp[i-1][j] + dp[i][j-1];
        	}
        }
        return dp[m-1][n];
    }
}
