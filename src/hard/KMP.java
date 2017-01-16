package hard;

public class KMP {
	/*
	 * @param haystack
	 *        主串
	 *  @param needle
	 *       模式串
	 * @return 若匹配成功，则返回下标，否则返回0；      
	 */
	 public static int strStr(String haystack, String needle) {
	        if(haystack==null || needle == null || needle.length()==0)  
	            return 0;  
	        if(needle.length()>haystack.length())  
	            return -1;
	        int[] next = getNext2(needle);
			int i = 0;
			int j = 0;
			
			while( i < haystack.length() &&  j < needle.length()){
				if(j == -1 || haystack.charAt(i) == needle.charAt(j) ){
					i ++;
					j ++;
				}
				else{
					j = next[j];
				}
			}
			if(j < needle.length()){
				return -1;
			}
			else
				return i-needle.length();
	    }
	    
	      public static int[] getNext2(String pstr){
	    	int next[] = new int[pstr.length()];
	    	int k = -1;
	    	next[0] = -1;
	    	int j = 0;
	    	while(j < pstr.length()-1){
	    		if(k == -1 || pstr.charAt(j) == pstr.charAt(k)){
	    			k++;
	    			j++;
	    			if(pstr.charAt(j) == pstr.charAt(k)){
	    				next[j] = next[k];
	    			}
	    			else{
	    				next[j] = k;
	    			}
	    			
	    		}
	    		else{
	    			k = next[k];
	    		}
	    		 
	    	}
	    	return next;
	    }
	      
	      public static void main(String[] args) {  
	          String s = ""; // 主串  
	          String t = ""; // 模式串  
	           
	          System.out.println(strStr(s, t)); // KMP匹配字符串  
	      }
    
 
}
