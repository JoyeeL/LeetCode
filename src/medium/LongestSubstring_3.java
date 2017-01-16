package medium;

import java.util.Arrays;


public class LongestSubstring_3 {
	public static int lengthOfLongestSubstring(String s){
		int[] index = new int[128];
		int len = 0;
		int start = 0;
		char[] ch = s.toCharArray();
		Arrays.fill(index, -1);
		for(int i = 0; i < s.length(); i++){
			if(index[ch[i]-' '] >= start){//®”Ç°×Ö·û³ö¬Fß^
				if(len < i-start) len = i-start;
				start = index[ch[i]-' ']+1;				
			}
			index[ch[i]-' ']=i;			
		}
		if(len > s.length()- start)
			return len;
		else 
			return s.length()- start;

		
	}
  
     
		
	
	
	public static void main(String[] args) {
		String s =  "abcbad";
		int m = lengthOfLongestSubstring(s);
		System.out.println(m);
	}
}
