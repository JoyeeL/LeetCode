package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {
	  public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        List<Integer> temp = new ArrayList<Integer>();
	        Arrays.sort(candidates);  
	        find(candidates,target,0,0,result,temp);
	        return result;
	    }
	    
	    public void find(int[] candidates,int target,int sum,int level,List<List<Integer>> result, List<Integer>temp){
	        if(sum > target) return;
	        if(sum == target ) {
	            result.add( new ArrayList<Integer>(temp));
	            return ;
	        }
	        for(int i = level; i < candidates.length; i ++){
	            temp.add(candidates[i]);
	            find(candidates,target,sum+candidates[i],i,result,temp);
	            temp.remove(temp.size()-1);
	        }
	        
	    }
	    public static void main(String[] args) {
			int[] candidates = {2,3,7};
			int target = 7;
			CombinationSum_39 cs = new CombinationSum_39();
			cs.combinationSum(candidates, target);
		}
}
