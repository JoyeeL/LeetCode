package hard;
/*
 * 用2维布尔数组，dp[i][j]的含义是s[0-i] 与 s[0-j]是否匹配。
If p.charAt(j) != '*';
 	p.charAt(j) == s.charAt(i) : dp[i][j] = dp[i-1][j-1]
	If p.charAt(j) == '.' : dp[i][j] = dp[i-1][j-1];
If p.charAt(j) == '*':
	here are two sub conditions:
	- if p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2]  //in this case, a* only counts as empty,忽略a*;
	- if p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == '.':
                       		dp[i][j] = dp[i-1][j]    //in this case, a* counts as multiple a 
                     		dp[i][j] = dp[i][j-1]   // in this case, a* counts as single a
                    		dp[i][j] = dp[i][j-2]   // in this case, a* counts as empty
 */
public class RegularExpressionMatching_10 {
	public boolean isMatch(String s, String p) {
		if(s == null || p == null) {
		     return false;
		 }
		 int m = s.length()+1, n = p.length()+1;
		 boolean[][] state = new boolean[m][n];
		 
		 //初始化状态数组
		 state[0][0] = true;
		 for(int i = 1; i < m ; i ++){
			 state[i][0] = false;
		 }
		 
		 for(int j = 1; j < n; j ++){
			 if(p.charAt(j-1) == '*'){
				 if(j > 1 && state[0][j-2]) {
					 state[0][j] = true;
				 }
			 }
		 }
		 //初始化完毕，开始进行操作
		//计算dp[i][j]时,此时的字符串实际上是s[i-1],p[i-1];
		 for(int i = 1; i < m ; i ++){
			 for(int j = 1; j < n; j ++){
				 if(p.charAt(j -1) == '*'){
					 if(s.charAt(i-1) != p.charAt(j-2)&& p.charAt(j-2) !='.'){
						 state[i][j] = state[i][j-2];
					 }else{
						 state[i][j] =state[i][j-1] ||state[i][j-2]||state[i-1][j];
					 }
					 
				 }
				 
				if(s.charAt(i- 1) == p.charAt(j-1) || p.charAt(j-1) == '.') {
					state[i][j] = state[i-1][j-1];
				}
				 
				 
			 }
		 }
		 return state[s.length()][p.length()];
		}
	 
	 public static void main(String[] args) {
		String s= "aaaa", p = "a*b*";
		RegularExpressionMatching_10 rem = new RegularExpressionMatching_10();
		boolean isMatch = rem.isMatch(s, p);
		System.out.println(isMatch);
	}
}
