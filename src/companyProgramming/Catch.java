package companyProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 判断点是否出现在一个三角形中
 */
public class Catch{
	public static void main(String[] args) throws NumberFormatException, IOException{
		//Scanner in = new Scanner(System.in);
        String line = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while((line = br.readLine())!= null && !line.isEmpty()){
			
				String[] input = line.split(" ");
	            
	            List<point> pointList = new ArrayList<point>();
	            int i = 0;
	            while(i < input.length-2){
	            	
	        	   point rail = new point(Float.parseFloat(input[i]),Float.parseFloat(input[i+1]));
	        	   pointList.add(rail);
	        	   i =  i+2;
	           }
	            
	            point dinosaur = new point(Float.parseFloat(input[input.length-2]),Float.parseFloat(input[input.length-1]));
	            
	            boolean iscatch = false;
	            boolean flag = false;
	            for(int j =0 ; j < pointList.size()-2 && !flag ; j ++){
	            	for(int m = j+1; m < pointList.size()-1&&!flag; m ++){
	            		for(int n = m+1; n < pointList.size()&&!flag; n ++){
	            			iscatch = isInTriangle(pointList.get(j),pointList.get(m),pointList.get(n), dinosaur);
	            			if(iscatch == true) {
	            				System.out.println("true");
	            				flag =true;
	            				break;
	            			}
	            		}
	            	}
	            }
	            
	           // line = in.nextLine();
			
        	
        }
        
       
	}



/*	判断恐龙的点是不是在三角形的内部
 * 
 */
	public static  boolean isInTriangle(point A, point B, point C, point P)
	{
		 /*利用叉乘法进行判断,假设P点就是M点*/
		float a = 0, b = 0, c = 0;
		
		/*向量减法*/
		point MA = new point(P.x - A.x,P.y - A.y);
		point MB = new point(P.x - B.x,P.y - B.y);
		point MC = new point(P.x - C.x,P.y - C.y);
		
		/*向量叉乘*/
		a = MA.x * MB.y - MA.y * MB.x;
		b = MB.x * MC.y - MB.y * MC.x;
		c = MC.x * MA.y - MC.y * MA.x;
		
		if((a <= 0 && b <= 0 && c <= 0)||
			(a > 0 && b > 0 && c > 0))
		{
			return true;
		}
		
		return false;
	}
	

}

class point {  
    float x;  
    float y;  
  point(float x,float y)  
  {  
        this.x=x;  
        this.y=y;  
    }  
}  
