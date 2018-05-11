package easy.solution014;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		int minLength = strs[0].length();
		for (String str : strs) {
			if (str == null || "".equals(str)) {
				return "";
			}
			if (str.length() < minLength) {
				minLength = str.length();
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < minLength; i++) {
			char temp = strs[0].charAt(i);
			boolean isSame = true;
			for (String str : strs) {
				if (temp != str.charAt(i)) {
					isSame = false;
					continue;
				}
			}
			if (isSame) {
				sb.append(temp);
			}else {
				break;
			}
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String a[] = { "abc", "cba", };
		String longestCommonPrefix = new Solution().longestCommonPrefix(a);
		System.out.println(longestCommonPrefix);
	}
}
