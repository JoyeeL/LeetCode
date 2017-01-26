package easy;

import java.util.HashSet;

public class HappyNumber_202 {
public boolean isHappy(int n) {
	   if(n == 1 ) return true;
       
       HashSet<Integer> sum = new HashSet<Integer>();
       while(n != 1){
    	   if(sum.contains(n)) return false;
    	   else{
    		   sum.add(n);
    		   n = happyNum(n);
    	   }
       }
       return true;
    }
	private int happyNum(int n){
		char[] num  = String.valueOf(n).toCharArray();
		int sum = 0;
		for(char c : num){
			sum +=Integer.parseInt(String.valueOf(c))*Integer.parseInt(String.valueOf(c));
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 11;
		HappyNumber_202 hn = new HappyNumber_202();
		boolean isHappy = hn.isHappy(n);
		System.out.println(isHappy);
	}
}
