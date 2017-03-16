package medium;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		
		if (root == null) return true;
		return isValid(root.left,null,root.val) && isValid(root.right,root.val,null);
		
	   
    }
	
	public boolean isValid(TreeNode root,Integer low,Integer hi){
		if(root == null) return true;
		//判断左子树的一边
		if(hi != null && root.val >= hi) return false;
		//判断右子树的一边
		if(low != null && root.val<= low) return false;
		return isValid(root.right,root.val,hi) && isValid(root.left,low,root.val);
	}
}
