package easy;

public class Num66 {
	public static int[] plusOne(int[] digits) {
		if(digits.length == 1 && digits[0] != 9) {
			digits[0] = digits[0]+1;
			return digits;
		}
		int newdigits[] = new int[digits.length+1];
		
		int plus[]= new int[digits.length+1];
		plus[digits.length-1] =1;
		
		for(int i = digits.length-1 ; i >= 0 ; i --){
			if(digits[i] == 9 && plus[i] == 1){
				digits[i] = 0;
				if(i !=0){
					plus[i-1] = 1;
				}
				
 			}
			else{
				digits[i] = digits[i]+plus[i];
				plus[i] =0;
			}
		}
		
		if(plus[0] == 1){
			
			newdigits[0] = 1;
			for(int i = 1 ; i < digits.length+1 ; i ++){
				newdigits[i] = digits[i-1];
			}
			return newdigits;
		}
        return digits;
    }
	public int[] plusOne2(int[] digits) {  
	    if(digits == null || digits.length==0)  
	        return digits;  
	    int carry = 1;  
	    for(int i=digits.length-1;i>=0;i--)  
	    {  
	        int digit = (digits[i]+carry)%10;   
	        carry = (digits[i]+carry)/10;  
	        digits[i] = digit;  
	        if(carry==0)  
	            return digits;      
	    }  
	    int [] res = new int[digits.length+1];      
	    res[0] = 1;  
	    return res;  
	} 
	public static void main(String[] args) {
		int digits[] = {9,8,7,6,5,4,3,2,1,0};
		int newdigits[] = new int[4];
		newdigits = plusOne(digits);
		System.out.println(newdigits);
		System.out.println("done");
		System.out.println("done");
	}
}
