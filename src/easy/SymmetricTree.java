package easy;

import java.util.Stack;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
	 if(root == null) return true;
	 else return isSymmetric(root.left,root.right);
 
    }
	
	private boolean isSymmetric(TreeNode left,TreeNode right){
		if(left== null && right == null ) return true;
		else if(left == null || right == null) return false;
		else if(left.val != right.val) return false;
		else return isSymmetric(left.left,right.right) &&isSymmetric(left.right,right.left);
		
	}
	//非递归
	public boolean isSymmetric2(TreeNode root){
	  
		 	if(root == null) return true;
				Stack<TreeNode> leftStack = new Stack<TreeNode>();
				Stack<TreeNode> rightStack = new Stack<TreeNode>();
				leftStack.push(root.left);
				rightStack.push(root.right);
				System.out.println(leftStack.size()+": "+ rightStack.size());
				int i = leftStack.size();
				int j = rightStack.size();
				while(leftStack.size() > 0 && rightStack.size() >0){
					TreeNode left = leftStack.pop();
					TreeNode right = rightStack.pop();
					if(left == null && right == null) continue;
					if(left == null || right == null) return false;
					if(left.val == right.val){
						leftStack.push(left.left);
						leftStack.push(left.right);
						rightStack.push(right.right);
						rightStack.push(right.left);
					}
					else return false;
				}return true;
			
	    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
	     root.left = new TreeNode(2);
		System.out.println(new SymmetricTree().isSymmetric2(root));
	}
	}


 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }