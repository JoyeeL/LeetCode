package companyProgramming.MS;

import java.io.*;
import java.util.Scanner;


public class m1 {
	public static double DFS(double  P,double  Q,int N,double  h,double p,int n){
		if (n == N)
			return h;
		double  tmp =  Math.pow(2,n+1);
		double success,fail;
		success = DFS(P,Q,N,h+1,Math.floor(P/tmp),n+1);
		if (p>= 100)
				return success;
		else
			fail = DFS(P,Q,N,h+1,P+Q,n);
			return success*p*1.0/100+fail*(100-p)*1.0/100;
	}
	

	public static void main(String[] args){
	   
        Scanner in = new Scanner(System.in);
        String line = "";
        while(in.hasNext()) {
        	
        	int P = in.nextInt();
        	int Q = in.nextInt();
        	int N = in.nextInt();
        	
        	double pro = DFS(P, Q, N,0,P,0);
        	System.out.printf("%.2f\n",pro);
    }
		
        
}
}
