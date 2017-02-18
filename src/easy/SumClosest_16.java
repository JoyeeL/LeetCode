package easy;

import java.awt.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/*
 * dp
 */
public class SumClosest_16 {
	  public  int  threeSumClosest(int[] nums, int target) {
		 if( nums == null || nums.length < 3) return 0;
		 int result = 0;
		 int closest = Integer.MAX_VALUE;
		 Arrays.sort(nums);
		 
		 for(int i = 0; i < nums.length; i ++){
			 int l = i +1, r = nums.length-1;
			 if (i > 0 && nums[i] == nums[i-1]) continue;  
			 while(l < r){
				 int sum = nums[i] + nums[r] + nums[l];
				 if( sum < target){
					 if( target - sum  < closest){
						 closest = target - sum;
						 result = sum;
					 }
					 l ++;
				 }
				 else  if ( sum > target){
					 { 
						 if (sum - target < closest){
							 closest = sum - target;
							 result = sum;
						 }
						 r --; 
					 }
					 
					
				 }
				 else return sum;
				 
			 }
		 }
		 return result;  	  
	  }
	  public static void main(String[] args) {
		  int[] S = {-1,2,1,-4};
		  int target = 1;
		  SumClosest_16 sc = new SumClosest_16();
		  int m =sc.threeSumClosest(S, target);
		  System.out.println(m);
	}
}
