package medium;

import java.util.ArrayList;
import java.util.List;
/*
 * 主要考察格雷码的构造
 * 
	1. 1位格雷码有两个码字
	2. (n+1)位格雷码中的前2n个码字等于n位格雷码的码字，按顺序书写，加前缀0
	3. (n+1)位格雷码中的后2n个码字等于n位格雷码的码字，按逆序书写，加前缀1[3] 
	4. n+1位格雷码的集合 = n位格雷码集合(顺序)加前缀0 + n位格雷码集合(逆序)加前缀1


 */

public class GrayCode_89 {
	public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        if(n == 0){
        	return res;
        }
        if ( n == 1){
        	res.add(0);
        	res.add(1);
        	return res;
        }
        List<Integer> tmp = grayCode(n-1);
        for(int i = 0; i < tmp.size(); i ++){
        	int in = tmp.get(i);
        	res.add(in);
        }
        for(int i = tmp.size()-1; i >= 0; i --){
        	int in = tmp.get(i)+(1<<n-1);
        	res.add(in);
        }
        return res;
    }
	public static void main(String[] args) {
		int n = 3;
		GrayCode_89 gc = new GrayCode_89();
		List<Integer> res = new ArrayList<Integer>();
		res = gc.grayCode(n);
		for(int i = 0; i < res.size(); i ++){
			System.out.println(res.get(i));
		}
	}
}
