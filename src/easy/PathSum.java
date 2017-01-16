package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PathSum {
	 public boolean hasPathSum(TreeNode root, int sum) {
		 if(root == null) return false;
		 
		 if(root.left == null && root.right == null && sum - root.val == 0) return true;
		 else return hasPathSum(root.left,sum-root.val) ||hasPathSum(root.right,sum-root.val);	      
	 }
	 
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
		 List<List<Integer>> list = new LinkedList<List<Integer>>();
		 List<Integer> currentlist = new LinkedList<Integer>();
		 pathSum(root,sum,list,currentlist);
		 return list;		
	 }
	 
	 private void pathSum(TreeNode root, int sum,List<List<Integer>> list,List<Integer> currentlist){
		 if(root == null) return;
		 currentlist.add(root.val);
		 if(root.left == null && root.right == null && sum - root.val == 0){			
			 list.add(new LinkedList(currentlist));
			 currentlist.remove(currentlist.size()-1);
			 return;
		 }
		 else{
			  pathSum(root.left,sum-root.val,list,currentlist);
			  pathSum(root.right,sum-root.val,list,currentlist);		 
		 }
		 currentlist.remove(currentlist.size()-1);
	 }
}
