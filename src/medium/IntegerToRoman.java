package medium;

public class IntegerToRoman {
	public String intToRoman(int num) {
		String str = "";
		String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] integer = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i = 0; i < roman.length ; i ++){
			while(num >= integer[i]){
				str = str + roman[i];
				num = num - integer[i];
				if(num == 0) return str;
			}
		}
        return "";
    }
	
	public static void main(String[] args) {
		int num = 9;
		IntegerToRoman x = new IntegerToRoman();
		System.out.println(x.intToRoman(num));
	}
}
