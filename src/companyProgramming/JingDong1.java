package companyProgramming;

import java.util.Scanner;

public class JingDong1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			Long n = sc.nextLong();
			Long i = (long)Math.ceil(Math.sqrt(2*n+0.25)-0.5);
			System.out.println(i);
//			Long sum = 0L;
//			Long i = 0L;
//			while(sum < n){
//				sum +=i;
//				i++;
//				
//			}
//			System.out.println(i-1);
//			if( n == 1) {
//				System.out.println(n);
//				return;
//			}
//			Long temp = 1L;
//			Long k = 1L;
//			while(temp < n){
//				temp = k*(k+1)/2;
//				k++;
//			}
//			System.out.println(k-1);
//		}
      
		}
	}
}
