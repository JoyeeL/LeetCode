package companyProgramming;

import java.util.Scanner;
import java.util.Stack;

public class three {
	public int postfixClc(String expr){
		int ret  = 0;
		long lhs = 0,rhs = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int pos = 0;
		while(pos < expr.length()){
			Character c = expr.charAt(pos);
			c = Character.toLowerCase(c);
			if( c >= '0' && c <= '9'){
				stack.push(Character.digit(c, 10));
			}else if(c >= 'a' && c <= 'f'){
				stack.push(Character.digit(c, 16));
			}else{
				rhs = stack.pop();
				lhs = stack.pop();
				ret = (int) calc(c,lhs,rhs);
				stack.push(ret);
			}
			pos++;
		}
		return ret;
	}
	
	public long calc(char op, long lhs,long rhs){
		if(op == '+'){
			return lhs+rhs;
		}else if(op == '-'){
			return lhs -rhs;
		}else 
			return lhs*rhs;
		
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String line = "";
	while(in.hasNext()){
		line = in.nextLine().trim();
		three main = new three();
		int r = main.postfixClc(line);
		System.out.println(r);
	}
	in.close();
}
}
