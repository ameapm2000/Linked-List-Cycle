
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class Solution {

	public static void main(String[] args) 
	{
		ListNode l = new ListNode(1);
		ListNode l1 = new ListNode(2);
		l.next = l1;
		ListNode l2 = new ListNode(3);
		l1.next = l2;
		ListNode l3 = new ListNode(4);
		l2.next = l3;
		ListNode l4 = new ListNode(5);
		l3.next = l4;
		l4.next = l1;
		System.out.println(hasCycle(l));
	}
	
	public static boolean hasCycle(ListNode head) 
	{
		if(head == null)
			return false;
		
		ListNode slow,fast;
		slow = fast = head;
		
		while(true)
		{
			slow = slow.next;
			
			if(fast.next != null)
				fast = fast.next.next;
			else
				return false;
			
			if(slow == null || fast == null)
				return false;
			
			if(slow == fast)
				return true;
		}
		
	}

}
