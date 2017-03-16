package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Crime{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line =br.readLine() )!= null){
            String[] data = line.trim().split("\\s+");
            int n = Integer.parseInt(data[0]);
            int t = Integer.parseInt(data[1]);
            int c = Integer.parseInt(data[2]);
            
            
            if((line =br.readLine() )!= null){
                String[]  crimeData = line.split("\\s+");
                int[] crime = new int[n];
                for(int i = 0; i < crimeData.length; i ++){
                    crime[i] = Integer.parseInt(crimeData[i]);
                }
                
                System.out.println(slove(n,t,c,crime));
             
                
            }     
        }
        br.close();
	}
    
    public static int slove(int n,int t,int c ,int[] crime){
    	int sum = 0;
        int count = 0;
        for(int i = 0; i < c; i ++){
            sum = sum + crime[i];
		}
        if(sum <= t){
            count ++;
        }
        
        for(int i = c; i < n; i ++){
            sum = sum + crime[i]- crime[i-c];
            if(sum <= t){
            count ++;
        }
      }
        return count;
    }
}