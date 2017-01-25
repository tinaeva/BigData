package com.eva.hw5;
/*
 * Given a sorted linked list,
 * delete all duplicates such that each element appear only once.
 */

public class DelListDup {
	public ListNode delDuplicate(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode cur = head;

		while(cur != null && cur.next != null) {
			if(cur.val == cur.next.val) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}						
		}
		
		return head;
	}
}
