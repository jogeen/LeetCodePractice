package easy.solution9;

public class Solution {

	public boolean isPalindrome(int x) {
		String num=""+x;
		num = x<0?num.substring(1):num;
		int length = num.length();
		for (int i = 0; i <length/2; i++) {
			if(num.charAt(i)!=num.charAt(length-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean isPalindrome = new Solution().isPalindrome(-2345432);
		System.out.println(isPalindrome);
	}
}
