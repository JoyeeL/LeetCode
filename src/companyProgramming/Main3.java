package companyProgramming;

import java.util.Scanner;

public class Main3 {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     while (in.hasNext()) {
    	 String line = in.nextLine();
    	 char[] str = line.toCharArray();
    	 int numB = 0,numG = 0;
    	 for(int i =0; i < str.length; i ++){
    		 if(str[i] == 'B') numB++;
    		 else numG++;
    	 }
    	 if(numB == 0 || numG == 0){
    		 System.out.println("0");
    		 continue;
    	 }
    	 
    	 int tmp = 0,num = 0;
    	 int out;
    	 for(int i = 0; i < str.length; i ++){
    		 if(str[i] == 'B')continue;
    		 tmp+= i-num;
    		 num++;
    	 }
    	 out = tmp;
    	 
    	 tmp = num = 0;
    	 for(int i = 0; i < str.length; i ++){
    		 if(str[i]=='G')continue;
    		 tmp+= i-num;
    		 num++;
    	 }
    	 out = Math.min(out, tmp);
    	 System.out.println(out);
     }
     in.close();
}

}
