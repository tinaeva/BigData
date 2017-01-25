package com.eva.hw5;
/* Given a singly linked list,
 * group all odd nodes together followed by the even nodes. 
 * Please note here we are talking about the node number 
 * and not the value in the nodes.
*/


public class OddEvenList {
	public ListNode moveOddEven(ListNode head) {
		if(head == null){
			return null;
		}
		
		ListNode p1 = head;
		ListNode p2 = head.next;		
		ListNode pEven = head.next;
		while(p2 != null && p2.next != null) {
			p1.next = p2.next;
			p1 = p1.next;
			p2.next = p1.next;
			p2 = p2.next;
			
		}
		p1.next = pEven;
		return head;	
		
	}
}
