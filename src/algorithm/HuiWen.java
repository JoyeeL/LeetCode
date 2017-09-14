package algorithm;
import java.util.Scanner;
import java.util.*;

public class HuiWen {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String line = "";
		int deleNum = 0;
		while(scanner.hasNext()){
			line = scanner.nextLine();
			deleNum = getLCS(line);
			System.out.println(deleNum);
		}
	}
	
	public static int getLCS(String str){
		int deleNum = 0;
		StringBuilder str1 = new StringBuilder(str);
		StringBuilder str2 = new StringBuilder(str).reverse();
		
		int dp[][] = new int[str1.length()+1][str2.length()+1];
		for(int i = 1; i <= str1.length(); i ++){
			for(int j = 1 ; j <= str2.length(); j ++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1]+1;}
					else{
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
		
		deleNum = str1.length()- dp[str1.length()][str2.length()];
		return deleNum;
		}
		
	

}
