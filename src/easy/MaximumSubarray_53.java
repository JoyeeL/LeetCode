package easy;

public class MaximumSubarray_53 {
	public int maxSubArray(int[] nums) {
		if(nums.length == 1) return nums[0];
		//dp[i] 表示以nums[i]为结尾最大的数；
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int max = dp[0];
		for(int i = 1; i < nums.length; i ++){
			if(dp[i-1] >= 0)
				dp[i] = nums[i]+ dp[i-1];
			else
				dp[i] = nums[i];
			
			max = Math.max(max, dp[i]);
		}
		return max;
	}
	
/*	public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        if(nums.length == 1) return nums[0];
        for(int i = 0; i < nums.length; i ++){
        	if(nums[i] < 0) continue;
            int temp = maxNum(nums,max,i,i);
            if(temp > max) max = temp;
        }
        return max;
    }
    
    public int maxNum(int[] nums, int max,int first,int second){
        if( second == nums.length) return max;
        
        int temp = 0;
        for(int i = first; i <= second; i ++){
            temp = temp + nums[i];
        }
        if(max < temp) max = temp;
        return Math.max(max,maxNum(nums,max,first,second+1));
    }*/
    public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray_53 ms = new MaximumSubarray_53();
		int m = ms.maxSubArray(nums);
		System.out.println(m);
	}
}
