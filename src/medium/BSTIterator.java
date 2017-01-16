package medium;

import java.util.Stack;


 class TreeNode {
     int val;
    TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }


public class BSTIterator {
	Stack<TreeNode> tn;
   public BSTIterator(TreeNode root) {
       tn = new Stack<TreeNode>();
       while(root!= null){
           tn.push(root);
           root = root.left;
         }
   }

   /** @return whether we have a next smallest number */
   public boolean hasNext() {
	   if(tn.isEmpty()) return false;
	   else return true;
	
       
   }

   /** @return the next smallest number */
   public int next() {
	   TreeNode n = tn.pop();
	   int ret = n.val;
	   if(n.right != null){
		   n = n.right;
		   while(n != null){
			   tn.push(n);
			   n = n.left;
		   }
	   }
	return ret;
       
   }
}