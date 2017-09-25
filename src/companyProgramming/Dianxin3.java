package companyProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Dianxin3 {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
		int n = sc.nextInt();
		int[] array1 = new int[n];
		ArrayList<Integer> array = new ArrayList<Integer>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < n; i ++){
			int temp = sc.nextInt();
			if(array.contains(temp)){
				array1[i] = temp;
				continue;
			}
			else{
				array1[i] = temp;
				array.add(temp);
			}
		}
		
		Collections.sort(array);
		for(int i = 0; i< array.size(); i ++){
			int sort_num = array.get(i);
			map.put(sort_num, i+1);
		}
		
		for(int i = 0; i < n; i ++){
			System.out.print(map.get(array1[i]));
			if(i != n-1){
				System.out.print(" ");
			}
		}
	}
	sc.close();
	}
}
