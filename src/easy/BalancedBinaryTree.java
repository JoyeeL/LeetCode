package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
