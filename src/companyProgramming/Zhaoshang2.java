package companyProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Zhaoshang2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<String> person = new ArrayList<String>();
			HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
			for(int i = 0; i < m; i ++){
				String[] data = sc.nextLine().split(" ");
				for(int j = 0 ; j< 3; j ++){
					if(!person.contains(data[i])){
						person.add(data[i]);
					}
				}
				ArrayList<String> recommend = new ArrayList<String>();
				if(data[1] != "*") recommend.add(data[1]);
				if(data[2] != "*") recommend.add(data[2]);
				map.put(data[0],recommend );				
			}
			
			ArrayList<String> result = new ArrayList<String>();
			for(int i = 0; i < person.size(); i ++){
				String p = person.get(i);
				int num = find(p,1,map);
				if(num >= n){
					result.add(p);
				}
			}
			
			if(result.isEmpty()) System.out.println("None");
			 
		
		}
	}
	
	public static int find(String p,int num,HashMap<String,ArrayList<String>> map){
		if(map.containsKey(p)){
			ArrayList<String> recommend = new ArrayList<String>();
			for(int i = 0; i < recommend.size();i ++){
				num= num +1 + find(recommend.get(i),num+1,map);
			}
			return num;
		}
		else{
			return num;
		}
		
	}
}
