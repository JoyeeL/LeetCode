package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
	      if(root == null) return true;
	      Queue<TreeNode> queue = new LinkedList<TreeNode>();
	      queue.add(root);
	      int leftDepth;
	      int rightDepth;
			 while(!queue.isEmpty()){
				 int num = queue.size();
				 for(int i = 0; i < num; i ++){
				    leftDepth = maxDepth(queue.peek().left);
				     rightDepth = maxDepth(queue.peek().right);
				    if(Math.abs(leftDepth-rightDepth) > 1) return false;
				    if(queue.peek().left != null) queue.offer(queue.peek().left);
				    if(queue.peek().right != null) queue.offer(queue.peek().right);		
				     queue.poll();
				 }
				
			 }
			 return true;
	  }
	 private int maxDepth(TreeNode root) {
			if(root == null) return 0;
			return Math.max(maxDepth(root.left),maxDepth(root.right))+1;   
	  }
	
}
