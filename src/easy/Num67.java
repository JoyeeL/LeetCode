package easy;

public class Num67 {
    public  static String addBinary(String a, String b) {
    	int num = Math.max(a.length(), b.length())+1;
    	String ab = "";
    	StringBuffer sa = new StringBuffer(a);
    	StringBuffer sb = new StringBuffer(b);
    	sa = sa.reverse();
    	sb =sb.reverse();
    	a = sa.toString();
    	b = sb.toString();
    	int count[] = new int[num+1];
    	int sum = 0;
    	int i;
    	for( i = 0; i < Math.min(a.length(), b.length()); i ++){
    		sum =( a.charAt(i)-'0')+( b.charAt(i)-'0') +count[i];
    		count[i+1] = sum/2;
    		ab+= sum%2;
    	}
    	if(i == a.length() ){
    		while(i < b.length()){
    			sum =( b.charAt(i)-'0') +count[i];
        		count[i+1] = sum/2;
        		ab+= sum%2;
        		i++;
    		}
    		
    	}
    	if( i == b.length()){
    		while(i < a.length()){
    			sum =( a.charAt(i)-'0') +count[i];
        		count[i+1] = sum/2;
        		ab+= sum%2;
        		i++;
    		}
    		
    	}
    	if(sum/2 != 0) ab+= count[i];
    	
    	StringBuffer sab=new StringBuffer(ab);
    	sab=sab.reverse();
    	
        return sab.toString();
    }
    
    public static void main(String[] args) {
    	String a = "1010";
    	String b = "1011";
    	String c = addBinary(a,b);
        System.out.println(c);
	}
}
