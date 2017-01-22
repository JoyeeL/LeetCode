package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 思路：获取target(nums[i]),遍历i之后的数字，从i+1和末端进行扫描，得到数字
 * 注意点：不要有重复的组合，如果遇到相同的数字要跳过，经过排序后，相同的数字都未紧邻数字
 */

public class Sum3_15 {
	 public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length < 3) return result;
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length-2; i ++){
			if(i > 0 && nums[i]== nums[i-1])continue;
			find(nums[i],i+1,nums.length-1,nums,result);
		}
		return result;
	  		
	 }
	 
	 public void find(int target,int begin,int end,int[] nums, List<List<Integer>> result){
			int f= begin,s = end;
			while(f < s){
				if(target + nums[f] + nums[s] == 0){
					List<Integer> set = new ArrayList<Integer>();
				    set.add(target);
				    set.add(nums[f]);
				    set.add(nums[s]);
				    result.add(set);
				    while(f < s && nums[f] == nums[f+1]) f++;
					while(f < s && nums[s] == nums[s-1]) s--;
					f++;
					s--;

				}
				else if(target + nums[f] + nums[s] < 0){
					f++;
				}
				else{
					s--;
				}
			}
		}
	 
	 public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		Sum3_15 sum = new Sum3_15();
		sum.threeSum(nums);
	}
}
