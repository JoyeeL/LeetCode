package companyProgramming.MS;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class four {
	
	 public static List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String>();
	        backtrack(list, "", 0, 0, n);
	        return list;
	    }
	    
	    public static void backtrack(List<String> list, String str, int open, int close, int max){
	        
	        if(str.length() == max*2){
	            list.add(str);
	            return;
	        }
	        
	        if(open < max)
	            backtrack(list, str+"(", open+1, close, max);
	        if(close < open)
	            backtrack(list, str+")", open, close+1, max);
	    }
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        String line = "";
        while(in.hasNext()) {
        	line = in.nextLine().trim();
        	String s = line;
        	int len = s.length();
        	int[][] dp = new int[len][len];
        	for(int i = 0; i < len; i ++){
        		dp[i][i] = 1;
        	}
        	
        	for( int i = len -2; i >= 0; i--){
        		for(int  j = i+1; j < len; j ++){
        			dp[i][j]  = dp[i+1][j] +1;
        			for(int k = i +1; k <= j ; k ++){
        				if(s.charAt(i) == '(' && s.charAt(k) == ')') {
                            dp[i][j] = Math.min(dp[i][j],dp[i+1][k-1]+dp[k][j]-1);
                        }

        			}
        		}
        	}
        	
        	
        	int length = (len+dp[0][len-1])/2;
        	int result = generateParenthesis(length).size();
            
            
            
            System.out.printf("%d ",dp[0][len-1]);
            System.out.printf("%d\n", result%1000000007);

    }
	}
}

