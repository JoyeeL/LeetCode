package companyProgramming.MS;

import java.util.Scanner;

public class Main{
	public double solution(int P,int Q,int N){
		return DFS(P,Q,N,0,P,0);
	}
	public  double DFS(int P,int Q,int N,int h,int p,int n){
		if (n == N)
			return h;
		int tmp = (int) Math.pow(2,n+1);
		double success,fail;
		success = DFS(P,Q,N,h+1,P/tmp,n+1);
		if (p>= 100)
				return success;
		else
			fail = DFS(P,Q,N,h+1,P+Q,n);
			return success*p*1.0/100+fail*(100-p)*1.0/100;
	}

	public static void main(String[] args){
		    System.out.println(Integer.MAX_VALUE);
	        Scanner in = new Scanner(System.in);
	        String line = "";
	        while(in.hasNext()) {
	        	
	        	int N = in.nextInt();
	        	int P = in.nextInt();
	        	int Q = in.nextInt();
	        	Main main = new Main();
	        	double pro = main.solution(P, Q, N);
	        	System.out.println(pro);
	    }
	}
}
