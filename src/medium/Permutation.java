package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
	
	public List<List<Integer>> permute(int[] num) {
	  
	    List<List<Integer>> ans = new ArrayList<List<Integer>>();
	    if (num.length ==0) return ans;
	    List<Integer> l0 = new ArrayList<Integer>();
	    l0.add(num[0]);
	    ans.add(l0);
	    for (int i = 1; i< num.length; ++i){
	        List<List<Integer>> new_ans = new ArrayList<List<Integer>>(); 
	        for (int j = 0; j<=i; ++j){            
	           for (List<Integer> l : ans){
	        	   List<Integer> new_l = new ArrayList<Integer>(l);
	        	   new_l.add(j,num[i]);
	        	   new_ans.add(new_l);
	           }
	        }
	        ans = new_ans;
	    }
	    return ans;
	}
	/*public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        find(result,temp,used,nums);
        return result;
    }
    public void find(List<List<Integer>> result,List<Integer> temp,boolean[]  used,int[] nums){
    	if(temp.size() == nums.length){
    		result.add(new ArrayList<Integer>(temp));
    		return;
       }
    	
       for(int i = 0; i < nums.length; i ++){
    	   if( !used[i]){
    		   temp.add(nums[i]);
    		   used[i] = true;
    		   find(result,temp,used,nums);
    		   temp.remove(temp.size() -1);
    		   used[i] = false;
    	   }
       }   	
    }*/
    public static void main(String[] args){

		int[] nums = {1,2,3};
		Permutation per = new Permutation();
		System.out.println(per.permute(nums));
	}
    
}
