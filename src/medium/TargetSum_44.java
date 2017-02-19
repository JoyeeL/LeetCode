package medium;

public class TargetSum_44 {
	 public int findTargetSumWays(int[] nums, int S) {
		int num = find(nums,S,0,0,0);
		return num;
	        
	    }
	 
	 public int  find(int[] nums,int S,int count,int num,int sum){
		 if( sum == S && num == nums.length){
			 count++;
			 return count;
		 }
		 else if ( sum != S && num == nums.length){
			 return count;
		 }
		 else return find(nums,S,count,num+1,sum + nums[num]) + find(nums,S,count,num+1,sum - nums[num]);
		 
	 }
	 public static void main(String[] args) {
		int[] nums = {1, 1, 1, 1, 1};
		int S = 3;
		TargetSum_44 ts = new TargetSum_44();
		
		int count = ts.findTargetSumWays(nums, S);
		System.out.println(count);
	}
}
