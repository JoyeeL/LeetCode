package companyProgramming;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	public int postfixCalc(String input){
		int result = 0,num = 0;
		for(int i = 0; i < input.length(); i ++){
			if(input.charAt(i)< '0'){
				if(input.charAt(i) == '+'){
					result += num;
				}
				else if(input.charAt(i) == '-'){
					result -= num;
				}
				else result *= num;
			}
			else{
				if(input.charAt(i)>= 'A' &&input.charAt(i)<='F'){
					num = input.charAt(i) -'A'+10;
				}
				else if(input.charAt(i)>= 'a' &&input.charAt(i)<='f'){
					num = input.charAt(i) -'a'+16;
				}
				else num = input.charAt(i)-'0';
				if(i == 0)result = num;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
//		Vector obj = new Vector(4,2);
//		obj.addElement(new Integer(3));
//		obj.addElement(new Integer(2));
//		obj.addElement(new Integer(5));
//		System.out.println(obj.capacity());
//		Scanner in = new Scanner(System.in);
//		String line = "";
//		while(in.hasNext()){
//			line = in.nextLine();
////			Main main = new Main();
////			int r = main.postfixCalc(line);
//			System.out.println(line);
//		}
//		in.close();
	}
}
