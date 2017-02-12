package medium;

public class MinimumPathSum_64 {
	public int solve(int[][] grid,int didx,int ridx){
		
		return Math.min(solve(grid,didx-1,ridx)+1, solve(grid,didx,ridx-1)+1);
	}
	 public int minPathSum(int[][] grid) {
		 int m = grid.length; int n = grid[0].length;
		 if(m <= 1 || n <= 1) return grid[0][0];
	     int[][] dp = new int[m][n];
	     dp[0][0] = grid[0][0];

         for(int i = 1 ; i < m; i ++) {
        	 dp[i][0] = dp[i-1][0]+ grid[i][0];
         }
         for(int j= 1 ; j < n; j ++) {
        	 dp[0][j] = dp[0][j-1]+ grid[0][j];
         }
         
	     for(int i = 1; i < m; i ++){
	    	 for(int j = 1; j < n; j ++){
	    		 dp[i][j] = Math.min(dp[i-1][j]+grid[i][j], dp[i][j-1]+grid[i][j]);
	    	 }
	     }
	     return dp[m-1][n-1];
	   }
	 public static void main(String[] args) {
		 int [][] grid ={{1,3,1},{1,5,1},{4,2,1}};
		 MinimumPathSum_64 mps = new MinimumPathSum_64();
		 int sum = mps.minPathSum(grid);
		 System.out.println(sum);
	}
}
