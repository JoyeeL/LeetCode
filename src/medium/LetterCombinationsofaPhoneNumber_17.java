package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 用先进先出队列，将对应的digit字母push进去
 * 在遍历过程中，poll()数字，并组合重新push进去
 */

/*
 * 一个好的solution
 *  public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}
 */

public class LetterCombinationsofaPhoneNumber_17 {
	public List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<String>();
        if(digits.length()== 0 || digits== null)return letters;
        String[] combinations = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        char[] digits_s = digits.toCharArray();
        Queue<String> result = new LinkedList<String>();
        int size = 0;
        
        for(int i = 0 ; i < digits_s.length; i ++){
        	String comb =combinations[digits_s[i]-'0'];
        	char[] oneChar = comb.toCharArray();
        	size = result.size();
        	
        	if(result.isEmpty() == true){
        		for(char c : oneChar){
        			result.add(String.valueOf(c));
        		}
        	}
        	else{
        		while(size > 0){
            		String peek = result.poll();
            		for(int j = 0 ; j < oneChar.length; j ++){
                		result.add(peek+String.valueOf(oneChar[j]));
                	}
            		size--;
            	}	
        	}
        	  	        	
        }
        while(!result.isEmpty()){
        	letters.add(result.poll());
        }
        return letters;
    }
	
	public static void main(String[] args) {
		String digits = "23";
		 List<String> letters = new ArrayList<String>();
		 LetterCombinationsofaPhoneNumber_17 lc = new LetterCombinationsofaPhoneNumber_17();
		 letters= lc.letterCombinations(digits);
		 for(int i = 0; i < letters.size(); i ++){
			 System.out.println(letters.get(i));
		 }
		 
		 
		
	}
}
