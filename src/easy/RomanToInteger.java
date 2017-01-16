package easy;

public class RomanToInteger {
	public static int romanToInt(String s) {
		int sum = RomanGetValue(s.charAt(0));
		int  cur = RomanGetValue(s.charAt(0));
		int last = RomanGetValue(s.charAt(0));
		
		for(int i = 1; i < s.length() ; i ++){
			cur = RomanGetValue(s.charAt(i));
			System.out.println(cur+" "+last);
			if (last == cur) sum = sum +cur;
			else if(last > cur) {
				sum = sum + cur;
				
			}
			else sum = sum + cur - 2*last;
			last = cur;
			
		}
        return sum;
    }
	
	public static int RomanGetValue(char a){
		switch(a){
			case 'I':return 1;
			case 'V':return 5;
			case 'X':return 10;
			case 'L':return 50;
			case 'C':return 100;
			case 'D':return 500;
			default:return 0;
			
		}
	}
	
	public static void main(String[] args) {
		String s = "MMMDLXXXVI";
		int num;
		num = romanToInt(s);
		System.out.println(num);
	}
}
