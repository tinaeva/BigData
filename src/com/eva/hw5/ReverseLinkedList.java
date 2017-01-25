package com.eva.hw5;
/*
 * Reverse a singly linked list
*/


public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode preNode = null;
		while(head != null) {
			ListNode temp = head.next;
			head.next = preNode;
			preNode = head;
			head = temp;
		}
		return preNode;

	}
	
}


