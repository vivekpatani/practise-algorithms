package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Examples:
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 * Given "bbbbb", the answer is "b", with the length of 1.
 * 
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
 * answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author flipswitch
 *
 */
public class $3LongestSubstringWithoutRepeatingCharacters {
	
	/**
	 * Longest Substring Without Repeating Characters
	 * Only got this half way and then looked at Solution.
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {

		if (s.length() == 0)
			return 0;
		Map<Character, Integer> map = new HashMap<>();
		int j = 0, max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}

		return max;
	}
}
