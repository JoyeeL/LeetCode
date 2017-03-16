package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MatchPlayer {
	public boolean isMatch(int playerNum,int[] players){
		if(playerNum%2 != 0) return false;
		Arrays.sort(players);
		int sum = sum(players);
		if(sum%2 !=0) return false;

		return helper(players,0,sum/2,0);
		
		
	}
	
	public boolean helper(int[] players,int num,int sum,int count){
		if(sum == 0 && count == players.length/2) return true;	
		if(num == players.length || count > players.length/2) return false;
	
		else 
			return(helper(players,num+1,sum-players[num],count+1)||helper(players,num+1,sum,count));
		
	}
	public static int sum(int[] a){
		if(a.length == 0) return 0;
		int sum = 0;
		for(int i = 0;i < a.length; i ++){
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		 Scanner in = new Scanner(System.in);
		 
		 int N = in.nextInt();
		 MatchPlayer mp = new MatchPlayer();
		 for(int i = 0; i < N; i++){
			 int M = in.nextInt();
			 
			 int[] players = new int[M];
			 for(int j = 0;j < M; j ++) {
				 players[j] = in.nextInt();
			 }
			System.out.println(mp.isMatch(M, players)); 
			 
		 }
	}
}
