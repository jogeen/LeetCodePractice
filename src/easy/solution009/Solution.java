package easy.solution009;

public class Solution {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String num = "" + x;
		int length = num.length();
		for (int i = 0; i < length / 2; i++) {
			if (num.charAt(i) != num.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean isPalindrome = new Solution().isPalindrome(-121);
		System.out.println(isPalindrome);
	}
}
