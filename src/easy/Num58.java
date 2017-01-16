package easy;

public class Num58 {
    public static int lengthOfLastWord(String s) {
    
      int num = 0;
      boolean flag = true;
      for(int i = 0 ;i < s.length(); i ++){
    	 if(s.charAt(i) != ' ' && flag == true){
    		 num =1;
    		 flag = false;
    	 }
    	 else if(s.charAt(i) != ' ' &&flag == false){
    		 num++; 
    	 }   	
    	 else if( s.charAt(i) == ' '){
    		 flag = true;
    		 
    	  }  
      }
      return num;
    }
    
  public static void main(String[] args) {
	String s ="a  b   ";
	int num = lengthOfLastWord(s);
	System.out.println(num);
}
}
