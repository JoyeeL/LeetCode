package medium;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		Boolean leftFlag = false,rightFlag = false;
		if (root == null) return true;
		if(root.left != null){
			if(root.val <= root.left.val) return false;
			else leftFlag =isValidBST(root.left);
		}
		if(root.right != null){
			if(root.val >= root.right.val) return false;
			else rightFlag =isValidBST(root.right);
		}
        return leftFlag && rightFlag;
    }
}
