package easy;

public class RemoveNode {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null || head.next == null){
			return null;
		}
		
		ListNode p1 = head;
		ListNode p2 = head;
		
		for(int i = 0; i < n; i++){
			p1 = p1.next;
		}
		if(p1 == null){
			head = head.next;
			return head;
		}
		while(p1.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		p2.next = p2.next.next;
		
		return head;
    }
	

	
	public static void main(String[] args){
		 
		        // TODO Auto-generated method stub  
		        ListNode head = new ListNode(1);  
		        ListNode cur = head;  
		        for(int i = 0; i < 4; i++)  
		        {  
		               
		            ListNode tmp = new ListNode(i+2);  
		            cur.next = tmp;  
		            cur = tmp;  
		        }  
		        cur = removeNthFromEnd(head,2);  
		           
		        for(;cur != null;)  
		        {  
		            System.out.println(cur.val);  
		            cur = cur.next;  
		        }  
		       
		           
		    
	  
	  
	}

	
}



