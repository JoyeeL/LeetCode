package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * java集合大致上可分为：set,list,map三种体系，
 * 其中set代表无序不可重复的集合，
 * list代表有序可重复的集合，
 * map代表具有映射关系的集合。
 * 后来又增加一种Queue体系集合，代表一种队列的集合实现。
 */
public class IncreasingSubsequences_491 {
	public List<List<Integer>> findSubsequences(int[] nums) {
		Set<List<Integer>> res = new HashSet<List<Integer>>();
       
        List<Integer> tmp = new ArrayList<Integer>();
        helper(nums,res,tmp,0);
		return new ArrayList<List<Integer>>(res);
        
    }
	
	public void helper(int[] nums,Set<List<Integer>> res,List<Integer> tmp,int num){
	
		if(tmp.size() >= 2){		
			res.add(new ArrayList<Integer>(tmp));					
		}
		for(int i = num; i < nums.length; i ++){
			if(tmp.size() == 0 || nums[i] >= tmp.get(tmp.size()-1)){
				tmp.add(nums[i]);			
			    helper(nums,res,tmp,i+1);
			    tmp.remove(tmp.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = {4,6,7,7};
		IncreasingSubsequences_491 is = new IncreasingSubsequences_491();
		System.out.println(is.findSubsequences(nums));
	}
	
}
