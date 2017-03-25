package companyProgramming;

import java.util.Scanner;
import java.util.Stack;

public class three{
	public int calc(String expr){
		int ret = 0;
		int lhs = 0,rhs = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int pos = 0;
		while(pos < expr.length()){
			char c = expr.charAt(pos);
			if(c >= '0' && c <= '9'){
				stack.push(Character.digit(c, 10));
			}else if(c >= 'a' && c <= 'f'){
				stack.push(Character.digit(c, 16));
			}
			else{
				rhs = stack.pop();
				lhs = stack.pop();
				ret = calc(c,lhs,rhs);
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

	public int calc(char op, int lhs, int rhs){
		if(op=='+'){
			return lhs+rhs;
		}else if(op=='-'){
			return lhs-rhs;
		}else if(op=='*'){
			return lhs*rhs;
		}else{
			return lhs/rhs;
		}
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String line = scanner.nextLine();
			three main = new three();
			int r = main.calc(line);
			System.out.println(r);
		}
		
		scanner.close();
	}
}
