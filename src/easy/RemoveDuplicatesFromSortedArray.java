package easy;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int num = 0, i = 0, j = 1;
		nums[num] = nums[0];
		if( nums.length  == 0 ) return 0;
		if( nums.length == 1) return 1;
		while(j < nums.length){
			if(nums[i] != nums[j]){
				num ++;
				nums[num] = nums[j];
			}
			
			i ++;
			j ++;
			
		}
		return num+1;       
    }
	
	
}
