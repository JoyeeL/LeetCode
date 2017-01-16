package easy;

import java.util.HashMap;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if(head == null) return false;
		HashMap<ListNode,Integer> map = new HashMap<ListNode,Integer>();
		ListNode next;
		while(head != null){
			next = head.next;
			if(map.containsKey(next)){
				return true;
			}
			map.put(next, head.val);
			head = head.next;
		}
        return false;
        
    }
	
	public boolean hasCycle2(ListNode head){
		if(head == null) return false;
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return true;
			}
			
		}
		return true;
	}
	
	
public ListNode detectCycle(ListNode head) {
       if(head == null) return null;
       ListNode slow = head,fast = head;
       while(true){
    	   if(fast == null || fast.next == null) return null;
    	   slow = slow.next;
    	   fast = fast.next.next;
    	   if(fast == slow) break;
       }
       
       slow = head;
       while(slow != fast){
    	   slow = slow.next;
    	   fast = fast.next;
       }
       return slow;
    }
}


