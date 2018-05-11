package middling.solution003;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		java.util.Map<Character, Integer> map = new java.util.HashMap<>();
		Integer startIndex = 0;
		Integer preIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				preIndex = map.get(c);
				Integer length = i - preIndex;
				if (length > maxLength) {
					maxLength = length;
				}
				for (int j = startIndex; j <= preIndex; j++) {
					Integer index = map.get(s.charAt(j));
					if(index!=null&&index<=preIndex) {
						map.remove(s.charAt(j));
					}
				}
				startIndex = new Integer(preIndex);
			}
			map.put(c, i);
			maxLength = map.size() > maxLength ? map.size() : maxLength;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int lengthOfLongestSubstring = new Solution().lengthOfLongestSubstring("abcabcbb");
		System.out.println(lengthOfLongestSubstring);
	}
}
