package easy;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
	    
	        StringBuilder result = new StringBuilder();

	        while(n>0){
	            n--;
	            result.insert(0, (char)('A' + n % 26));
	            n /= 26;
	        }

	        return result.toString();
	    
        
    }
	
	public int titleToNumber(String s) {
	     if(s.length() == 0) return 0;
	     int num = 0;
	     int j = 0;
	     char[] arr = s.toCharArray();
	     System.out.println(arr);
	     for(int i = arr.length-1 ; i >= 0; i --){
	    	 System.out.println(arr[i]);
	    	 num += (arr[i]-64)*Math.pow(26, j);
	    	 j++;
	     }
	     return num;
	    }
	public static void main(String[] args) {
		int i = 52;
		char s = (char)(i+64);
		String ss = "A";
	//	System.out.println(s);
		
		ExcelSheetColumnTitle esc = new ExcelSheetColumnTitle();
//		System.out.println(esc.convertToTitle(i));
		System.out.println(esc.titleToNumber(ss));
	}
}
