package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice.
 * 
 * Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 =
 * 9, return [0, 1].
 * 
 * @author flipswitch
 *
 */
public class $1TwoSum {

	/**
	 * O(n) Solution with one pass using a HashMap. This is the most efficient out
	 * of all and the one I did not get immediately.
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];
			if ((map.containsKey(compliment)) && (i != map.get(compliment))) {
				result[0] = map.get(compliment);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}

	/**
	 * O(n) with two passes while storing one pass in HashMap<Item, Index> This
	 * solution does one pass and cost us an extra set of parameters.
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumTwoPass(int[] nums, int target) {

		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];
			if ((map.containsKey(compliment)) && (i != map.get(compliment))) {
				result[0] = i;
				result[1] = map.get(target - nums[i]);
				return result;
			}
		}
		return result;
	}

	/**
	 * The O(n^2) Solution. Every number is tried with every other.
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumBruteForce(int[] nums, int target) {

		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] + nums[j] == target) {
					// System.out.println(target + " " + i + " " + j);
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}

		return result;
	}
}
