package easy;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(numRows == 0) return list;   	
        int num = 1;
    	  while(num<= numRows){
    		  generate(list,num);
    		  num++;    	  
    	  
       }
    	return list;
    }
    
    private void generate(List<List<Integer>> list,int numRows){
    	List<Integer> newlevelList = new LinkedList<Integer>();
    
       	if(numRows == 1)  {
       		newlevelList.add(1);
    		list.add(newlevelList);
    		
    	}
       	else if (numRows == 2){
       		newlevelList.add(1);    	  
       		newlevelList.add(1);
     	   list.add(newlevelList);
        }
       	else{
       		List<Integer> levelList = list.get(list.size()-1);
        	newlevelList.add(1);
        	int num;
        	for(int i = 1; i < levelList.size(); i ++){
        		num = levelList.get(i)+levelList.get(i-1);
        		newlevelList.add(num);
        	}
        	newlevelList.add(1);
        	list.add(newlevelList);
       	}
    	
    	
    }
    
public List<Integer> getRow(int rowIndex) {
	List<List<Integer>> list = generate(rowIndex+1);
	List<Integer> levelList = list.get(list.size()-1);
	return levelList;
	
    }

    public static void main(String[] args) {
//		int numsRow = 5;
//		PascalTriangle p = new PascalTriangle();
//		List<List<Integer>> list = p.generate(5);
    	int rowIndex = 3;
    	PascalTriangle p = new PascalTriangle();
    	List<Integer> list = p.getRow(rowIndex);
		System.out.println();
		System.out.println();
	}
}
