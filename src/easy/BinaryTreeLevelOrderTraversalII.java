package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversalII {
	public static List<List<Integer>> levelOrderBottom2(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
	   if(root == null) return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();		
		queue.add(root);
		while(!queue.isEmpty()){
			int num = queue.size();
			List<Integer> levelList = new LinkedList<Integer>();
			for(int i = 0; i < num; i ++){
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				levelList.add(queue.poll().val);
			}
			list.add(levelList);
		}
		Collections.reverse(list);
		return list;
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
        allList = levelOrderBottom2(root);
        System.out.println("done");
        System.out.println("done");
        
	}
	
}
