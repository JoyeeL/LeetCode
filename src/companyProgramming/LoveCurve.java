package companyProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LoveCurve {
	public double getGaussian(double x,double u,double deta){
		return u+x*deta;
	}
	
	public static boolean isOnLoveCurve(double x,double y){
		double first = Math.pow(x*x+y*y-1,3);
		double second = x*x*y*y*y;
		if(first - second <= 0) return true;
		else return false;
	}
	
	public static double getProbility(double u,double u2,double deta,double deta2){
		int num = 100000;
		int count = 0;
		Random random = new Random();
		for(int i = 0; i < num; i ++){
			double x = random.nextGaussian()*deta+u;
			double y = random.nextGaussian()*deta2 +u;
			
			if(isOnLoveCurve(x,y)){
				count++;
			}
		}
		
		return (double)count/num;
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		double u,u2,deta,deta2;
		while((line = br.readLine())!= null){
			u = Double.parseDouble(line.trim());
			u2= Double.parseDouble(br.readLine().trim());
			deta = Double.parseDouble(br.readLine().trim());
			deta2 = Double.parseDouble(br.readLine().trim());
			double pro = getProbility(u,u2,deta,deta2);
			System.out.println(String.format("%.2f", pro));
		}
		
	}
}
