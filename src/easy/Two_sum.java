package easy;

public class Two_sum {
	public static int[] twoSum(int[] nums, int target){
		
		int[]  a =  new int[2];
		for(int i = 0 ; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[i] + nums[j] == target) {
					a[0] = i;
					a[1] = j;
					return a;
				}				
			}
		}
		
		return null;
        
    }
	
	public static void main(String[] args){
		int[] nums= {2, 7, 11, 15};
		int target = 9;
		int[] a = new int[2];
		a =twoSum(nums, target);
		for(int i = 0; i < a.length; i ++){
			System.out.print(a[i]);
		}
	}
}
