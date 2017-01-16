package easy;

public class RotateArray {
    public void rotate(int[] nums, int k) {
    	 k = k%nums.length;
        int[] nums1 = nums.clone();
        for(int i = 0; i < nums1.length; i ++){
        	nums[(i+k)%nums.length]= nums1[i];
        }
    }
    public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		RotateArray test = new RotateArray();
		test.rotate(nums, k);
		System.out.println(nums);
	}
}
