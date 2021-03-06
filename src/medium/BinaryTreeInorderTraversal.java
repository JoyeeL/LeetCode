package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
public List<Integer> inorderTraversal(TreeNode root) {
	List<Integer> inorderList = new ArrayList<Integer>();
	Stack<TreeNode> stack = new Stack<TreeNode>();
	while( root != null){
		stack.push(root);
		root = root.left;
	}
	while(! stack.isEmpty()){
		TreeNode node = stack.pop();
		inorderList.add(node.val);
	
		if(node.right != null){
			
			node =node.right;
			while(node != null){
				stack.push(node);
				node = node.left;
			}
		}
	}
	return inorderList;
        
    }
}
