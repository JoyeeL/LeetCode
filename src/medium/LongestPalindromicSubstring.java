package medium;


public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		String oddstr;
		String evenstr = null;
		String substr;
		String maxstr = "";

		if(s.length() == 1) return s;
		for (int i = 0; i < s.length(); i++){
		  oddstr = isPalindrome(s,i,i);
		  
		  if(i + 1 < s.length()){
			  evenstr = isPalindrome(s,i,i+1);			 
		  }		
		  
		  substr = oddstr.length() > evenstr.length()? oddstr: evenstr;
		  
		  if(maxstr.length() < substr.length()) maxstr = substr;
		}
        return maxstr;
    }
	
	public static String isPalindrome(String s, int i , int j){
		
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
			i --;
			j ++;
		}
		 return s.substring(i+1,j);
		
		
	}
	
	public static void main(String[] args) {
		String s = "ab";
		String str = longestPalindrome(s);
		System.out.println(str);
	}
	
}
