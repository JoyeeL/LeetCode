package test;

import java.util.Scanner;

public class StringCode{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String str = in.nextLine();
			if(str.length()== 0) {
				System.out.println("");
				continue;
			}
			if(str.length() ==1) {
				System.out.println("1"+str.charAt(0));
				continue;
			}
			
			String result= "";
			int length = 1;
			for(int i =0; i < str.length()-1; i ++){
				if(str.charAt(i) == str.charAt(i+1)){
					length ++;
				}
				else{
					result += Integer.toString(length)+str.charAt(i);
					length= 1;
				}
					
			}
			if(str.charAt(str.length()-1)!= str.charAt(str.length()-2)) result += "1"+str.charAt(str.length()-1);
			else{
				result += Integer.toString(length)+str.charAt(str.length()-1);
			}
			System.out.println(result);
		}
	
		
	}
	
}
