package easy;
import java.util.Arrays;


public class ZigZagConversion {
	public String convert(String s, int numRows){
		String newStr = "";
		if (numRows == 1) return s;
		String[] anrow = new String[numRows];
		Arrays.fill(anrow, ""); 
		
		int row =0;
		int alter =1;
		for(int i = 0; i < s.length(); i++){
			if(i==0) anrow[row]+= s.charAt(0);
			else{
				if(alter ==1 && row < numRows-1){
					row ++;
					anrow[row] += s.charAt(i);
					if(row == numRows-1)
						alter =-1;
				}
				else{
					if(alter ==-1 && row >0){
						row --;
						anrow[row] += s.charAt(i);
						if(row == 0)
							alter = 1;
				}
					
				}
			}
			}
		for(int j = 0 ;j < numRows;j ++){
			newStr +=anrow[j];
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		String s = "AB" ;
		int num =2;
		ZigZagConversion zig = new ZigZagConversion();
		s=zig.convert(s, num);
		System.out.println(s);
		
	}
}
