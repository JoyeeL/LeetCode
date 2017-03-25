package companyProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class two {
	public static void main (String args[]) throws IOException {
	 	int[] five = new int[5];
	    String str;
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    for (int i=0;i<5;i++){
	        five[i] =  0;
	    }
	    while((str=input.readLine())!=null && str.length()!=0){
	        for(int i=0;i<5;i++){
	            five[i] += (str.charAt(i) - '0');
	        }
	    }
	    int min = 10000000;
	    for(int i=0;i<5;i++){
	        if(five[i]<min){
	            min = five[i];
	        }
	    }
	    System.out.println(min);
	}

}
