package companyProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class JingDong2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			if(n == 1) {
				System.out.println(1);
				break;
			}
			if(n == 2){
				System.out.println(6);
			}
			Long sum = 6L;
			for(int i = 3; i <= n ; i ++){
				
				sum+=f(i);
			}
			System.out.println(sum%100000007);
		}
		
	}
	
	public static Long f(int n){
		Long count = 0L;
		ArrayList<Integer> sq = new ArrayList<Integer>();
		sq.add(n);
		int r = (int)Math.sqrt(1.0*n);
		if(r *r == n){
			sq.add(r);
			r--;
		}
		
		for(int i = 1; i < r; i ++){
			if(n %i ==0){
				int b = n/i;
				sq.add(i);
				sq.add(b);
			}
		}
		
		for(int i = 0; i < sq.size(); i ++){
			for(int j = i+1; j < sq.size(); j ++){
				for(int k = 0 ; k <= n; k ++){
					for( int q = 0; q <= n; k ++){
						if(Math.pow(sq.get(i), k) == Math.pow(sq.get(j), q)){
							count++;
							count = count%100000007;
						}
					}
				}
			}
		}
		
		return count;
	}
	
}
