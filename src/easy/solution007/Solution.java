package easy.solution007;

public class Solution {

	public int reverse(int x) {
		String num = "" + x;
		StringBuffer sb = new StringBuffer();
		int length = num.length();
		for (int i = 0; i < length; i++) {
			int index = length - 1 - i;
			if ("-".equals(num.substring(index,index+1))) {
				sb = new StringBuffer("-" + sb.toString());
			}else {
				sb.append(num.charAt(index));
			}
		}

		Long reverseLong = Long.valueOf(sb.toString());
		if (reverseLong > Integer.MAX_VALUE || reverseLong < Integer.MIN_VALUE) {
			return 0;
		}
		return Integer.valueOf(sb.toString());
	}

	public static void main(String[] args) {
		int twoSum = new Solution().reverse(-123);
		System.out.println(twoSum);
	}
}
