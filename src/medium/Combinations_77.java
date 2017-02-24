package medium;
import java.util.*;
/*
 * 普通递归算法
 * 需要注意的是：顺序不同如【3,2】，【2,3】为重复结果，不需要重复计算，所以需要传递参数m,不进行往回的计算
 * 第二种思路：组合数C(n,k)=C(n-1,k-1)+C(n-1,k)
 */
public class Combinations_77 {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        boolean[] used = new boolean[n];
        find(res,tmp,used,n,k,1);
        return res;
    }
	
	private void find( List<List<Integer>> res,List<Integer> tmp, boolean[] used,int n,int k,int m){
		if(tmp.size() == k){
			res.add(new ArrayList<Integer>(tmp));			
			return;
		}
		for(int i = m; i <=n; i ++){
			if(!used[i-1]){
				tmp.add(i);
				used[i-1] = true;
				find(res,tmp,used,n,k,i+1);
				tmp.remove(tmp.size()-1);
				used[i-1] = false;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int n = 20,k = 16;
		Combinations_77 cb = new Combinations_77();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res = cb.combine(n, k);
		System.out.println(res.size());
		System.out.println("done");
	}
}
