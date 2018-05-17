package middling.solution005;

public class Solution {
	public String longestPalindrome(String s) {
		if (s.length() <= 1) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			sb = sb.append(s.charAt(length - 1 - i));
		}
		for (int i = 0; i < length; i++) {
			for (int j = i; i < length; j++) {
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String longestPalindrome = new Solution().longestPalindrome("babad");
		System.out.println(longestPalindrome);
	}
}
