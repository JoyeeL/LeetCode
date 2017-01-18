package medium;

public class ReverseWordsinaString {
	public String reverseWords(String s) {
		String[] str = s.trim().split("\\s+");
		String newStr = "";
		//if(str.length ==1) return s.trim();
		for(int i = str.length-1 ; i >=0 ; i --){
			if(str[i].length()!= 0){
				newStr += str[i];
				if(i != 0) newStr += " ";
			}
			
		}
        return newStr;
    }
	public static void main(String[] args) {
		String str = " 1";
		ReverseWordsinaString rws = new ReverseWordsinaString();
		String newstr = rws.reverseWords(str);
		System.out.println(newstr);
	}
}
