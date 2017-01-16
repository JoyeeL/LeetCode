package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	 public static List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer>> levelList = new LinkedList<List<Integer>>();
		 if(root == null) return null;
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 queue.add(root);
		 while(!queue.isEmpty()){
			 int num = queue.size();
			 List<Integer> list = new LinkedList<Integer>();
			 for(int i = 0; i < num; i ++){
				 if(queue.peek().left != null) queue.offer(queue.peek().left);
				 if(queue.peek().right != null) queue.offer(queue.peek().right);
				 list.add(queue.poll().val);
			 }
			 levelList.add(list);
		 }
		 
		 return levelList;
		
	}
	
	public static void main(String[] args) {
		
			
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);

        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);

        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);

        root.right.right = new TreeNode(3);

        List<List<Integer>> allList = new ArrayList<List<Integer>>();
        allList = levelOrder(root);
        System.out.println("done");
        System.out.println("done");
        
	}
}
