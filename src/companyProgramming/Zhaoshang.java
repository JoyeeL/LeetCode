package companyProgramming;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Zhaoshang {
	
	static class TreeNode{     
        String value;     
        TreeNode left;     
        TreeNode right;     
             
        public TreeNode(String value){     
            this.value=value;     
        }     
    }     
         
    TreeNode root;   
    

    
	/**   
     * 深度优先遍历，相当于先根遍历   
     * 采用非递归实现   
     * 需要辅助数据结构：栈   
     */    
    public void depthOrderTraversal(TreeNode root){     
        if(root==null){     
            System.out.println("empty tree");     
            return;     
        }            
        ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();     
        stack.push(root);            
        while(stack.isEmpty()==false){     
            TreeNode node=stack.pop();     
            System.out.print(node.value+"    ");     
            if(node.right!=null){     
                stack.push(node.right);     
            }     
            if(node.left!=null){     
                stack.push(node.left);     
            }                
        }     
        System.out.print("\n");     
    } 
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		int m = sc.nextInt();
    		int n = sc.nextInt();
    		for(int i = 0 ; i < m; i ++){
    			
    		}
    	}
    	
    	
	}
    
}
