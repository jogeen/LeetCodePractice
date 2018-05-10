package middling.solution8;

public class Solution {

	public int myAtoi(String str) {
		String num = str.trim();
		byte[] bytes = num.getBytes();
		int index = 0;
		for (int i = 0; i < bytes.length; i++) {
			if (i == 0) {
				if (bytes[i] == 45 || bytes[i] == 43 || (bytes[i] >= 48 && bytes[i] <= 57)) {
					index++;
				} else {
					return 0;
				}
			} else {
				if (bytes[i] < 48 || bytes[i] > 57) {
					break;
				} else {
					index++;
				}
			}
		}
		num = num.substring(0, index);
		if ("-".equals(num) || "+".equals(num)||"".equals(num)) {
			return 0;
		}
		java.math.BigDecimal myAtoi = new java.math.BigDecimal(num);
		if (myAtoi.compareTo(new java.math.BigDecimal(Integer.MAX_VALUE))>0)
			return Integer.MAX_VALUE;
		if (myAtoi.compareTo(new java.math.BigDecimal(Integer.MIN_VALUE))<0)
			return Integer.MIN_VALUE;
		return Integer.valueOf(num);
	}

	public static void main(String[] args) {
		int twoSum = new Solution().myAtoi("20000000000000000000");
		System.out.println(twoSum);
	}
}
