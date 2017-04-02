package companyProgramming;

import java.util.Scanner;

public class Main2 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        while (in.hasNext()) {//注意while处理多个case
	        	String fistLine = in.nextLine();
	            int a = Integer.parseInt(fistLine.split(" ")[0]);
	            long k = Long.parseLong(fistLine.split(" ")[1]);
	            String cycle  = in.nextLine();
	            String[] str_nums = cycle.split(" ");
	            long[] nums = new long[a];
	            long[] temp = new long[a];
	            for(int j = 0 ; j < nums.length; j ++){
	            	nums[j] = Long.parseLong(str_nums[j]);
	            	temp[j] = nums[j];
	            }
	            
	            long i = 0;
	            while(i < k){
	            	for(int j = 0; j < nums.length; j ++){
	            		if(j != nums.length-1){
	            			nums[j] = temp[j]+temp[j+1];
	            			if(nums[j] >= 100){
		            			nums[j] = nums[j]%100;
		            		}
	            		}
	            		else{
	            			nums[j] = temp[j] +temp[0];
	            			if(nums[j] >= 100){
		            			nums[j] = nums[j]%100;
		            		}
	            		}		            		
	            		
	            	}
	            	
	            	for(int m = 0; m < nums.length; m ++){
	            		temp[m] = nums[m];
	            	}
	            	
	            	i++;
	            }
	            for(int j = 0; j < nums.length; j ++){
	            	if(j != nums.length-1){
	            		System.out.print(nums[j]+" ");
	            	}
	            	else{
	            		System.out.print(nums[j]);
	            	}
	            	
	            }
	        
	    }
	        in.close();
	}
}
