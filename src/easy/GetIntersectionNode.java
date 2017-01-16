package easy;

import java.util.Stack;

public class GetIntersectionNode {
    @SuppressWarnings("unused")
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode NodeA = headA,NodeB = headB;
        Stack<ListNode> stackA = new Stack<ListNode>();
        Stack<ListNode> stackB = new Stack<ListNode>();
        while(NodeA.next != null){
        	stackA.push(NodeA);
        	NodeA = NodeA.next;
        }
        while(NodeB.next != null){
        	stackB.push(NodeB);
        	NodeB = NodeB.next;
        }
        if(NodeA == NodeB){
        	if(stackA.isEmpty()) return NodeA;
        	if(stackB.isEmpty()) return NodeB;
        	while(!stackA.isEmpty() && !stackB.isEmpty()){
        		ListNode a = stackA.peek();
        		ListNode b = stackB.peek();
        		if( a == b) {
        			stackA.pop();
        			stackB.pop();
        		}
        		else return a.next;
        	}
        	if(stackA.isEmpty()) return headA;
        	if(stackB.isEmpty()) return headB;
        	
        }
       return null;
    }
    public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
        a= b;
		GetIntersectionNode gin = new GetIntersectionNode();
		ListNode c = gin.getIntersectionNode(a, b);
		System.out.println(c);
	}
}
