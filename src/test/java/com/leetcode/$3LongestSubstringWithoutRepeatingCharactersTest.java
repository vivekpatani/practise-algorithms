package com.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class $3LongestSubstringWithoutRepeatingCharactersTest {

	String t1, t2, t3;
	int l1, l2, l3;

	/**
	 * Setup
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		t1 = "abcabcbb";
		t2 = "bbbbb";
		t3 = "pwwkew";

		l1 = 3;
		l2 = 1;
		l3 = 3;
	}
	
	/**
	 * Break Down.
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		t1 = t2 = t3 = "";
		l1 = l2 = l3 = -1;
	}

	@Test
	public void lengthOfLongestSubstring1() {
		assertEquals(l1, new $3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(t1));
	}
	
	@Test
	public void lengthOfLongestSubstring2() {
		assertEquals(l2, new $3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(t2));
	}
	
	@Test
	public void lengthOfLongestSubstring3() {
		assertEquals(l3, new $3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(t3));
	}

}
