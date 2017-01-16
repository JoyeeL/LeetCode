package easy;

public class isPalindrome {
	public boolean Palindrome(int x) {
		String str = String.valueOf(x);
		char[] w = str.toCharArray();
		if(str.charAt(x)=='-') return false;
		for(int i = 0 ;i < str.length()/2;i ++){
			if(w[i] != w[str.length()-i-1]) return false;
		}
        return true;
    }
}
