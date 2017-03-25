package companyProgramming;

import java.util.Scanner;

public class three2 {
	int postfixCalc(String input)
	{
	    int result = 0, num = 0;

	    for(int i = 0; i < input.length(); i++)
	    {
	        if(input.charAt(i) < '0')
	        {
	            if(input.charAt(i) == '+')
	                result += num;
	            else if(input.charAt(i )== '-')
	                result -= num;
	            else
	                result *= num;
	        }
	        else
	        {
	            if(input.charAt(i) >= 'A')
	                num = input.charAt(i) - 'A' + 10;
	            else
	                num = input.charAt(i) - '0';
	            if(i == 0)
	                result = num;
	        }

	    }
	    return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String line = scanner.nextLine();
			three2 main = new three2();
			int r = main.postfixCalc(line);
			System.out.println(r);
		}
		
		scanner.close();
	}

}
