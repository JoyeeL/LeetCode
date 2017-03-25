package Math;

import java.util.Collections;
import java.util.List;

public class Triangle {
	public static void main(String[] args) {
		System.out.println(Math.toDegrees(Math.atan(1)));
		
	}
	public boolean isCatch(List<point> retail,point p){
	    Collections.sort(retail);
		boolean isCatch = false;
		return isCatch;
		
	}
	public double angle(point p){
		double tan = Math.abs(p.y)/Math.abs(p.x);
		if(p.x == 0 && p.y >= 0) return 90.0;
		else if(p.x == 0 && p.y <= 0) return 270.0;
		else if(p.x > 0 && p.y >= 0) return Math.toDegrees(Math.atan(tan));//第一象限
		else if(p.x < 0 && p.y >= 0) return 180-  Math.toDegrees(Math.atan(tan));
		else if(p.x < 0 && p.y < 0) return 180 + Math.toDegrees(Math.atan(tan));
		else if(p.x > 0 && p.y < 0) return 360 - Math.toDegrees(Math.atan(tan));
		return 0;
		
	}
	
}
class point implements Comparable<point>{
	float x;
	float y;
	point(float x , float y){
		this.x =x;
		this.y = y;
	}
	public int compareTo(point o){
		if( x < o.x){
			return -1;
		}else if(x>o.x){
			return 1;
		}
		return 0;
	}
}