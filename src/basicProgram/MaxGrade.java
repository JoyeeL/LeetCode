package basicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxGrade {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int m,n;
       
        
			while((line = br.readLine()) != null){
				m = Integer.parseInt(line.split("\\s+")[0]);
				n = Integer.parseInt(line.split("\\s+")[1]);
				String[] grade =null;
				int[] Sgrade = new int[m];
				if ( (line = br.readLine())!= null){
					grade = line.split("\\s+");
					
					for(int i = 0; i < grade.length; i ++){
						Sgrade[i] = Integer.parseInt(grade[i]);
					}
				}
				
				for(int i = 0; i < n; i ++){
					if( (line = br.readLine())!= null){
						String[] QU = line.split("\\s+");
						int f = Integer.parseInt(QU[1]);
						int l = Integer.parseInt(QU[2]);
						if(QU[0].equals("Q")){
							
							System.out.println(max(f-1,l-1,Sgrade));
						}
						else {
						
							Sgrade[f-1] = l;
						}
					}
					
				}
				
				
			}
		
    }
	
	public static int max(int m,int n,int[] nums){
		int max = 0;
		if( m > n) return max(n,m,nums);
		else{
			for(int i = m; i <= n; i ++){
				max = Math.max(max, nums[i]);
			}
			return max;
		}
		
	}
}
