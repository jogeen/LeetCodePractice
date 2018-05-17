package middling.solution017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return new ArrayList<>();
		}
		Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		String string = map.get(digits.charAt(0));
		List<String> list = new ArrayList<>(11664);
		for (int i = 0; i < string.length(); i++) {
			list.add("" + string.charAt(i));
		}
		for (int i = 1; i < digits.length(); i++) {
			String current = map.get(digits.charAt(i));
			int size = list.size();
			for (int j = 0; j < current.length(); j++) {
				for (int k = 0; k < size; k++) {
					list.add(list.get(k) + current.charAt(j));
				}
			}
			list = list.subList(size,list.size());
		}
		return list;
	}

	public static void main(String[] args) {
		List<String> threeSum = new Solution().letterCombinations("5678");
		System.out.println(threeSum.size());
	}
}
