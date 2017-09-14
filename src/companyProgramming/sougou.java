package companyProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sougou {
	public static void main(String[] args) throws NumberFormatException, IOException{		
		int N;		
		BufferedReader stadin = new BufferedReader(new InputStreamReader(System.in));		
		N = Integer.valueOf(stadin.readLine());		
		double m[] = new double[2 * N];		
		for(int i=0;i<N;i++){			
			m[i] = Double.valueOf(stadin.readLine());		
			m[i+N] = m[i]+360;		}		
		int a=0;		
		int b=1;		
		double res = 0;		
		while (b<2*N) {			
			if (m[b]-m[a]<=180) {				
				if (m[b]-m[a]>res)					
					res = m[b]-m[a];				
				 b++;			}			
			else {				
				if (360-(m[b]-m[a]) > res)					
					res = 360-(m[b]-m[a]);				
				a++;			
				}		
			}				
		System.out.println(String.format("%.8f", res));  				
		return;	}
}
