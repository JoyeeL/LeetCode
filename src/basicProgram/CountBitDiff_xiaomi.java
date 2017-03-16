package basicProgram;

public class CountBitDiff_xiaomi {
	 public int countBitDiff(int m, int n) {
			int count = m ^ n;
	        String binary = Integer.toBinaryString(count);
	        int countBit = 0;
	        for(int i = 0; i < binary.length(); i ++){
	            if ( binary.charAt(i)=='1'){
	                countBit ++;
	            }
	                
			}
	       return countBit; 
	    }
	    
	    public String converse(int m){
	        String binary = "";
	        while(m != 1){
	            binary += m %2;
	            m = m/2;
	        }
	        binary = binary + "1";
	        return binary;
	        
	    }
	    public static void main(String[] args) {
			int m = 1999, n =  2299;
			CountBitDiff_xiaomi test = new CountBitDiff_xiaomi();
			int count = test.countBitDiff(m, n);
			System.out.println(count);
			
		}
}
