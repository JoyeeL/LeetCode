package easy;

/*
 * 采用尾插法，这样就不再需要辅助空间的开销
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */

public class Num88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1; 
        int j = n-1;
        
        while(i >= 0 && j >=0){
        	nums1[k--] = nums1[i] > nums2[j]?nums1[i--]:nums2[j--];
        }
        while(j >= 0){
        	nums1[k--] = nums2[j--];
        }
    }
	
	public void merge2(int[] nums1, int m, int[] nums2, int n){
		 int k = m+n-1;
	     int i = m-1; 
	     int j = n-1;
	     while(i >= 0 && j >= 0){
	    	 if(nums1[i] >= nums2[j]){
	    		 nums1[k] = nums1[i];
	    		 i--;
	    	 }
	    	 else{
	    		 nums1[k] = nums2[j];
	    		 j--;
	    	 }
	    	 k--;
	     }
	     while(j >= 0){
	    	 nums1[k] = nums2[j];
	    	 k--;
	    	 j--;
	     }
	}
}
