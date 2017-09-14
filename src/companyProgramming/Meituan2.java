package companyProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Meituan2 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     while (in.hasNext()) {
	    	 int num = in.nextInt();
	    	 int[] a = new int[num];
	    	 
	    	
	    	 
	    	 for(int i = 0; i < num; i ++){
	    		 a[i] = in.nextInt();
	    	 }
	    	
	    	 int max =0,total = 0;
	    	 for(int i = 0 ; i < num ; i ++){
	    		 if(max < a[i]){
	    			 max = a[i];
	    		 }
	    		 total += a[i];
	    	 }
	        total -= max;
	    	if( max > total){
	    		System.out.println("No");
	    	}
	    	else{
	    		System.out.println("Yes");
	    	}
	     }
	     in.close();
	}
}

