package hard;
import java.util.Arrays;


public class MedianNum {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length + nums2.length];
		result = MergeList(nums1,nums2);
		
		if(result.length % 2 ==0){
			
			
			return (((double)result[result.length/2]+(double)result[result.length/2-1])/2);
		}
		else
			return result[result.length/2];
		}
	
	public static double findMedianSortedArrays2(int[] nums1, int[] nums2){
		int sum = nums1.length + nums2.length;
		if(sum%2 == 0) return (findkth(nums1,nums1.length,nums2,nums2.length,sum/2+1)+findkth(nums1,nums1.length,nums2,nums2.length,sum/2))/2;
		else return findkth(nums1,nums1.length,nums2,nums2.length,sum/2+1);
	}
	
	public static double findkth(int a[],int m,int b[],int n,int k){
		if(m > n) return findkth(b,n,a,m,k);
		if(m == 0) return b[k-1];
		if(k == 1) return a[0] < b[0]?a[0]:b[0];
		
		int pa = Math.min(k/2, m);
		int pb = k -pa;
		if(a[pa-1] < b[pb-1]) return findkth(Arrays.copyOfRange(a, pa, m),m-pa,b,n,k-pa);
		if(a[pa-1] > b[pb-1]) return findkth(a,m,Arrays.copyOfRange(b, pb, n),n-pb,k-pb);
		else return a[pa-1];
		
		
	}
	
	 public static int[] MergeList(int a[],int b[])
	    {
	        int result[];  
	         //检查传入的数组是否是有序的
	        
	            result = new int[a.length+b.length];
	            
	            int i=0,j=0,k=0;   //i:用于标示a数组    j：用来标示b数组  k：用来标示传入的数组

	            while(i<a.length && j<b.length)
	                if(a[i] <= b[j]) {
	                    result[k++] = a[i++];
	                }else{
	                    result[k++] = b[j++];
	                }

	            /* 后面连个while循环是用来保证两个数组比较完之后剩下的一个数组里的元素能顺利传入 */
	            while(i < a.length) 
	                result[k++] = a[i++];
	            while(j < b.length)
	                result[k++] = b[j++];
	            
	            return result;
	    }
	 
	 public static void main(String[] args) {
		int a[] ={2};
		
		int[] b = {};
		
		double result = MedianNum.findMedianSortedArrays2(a, b);
		System.out.println(result );
		
		
	}
}
