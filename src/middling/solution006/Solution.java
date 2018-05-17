package middling.solution006;

public class Solution {
	public String convert(String s, int numRows) {
		if(numRows==1) {
			return s;
		}
		StringBuilder[] sbs = new StringBuilder[numRows];
		for (int i = 0; i < sbs.length; i++) {
			sbs[i] = new StringBuilder();
		}
		for (int i = 0; i < s.length(); i++) {
			int index = (i / (numRows - 1)) % 2 == 0 ? (i % (2 * (numRows - 1))) : ((numRows - 1) - i % (numRows - 1));
			sbs[index].append(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sbs.length; i++) {
			sb.append(sbs[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String longestPalindrome = new Solution().convert("PAYPALISHIRING", 4);
		System.out.println(longestPalindrome);
	}
}
