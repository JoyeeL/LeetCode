package medium;

public class ContainerWithMostWater {
	 public int maxArea(int[] height) {
		 int len = height.length;
		 int i = 0, j = len-1;
		 int left ,right;
		 int area ;
		 int maxArea = 0;
		 while(i < j){
			 area = Math.min(height[i], height[j])*(j-i);
			 left= height[i]; right = height[j];
			 if( area > maxArea) maxArea = area;
			 if( left < right ){
				 
				 while( left >= height[i] && i < j)
				 i++;
			 }
			 else{
				 while(right >= height[j] && i < j)
				 j--;
			 }
		 }
	        return maxArea;
	    }
	 
	 public static void main(String[] args) {
		int[] height = {1,2,4,3};
		ContainerWithMostWater cw = new ContainerWithMostWater();
		int area = cw.maxArea(height);
		System.out.println(area);
	}
}
