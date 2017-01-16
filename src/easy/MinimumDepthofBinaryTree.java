package easy;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree {
	public int minDepth1(TreeNode root) {
	       if(root == null) return 0;

	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	        int depth =1;
	        while(!queue.isEmpty()){
	        	int num = queue.size();
	        	
	        	for(int i =0; i < num; i ++){        		
	        		if(queue.peek().left == null|| queue.peek().right== null) return depth;
	        		else{
	        			queue.offer(queue.peek().left);
	        			queue.offer(queue.peek().right);
	        			queue.poll();
	        		}
	        	}
	        	depth++;
	        	
	        }
	        return depth;
	}
	
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
		int leftdepth = minDepth(root.left);
		int rightdepth = minDepth(root.right);
		if(leftdepth == 0 && rightdepth == 0) return 1;
		if(leftdepth == 0) return rightdepth +1;
		if(rightdepth == 0) return leftdepth+1;
		else return Math.min(leftdepth,rightdepth)+1;
		
	}
}
