package easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseBits {
	 public int reverseBits(int n) {
		
		 int res =0;
		 for(int i = 0; i < 32; i ++){
			 int dig = n&1;
			 n = n>>1;
		     
		   res = res<<1;
		   res+= dig;
		 }
		 return res;
		    }
	 
	 //similar Q
	 public int hammingWeight(int n) {
	        int num = 0;
	        for(int i = 0; i <32; i ++){
	        	int dig = n&1;
	        	num = num+dig;
	            n = n>>1;
	        }
	        return num;
	    }
	 
	 //Power of Two
	 public boolean isPowerOfTwo(int n) {
		
	        if(n == 0) return false;
	        int num = 0;
	        for(int i = 0; i <32; i ++){
	        	int dig = n&1;
	        	num = num+dig;
	        	if(num >1) return false;
	            n = n>>1;
	        }
	        	
	        if(num == 0) return false;
	        else return true;
	    }
	  public static void main(String[] args) {
		int n = 0;
		ReverseBits rb = new ReverseBits();
		boolean m = rb.isPowerOfTwo(n);
		//System.out.println((int)(Math.pow(2, 31)));
		System.out.println(m);
	}
	 
}
