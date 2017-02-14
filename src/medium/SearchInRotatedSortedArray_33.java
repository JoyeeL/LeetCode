package medium;

/*
 * 先找过最小数(smallest value)
 */
public class SearchInRotatedSortedArray_33 {	
	public int search(int[] nums, int target) {
		if(nums.length == 0) return -1;
		int lo = 0,hi = nums.length-1;
		
		while(lo < hi){
			int mid = lo + (hi - lo) / 2;
			if (nums[mid] > nums[hi]) lo = mid +1;
			else hi = mid;
		}
		
		
		int min = lo;
		if(target == nums[min]) return min;
		
		if(target == nums[nums.length -1]) return nums.length -1;
		if(target < nums[nums.length -1]) {
			lo = min;
			hi = nums.length-1;
		}
		else{
			lo = 0;
			hi = min;
		}
		while(lo <= hi){
			int mid = lo + (hi - lo)/2;
			if(nums[mid] < target ) lo = mid +1;
			else if (nums[mid] > target) hi = mid-1;
			else return mid;
		}
		//此处很关键
		//if( lo == hi && nums[lo] != target) return -1;
        return -1;
    }
	
	public static void main(String[] args) {
		int[] nums = {1};
		
		SearchInRotatedSortedArray_33 sir = new SearchInRotatedSortedArray_33();
		int result = sir.search(nums, 0);
		System.out.println(result);
	}
}
