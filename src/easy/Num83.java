package easy;

public class Num83 {
   public static ListNode deleteDuplicates(ListNode head) {
	if(head == null) return null;
	
	ListNode cur = head;
	while(cur.next != null){
	
		if(cur.val == cur.next.val){
			cur.next = cur.next.next;
		}
		else{
			cur = cur.next;
		}
	}
	
	
	return head;    
   }
   
   public static void main(String[] args) {
       // TODO Auto-generated method stub  
       ListNode head = new ListNode(1);  
       ListNode cur = head;  
       for(int i = 0; i < 4; i++)  
       {  
              
           ListNode tmp = new ListNode(i);  
           cur.next = tmp;  
           cur = tmp;  
       }  
       
       
       for(;cur != null;)  
       {  
           System.out.println(cur.val);  
           cur = cur.next;  
       }
       cur =deleteDuplicates(cur); 
          
       for(;cur != null;)  
       {  
           System.out.println(cur.val);  
           cur = cur.next;  
       } 
}
   
}