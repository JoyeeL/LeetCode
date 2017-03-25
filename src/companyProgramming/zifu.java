package companyProgramming;

import java.util.Scanner;

public class zifu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = "";
		while(in.hasNext()){
			line = in.nextLine();
			char[] str = line.trim().toCharArray();
			StringBuffer outStr = new StringBuffer(str.length);
			char ch ;
			
			for(int i = 0; i < str.length; i ++){
				if(str[i]< 'A' || (str[i]> 'Z' && str[i] < 'a' || str[i] > 'z')){
					continue;
				}
				if(str[i]>='A' && str[i] <= 'Z'){					
					ch = (char)((int)(str[i])+32);
					outStr.append(ch);
				}
				else if ( str[i] >='a' && str[i] <= 'z'){
					outStr.append(str[i]);
				}
			}
			System.out.println(outStr);
			
		}
		in.close();
	}
}
