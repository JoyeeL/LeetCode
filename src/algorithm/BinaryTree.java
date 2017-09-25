package algorithm;

import java.util.Stack;

public class BinaryTree {
protected BinaryNode root;

public BinaryTree(BinaryNode root) {
   this.root = root;
}

public BinaryNode getRoot() {
   return root;
}

/** 构造树 */
public static BinaryNode init() {
   BinaryNode a = new BinaryNode('A');
   BinaryNode b = new BinaryNode('B', null, a);
   BinaryNode c = new BinaryNode('C');
   BinaryNode d = new BinaryNode('D', b, c);
   BinaryNode e = new BinaryNode('E');
   BinaryNode f = new BinaryNode('F', e, null);
   BinaryNode g = new BinaryNode('G', null, f);
   BinaryNode h = new BinaryNode('H', d, g);
   return h;// root
}


/** 访问节点 */
public static void visit(BinaryNode p) {
   System.out.print(p.getKey() + " ");
}

/** 递归实现前序遍历 */
protected static void preorder(BinaryNode p) {
   if (p != null) {
    visit(p);
    preorder(p.getLeft());
    preorder(p.getRight());
   }
}

/** 递归实现中序遍历 */
protected static void inorder(BinaryNode p) {
   if (p != null) {
    inorder(p.getLeft());
    visit(p);
    inorder(p.getRight());
   }
}

/** 递归实现后序遍历 */
protected static void postorder(BinaryNode p) {
   if (p != null) {
    postorder(p.getLeft());
    postorder(p.getRight());
    visit(p);
   }
}

/** 非递归实现前序遍历 */
protected static void iterativePreorder(BinaryNode p) {
   Stack<BinaryNode> stack = new Stack<BinaryNode>();
   if (p != null) {
    stack.push(p);
    while (!stack.empty()) {
     p = stack.pop();
     visit(p);
     if (p.getRight() != null)
      stack.push(p.getRight());
     if (p.getLeft() != null)
      stack.push(p.getLeft());
    }
   }
}

/** 非递归实现前序遍历2 */
protected static void iterativePreorder2(BinaryNode p) {
   Stack<BinaryNode> stack = new Stack<BinaryNode>();
   BinaryNode BinaryNode = p;
   while (BinaryNode != null || stack.size() > 0) {
    while (BinaryNode != null) {//压入所有的左节点，压入前访问它
     visit(BinaryNode);
     stack.push(BinaryNode);
     BinaryNode = BinaryNode.getLeft();
    }
    if (stack.size() > 0) {//
     BinaryNode = stack.pop();
     BinaryNode = BinaryNode.getRight();
    }
   }
}

/** 非递归实现后序遍历 */
protected static void iterativePostorder(BinaryNode p) {
   BinaryNode q = p;
   Stack<BinaryNode> stack = new Stack<BinaryNode>();
   while (p != null) {
    // 左子树入栈
    for (; p.getLeft() != null; p = p.getLeft())
     stack.push(p);
    // 当前节点无右子或右子已经输出
    while (p != null && (p.getRight() == null || p.getRight() == q)) {
     visit(p);
     q = p;// 记录上一个已输出节点
     if (stack.empty())
      return;
     p = stack.pop();
    }
    // 处理右子
    stack.push(p);
    p = p.getRight();
   }
}

/** 非递归实现后序遍历 双栈法 */
protected static void iterativePostorder2(BinaryNode p) {
   Stack<BinaryNode> lstack = new Stack<BinaryNode>();
   Stack<BinaryNode> rstack = new Stack<BinaryNode>();
   BinaryNode BinaryNode = p, right;
   do {
    while (BinaryNode != null) {
     right = BinaryNode.getRight();
     lstack.push(BinaryNode);
     rstack.push(right);
     BinaryNode = BinaryNode.getLeft();
    }
    BinaryNode = lstack.pop();
    right = rstack.pop();
    if (right == null) {
     visit(BinaryNode);
    } else {
     lstack.push(BinaryNode);
     rstack.push(null);
    }
    BinaryNode = right;
   } while (lstack.size() > 0 || rstack.size() > 0);
}

/** 非递归实现后序遍历 单栈法*/
protected static void iterativePostorder3(BinaryNode p) {
   Stack<BinaryNode> stack = new Stack<BinaryNode>();
   BinaryNode BinaryNode = p, prev = p;
   while (BinaryNode != null || stack.size() > 0) {
    while (BinaryNode != null) {
     stack.push(BinaryNode);
     BinaryNode = BinaryNode.getLeft();
    }
    if (stack.size() > 0) {
     BinaryNode temp = stack.peek().getRight();
     if (temp == null || temp == prev) {
      BinaryNode = stack.pop();
      visit(BinaryNode);
      prev = BinaryNode;
      BinaryNode = null;
     } else {
      BinaryNode = temp;
     }
    }

   }
}

/** 非递归实现后序遍历4 双栈法*/
protected static void iterativePostorder4(BinaryNode p) {
   Stack<BinaryNode> stack = new Stack<BinaryNode>();
   Stack<BinaryNode> temp = new Stack<BinaryNode>();
   BinaryNode BinaryNode = p;
   while (BinaryNode != null || stack.size() > 0) {
    while (BinaryNode != null) {
     temp.push(BinaryNode);
     stack.push(BinaryNode);
     BinaryNode = BinaryNode.getRight();
    }
    if (stack.size() > 0) {
     BinaryNode = stack.pop();
     BinaryNode = BinaryNode.getLeft();
    }
   }
   while (temp.size() > 0) {
    BinaryNode = temp.pop();
    visit(BinaryNode);
   }
}

/** 非递归实现中序遍历 */
protected static void iterativeInorder(BinaryNode p) {
   Stack<BinaryNode> stack = new Stack<BinaryNode>();
   while (p != null) {
    while (p != null) {
     if (p.getRight() != null)
      stack.push(p.getRight());// 当前节点右子入栈
     stack.push(p);// 当前节点入栈
     p = p.getLeft();
    }
    p = stack.pop();
    while (!stack.empty() && p.getRight() == null) {
     visit(p);
     p = stack.pop();
    }
    visit(p);
    if (!stack.empty())
     p = stack.pop();
    else
     p = null;
   }
}

/** 非递归实现中序遍历2 */
protected static void iterativeInorder2(BinaryNode p) {
   Stack<BinaryNode> stack = new Stack<BinaryNode>();
   BinaryNode BinaryNode = p;
   while (BinaryNode != null || stack.size() > 0) {
    while (BinaryNode != null) {
     stack.push(BinaryNode);
     BinaryNode = BinaryNode.getLeft();
    }
    if (stack.size() > 0) {
     BinaryNode = stack.pop();
     visit(BinaryNode);
     BinaryNode = BinaryNode.getRight();
    }
   }
}

/**
* @param args
*/
public static void main(String[] args) {
   BinaryTree tree = new BinaryTree(init());
   System.out.print(" Pre-Order:");
   preorder(tree.getRoot());
   System.out.println();
   System.out.print(" In-Order:");
   inorder(tree.getRoot());
   System.out.println();
   System.out.print("Post-Order:");
   postorder(tree.getRoot());
   System.out.println();
   System.out.print(" Pre-Order:");
   iterativePreorder(tree.getRoot());
   System.out.println();
   System.out.print("Pre-Order2:");
   iterativePreorder2(tree.getRoot());
   System.out.println();
   System.out.print(" In-Order:");
   iterativeInorder(tree.getRoot());
   System.out.println();
   System.out.print(" In-Order2:");
   iterativeInorder2(tree.getRoot());
   System.out.println();
   System.out.print(" Post-Order:");
   iterativePostorder(tree.getRoot());
   System.out.println();
   System.out.print("Post-Order2:");
   iterativePostorder2(tree.getRoot());
   System.out.println();
   System.out.print("Post-Order3:");
   iterativePostorder3(tree.getRoot());
   System.out.println();
   System.out.print("Post-Order4:");
   iterativePostorder4(tree.getRoot());
   System.out.println();

}

}

 


