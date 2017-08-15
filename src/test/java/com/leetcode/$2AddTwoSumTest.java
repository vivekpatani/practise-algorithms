/**
 * 
 */
package com.leetcode;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vivekpatani.helper.ListNode;

/**
 * Test For Add Two Numbers
 * @author flipswitch
 *
 */
public class $2AddTwoSumTest {
	
	ListNode l1, l2, l3, l4, l5, l6, l7, l8, l9;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		l1 = new ListNode(2);
		l2 = new ListNode(4);
		l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		
		l4 = new ListNode(5);
		l5 = new ListNode(6);
		l6 = new ListNode(4);
		l4.next = l5;
		l5.next = l6;
		
		l7 = new ListNode(7);
		l8 = new ListNode(0);
		l9 = new ListNode(8);
		
		l7.next = l8;
		l8.next = l9;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		l1 = l2 = l3 = l4 = l5 = l6 = l7 = l8 = l9 = null;
	}

	@Test
	public void test() {
		
	}

}
