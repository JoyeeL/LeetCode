package companyProgramming;

import java.util.Scanner;

public class two {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int[] c= new int[5];
	while(in.hasNext()){
		String line = in.nextLine();		
		for(int i = 0; i < 5; i ++){
			c[i] += (line.charAt(i)-'0');
		}			
	}
	int min = Integer.MAX_VALUE;
	for(int i = 0; i < 5; i++){
		if(min > c[i]) min = c[i];
	}
	System.out.println(min);
	in.close();
}
}
