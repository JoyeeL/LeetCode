package easy;

public class HouseRobber_198 {
	/*
	 * 暴力求解，递归，时间复杂度：2^n;
	 * 自顶向下，从大到小
	 */
	public int solve(int idx,int[] nums){
		if(idx < 0) return 0;	
		//若抢劫第idx个，则下次必须跳过idx-1;
		return Math.max(nums[idx] + solve(idx-2,nums), solve(idx-1,nums));
	}
	public int rob(int[] nums) {
		
        return solve(nums.length-1,nums);
    }
	
	/*
	 * 动态规划，自顶向下,递归
	 * n-1 ->(n-3,n-4,n-5)
	 * n-2 ->(n-4,n-5)
	 * 出现重复计算，可以保留重复计算结果,用result数组保存结果
	 * 时间复杂度：n
	 */
	public static int[] result;
	public int solve1(int idx,int[] nums){
		if(idx < 0) return 0;
		if (result[idx] > 0) return result[idx];
		result[idx] = Math.max(nums[idx] + solve(idx-2,nums), solve(idx-1,nums));
		return result[idx];
	}
	
	
	
	public  int rob1(int[] nums){
		result = new int[nums.length];
		for(int i = 0;i < nums.length; i ++){
			result[i ] = -1;
		}
		return solve1(nums.length-1,nums);
	}
	
	/*
	 * 动态规划，自底向上,非递归解法，需要考虑边界问题
	 * n-1 ->(n-3,n-4,n-5)
	 * n-2 ->(n-4,n-5)
	 * 出现重复计算，可以保留重复计算结果,用result数组保存结果
	 * 时间复杂度：n
	 */

	public  int rob2(int[] nums){
		result = new int[nums.length];
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];
		if(nums.length == 2) return Math.max(nums[0], nums[1]);
		result[0] = nums[0];
		result[1] = Math.max(nums[0], nums[1]);
		for(int i = 2; i < nums.length; i ++){
			result[i] = Math.max(nums[i]+ result[i-2], result[i-1]);
		}
		return result[nums.length-1];
	}
	
	
}
