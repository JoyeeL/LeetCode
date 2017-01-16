package easy;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		
		for(int i = 0 ; i < strs.length ; i++){
			if(strs[i].length() == 0) return "";
		}
		
		int min = strs[0].length();
		
		for(int i = 1 ; i < strs.length ; i++){
			if( min > strs[i].length()) min = strs[i].length();
		}
		
		int index = 0;
		boolean flag = true;
		while(index < min && flag == true){
			for(int i = 1; i < strs.length; i++){
				if(strs[i].charAt(index) != strs[i-1].charAt(index)) {
					flag = false;
					index --;
					break;
					
				}	
			}
			index ++;
		}
        return strs[0].substring(0, index);
    }
	
	public static void main(String[] args) {
		String[] strs1 = {"a","a"};
		System.out.println(strs1.length);
		LongestCommonPrefix x = new LongestCommonPrefix();
		String out = x.longestCommonPrefix(strs1);
		System.out.println(out);
		
	}
}
