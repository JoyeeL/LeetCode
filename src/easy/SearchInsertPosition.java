package easy;

public class SearchInsertPosition {
	 public int searchInsert(int[] nums, int target) {
		 	if(nums.length == 0 || nums == null) return 0;
		 	if(target < nums[0]) return 0;
		    for(int i = 0; i < nums.length; i ++){
		    	if(nums[i] == target) return i;
		    	else if(nums[i] < target) continue;
		    	else{
		    		if(nums[i]> target) return i;
		    	}
		    }
	        return nums.length;
	    }
	 
	 public static void main(String[] args) {
		int[] nums = {1,3,5,6};
	     SearchInsertPosition sip = new SearchInsertPosition();
	     int m = sip.searchInsert(nums, 0);
	     System.out.println(m);
	}
}
