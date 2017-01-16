package easy;

import java.util.ArrayList;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        for(int i = 0; i < v1.length; i ++){
        	
        		num1.add(Integer.parseInt(v1[i]));
        	
        	
        }
        
        for(int i = 0; i < v2.length; i ++){
        	
        	num2.add(Integer.parseInt(v2[i]));
        	
        }
        int i = 0;
        while(i < num1.size() && i < num2.size()){
        	if(num1.get(i) < num2.get(i)) return -1;
        	if(num1.get(i) > num2.get(i)) return 1;
        	i++;
        }

        
        if(i == num1.size() && i < num2.size()){
        	for(int j = i; j < num2.size(); j ++){
        		if(num2.get(j)!= 0) return -1;
        	}
        
        }
        if(i == num2.size() && i < num1.size()){
        	for(int j = i; j < num1.size(); j ++){
        		if(num1.get(j)!= 0) return 1;
        	}
        	
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		String v1 = "1.0.0";
		String v2 = "1";
		CompareVersionNumbers cv = new CompareVersionNumbers();
		int result = cv.compareVersion(v1, v2);
		System.out.println(result);
	}
}
