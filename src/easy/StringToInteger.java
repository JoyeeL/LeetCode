package easy;

public class StringToInteger {
public int myAtoi(String str) {
     if (str == null || str.length()<= 0) return 0;
     int i = 0;
     int flag = 0;
     long max = 2147483647;  
     long min = -2147483648; 
    //没有遇到结束符且不为空；
    
     while(str.charAt(i) != '\0' && str.charAt(i) ==' ') i++;
     if(str.charAt(i) =='\0')return 0;
     
     if(str.charAt(i) == '-') {    	 
    	 if(i < str.length()-1 && flag==0){
    		 flag =-1;
    		 i++; 
    	 }
    	 else return 0;
     }
     if(str.charAt(i) == '+') {
    	 
    	if(i < str.length()-1 && flag==0){
    		 i++; 
    		 flag =1;
    	 }
    	 else return 0;
     }
      long num =0; 
     
     if(flag ==0) flag = 1;
     
     while(i<str.length()){
    	 if(str.charAt(i)>='0'&& str.charAt(i) <= '9'){
    		 num = num*10 + flag *(str.charAt(i)-'0');
    		 if(num > max || num < min) return (int) (num > 0 ? max : min); 
    		  
    	 }
    	 else{
    		 if(num > max || num < min) return (int) (num > 0 ? max : min); 
    		 else return (int)num;
    	 }
    	 i++;
 	 
     }
      
	 return (int)num;     
    }

  public static void main(String[] args) {
	String s = "9223372036854775809";
	int n;
	StringToInteger example = new StringToInteger();
	n=example.myAtoi(s);
	System.out.println(n);
}
}
