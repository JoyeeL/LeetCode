package companyProgramming;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    while (in.hasNext()) {
	    	String line = in.nextLine();
	    	int num = Integer.parseInt(in.nextLine());
	    	char[] str = line.toCharArray();
	    	int last = 0;
	    	int now = 1;
	    	int dp[][] = new int[2][num];
	    	for(int i = 0; i < num; i ++){
	    		dp[now][i] =0;
	    	}
	    	dp[now][0] =1;
	    	
	    	for(int j = 0; j < str.length; j ++){
	    		int temp = now;
	    		now = last;
	    		last = temp;
	    		for(int i = 0; i < num; i ++){
	    			dp[now][i] =0;
	    		}
	    		if(str[j] =='X'){
	    			for(int i = 0;i < num; i ++){
	    				for(int k = 0; k < 10; k ++){
	    					dp[now][(i*10+k)%num]+= dp[last][k];
	    				}
	    			}
	    		}
	    		else{
	    			for(int i = 0; i < num; i ++){
	    				dp[now][(i*10 + str[j]-'0')%num] += dp[last][i];
	    			}
	    		}
	    	}
	    	System.out.println(dp[now][0]);
	    }
	}
	
}
	

