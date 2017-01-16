package easy;
/*
 * 斐波纳契数列。
 */

//f(n) = f(n - 1) + f(n - 2).
//f(1) = 1.
//f(2) = 2.
public class Num70 {
	public static int climbStairs(int n) {
       if(n == 0) return 0;
       if(n == 1) return 1;
     
       int a = 1, b = 1,c = 0;
       
       for(int i = 2; i < n+1; i ++){
    	   c = a+b;
    	   b = a;
    	   a = c;
    	   
    	   
       }
       return c;
       
    }
	
	public static void main(String[] args) {
		int n = 44;
		System.out.println(climbStairs(n));
	}
}
