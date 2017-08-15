package com.leetcode;

import com.vivekpatani.helper.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 
 * Output: 7 -> 0 -> 8
 * 
 * @author flipswitch
 *
 */
public class $2AddTwoNumbers {

	/**
	 * Adding Two Numbers. Beat 96.48% solutions.
	 * 
	 * @param l1
	 * @param l2
	 */
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode ref = result;
		int sum = 0, carry = 0;

		while (l1 != null || l2 != null) {
			// System.out.println(sum + " " + carry);
			sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			sum = sum % 10;
			ListNode current = new ListNode(sum);
			ref.next = current;
			ref = ref.next;
		}

		if (carry != 0) {
			ListNode current = new ListNode(carry);
			ref.next = current;
			ref = ref.next;
			carry = 0;
		}

		return result.next;
	}

}