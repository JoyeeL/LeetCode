package easy;

import java.util.Arrays;

public class MajorityElement {
	 public int majorityElement(int[] nums) {
	      if( nums.length ==  1) return nums[0];
	      Arrays.sort(nums);
	      int midNum = nums[(int) Math.floor(nums.length/2.0)];
	     return midNum;
	      
	   }
}
