package companyProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPath {
	public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while(line != null && !line.isEmpty()) {
            int value = Integer.parseInt(line.trim());
            if(value == 0) break;
            inputs.add(value);
            line = in.nextLine();
        }
        int[] A = new int[inputs.size()];
        for(int i=0; i<inputs.size(); i++) {
            A[i] = inputs.get(i).intValue();
        }
        int res = resolve(A);

        System.out.println(String.valueOf(res));
    }

    // write your code here
    public static int resolve(int[] A) {
    	int f =0; int s = 0;
    	int xiabiao = 0;
    	int[] b = new int[15];
    	for(int i =0; i < b.length; i ++){
    		b[i] = -1;
    	}
    	for(int i = 0; i < A.length; i ++){
    		f = A[i]/100;
    		s =(A[i]%100)/10;
    		xiabiao = (int)Math.pow(2, f-1)+s-1;
    		b[xiabiao] = A[i];
    	}
    	
    	for(int i = b.length-1; i >0; i--) {
    		if(b[i] == -1){
    			
    		}
    	}
    	
    	int m = 0;
    	return m;
    }

}
