package medium;

import java.util.ArrayList;
import java.util.List;
//思路是每次一次选取一个结点为根，然后递归求解左右子树的所有结果，最后根据左右子树的返回的所有子树，依次选取然后接上（每个左边的子树跟所有右边的子树匹配，而每个右边的子树也要跟所有的左边子树匹配，总共有左右子树数量的乘积种情况），构造好之后作为当前树的结果返回。代码如下： 

public class UniqueBinarySearchTreesII_95 {
	public ArrayList<TreeNode> generateTrees(int n) {  
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        if(n == 0) return result;
	    return helper(1,n);  
	}  
	private ArrayList<TreeNode> helper(int left, int right){
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		if(left > right){
			result.add(null);
			return result;
		}
		for(int i = left; i <= right;i ++){
			ArrayList<TreeNode> leftlist = helper(left,i-1);
			ArrayList<TreeNode> rightlist = helper(i+1,right);
			for(int j = 0; j < leftlist.size(); j ++){
				for(int k = 0; k < rightlist.size(); k ++){
					TreeNode root = new TreeNode(i);
					root.left = leftlist.get(j);
					root.right = rightlist.get(k);
					result.add(root);
				}
			}
		}
		return result;
	}
    public static void main(String[] args) {
		int n = 3;
		UniqueBinarySearchTreesII_95  ubst = new UniqueBinarySearchTreesII_95();
		 List<TreeNode> result = new ArrayList<TreeNode>();
		 result =ubst.generateTrees(n);
		System.out.println(result.size());
		System.out.println(result.size());
	}
    
}

/*class TreeNode {
	  int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(int x) { val = x; 
	}

}*/

