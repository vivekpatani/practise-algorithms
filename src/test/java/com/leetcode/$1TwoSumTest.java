package com.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class $1TwoSumTest {
	
	int[] data, expected;
	int target;

	@Before
	public void setUp() {
		data = new int[] { 1, 2, 4, 7, 9 };
		target = 6;
		expected = new int[] { 1, 2 };
	}

	/**
	 * This is a Test to test Two Sums.
	 */
	@Test
	public void testTwoSum() {
		System.out.println(target);
		Assert.assertArrayEquals(expected, new $1TwoSum().twoSum(data, target));
	}
	
	/**
	 * This is a Test to test Two Sum Two Pass.
	 */
	@Test
	public void testTwoSumTwoPass() {
		System.out.println(target);
		Assert.assertArrayEquals(expected, new $1TwoSum().twoSumTwoPass(data, target));
	}
	
	/**
	 * This is a Test to test Two Sum Brute Force.
	 */
	@Test
	public void testTwoSumBruteForce() {
		System.out.println(target);
		Assert.assertArrayEquals(expected, new $1TwoSum().twoSumBruteForce(data, target));
	}
	
	@After
	public void tearDown() {
		data = null;
		target = -1;
		expected = null;
	}

}
