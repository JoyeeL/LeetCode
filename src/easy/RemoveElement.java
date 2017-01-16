package easy;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		if(nums.length == 0) return 0;
		int i = 0,num = 0;		
	    while(i < nums.length){
	    	if(nums[i] != val){
	    		nums[num] = nums[i];
	    		num++;
	    	}
	    	i++;
	    }
		return num;
        
    }
}
