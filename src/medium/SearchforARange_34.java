package medium;

public class SearchforARange_34 {
	 public static int[] searchRange(int[] nums, int target) {
       int[] noresult ={-1,-1};
       
       if(nums.length == 0) return noresult;
       int lo = 0, hi = nums.length -1;
       int result_lo = -1,result_hi = -1;
       while(lo <= hi){
    	   int mid = (lo + hi)/2;
    	   if(nums[mid] < target ) lo = mid +1;
    	   else if(nums[mid] > target) hi = mid -1;
    	   else {
    		 result_lo = result_hi = mid;
    		 lo = mid -1;
    		 hi = mid +1;
    		 while(lo >= 0){
    			 if(nums[lo] == target)lo --;
    			 else break;
    		 }
    		while(hi <= nums.length-1){
    			 if(nums[hi] == target)hi ++;
    			 else break;
    		}
    		 result_lo = lo+1;
    		 result_hi = hi-1;
    		 noresult[0] = result_lo;
    		 noresult[1] = result_hi;
    		return noresult;
    	   }
       }
       return noresult;
    }
	 
	 public static void main(String[] args) {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] result = new int[2];
		result  = searchRange(nums,9);
		System.out.println(result[0] + " " + result[1]);
	}
}
