package easy;

import java.util.Arrays;
import java.util.Collections;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];
		Arrays.sort(nums);
		int num = 0;
		for(int i = 0; i < nums.length-1; i ++){
			if(nums[i] == nums[i+1]){
				i= i+2;
				continue;
			}
			else{
				num = nums[i];
			}
		}
		if(nums[nums.length-1] != nums[nums.length -2]) num = nums[nums.length-1];
		return num;
        
    }
	
	public int singleNumber1(int[] nums) {
        int resnum = nums[0];
        for(int i = 1; i < nums.length; i ++){
            resnum ^= nums[i];
        }
        return resnum;
    }
	public static void main(String[] args) {
		int[] nums = {1,3,5,6,1,5,3,7,3,1,5,7,7};
		SingleNumber sn = new SingleNumber();
		int num = sn.singleNumber(nums);
		System.out.println(num);
	}
}
