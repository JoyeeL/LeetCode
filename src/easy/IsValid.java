package easy;

import java.util.ArrayList;

public class IsValid {
	public static boolean isValid(String s) {
		if(s.length() ==0 || s == null) return true;
		if(s.length()%2 !=0) return false;
		
		ArrayList<Character> in = new ArrayList<Character>();
		for(int i = 0 ; i < s.length(); i ++){
			char c = s.charAt(i);
			char lastchar;
			if(c == '(' || c =='[' || c == '{'){
				in.add(c);
			}			
			else{
				if(in.size()>0) {
					lastchar = in.get(in.size()-1);
					if(c == ')'){
						if ( lastchar == '(' ) in.remove(in.size()-1);
						else return false;
					}
					
					else if(c == ']'){
						if ( lastchar == '[' ) in.remove(in.size()-1);
						else return false;
					}
					else if(c == '}'){
						if ( lastchar == '{' ) in.remove(in.size()-1);
						else return false;
					}
				}
				else return false;
				
				
				
			}
		}
		
		if(in.size() == 0) {
			return true;
		}
		return false;
       
    }
	
	public static void main(String[] args) {
		String s = "()[]{}";
		boolean x = isValid(s);
		System.out.println(x);
	}
}
