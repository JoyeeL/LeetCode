package easy;

public class Num38 {
	public static String countAndSay(int n) {
		if(n <= 0) return null;
		
		String str = "1";
	 
		for(int i =1; i < n ; i ++){
			str = convert(str);
		}
        return str;
    }
	
	private static  String convert(String s){
		String str = "";
		char ch = s.charAt(0);
		int count = 0;
		for(int i = 0 ; i < s.length(); i ++){
			if (s.charAt(i) == ch){
				count ++;
			}
			else{
				str+=String.valueOf(count);
				str+= ch;
				ch = s.charAt(i);
				count = 1;
			}
		}
		str+=String.valueOf(count);
		str+= ch;
		
		return str;
	}
	
	public static void main(String[] args) {
		int n = 3;
		String str = countAndSay(n);
		System.out.println(str);
	}
}
