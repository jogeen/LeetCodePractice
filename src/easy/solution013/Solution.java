package easy.solution013;

public class Solution {
	public int romantoInt(String s) {
		java.util.Map<Character, Integer> code = new java.util.HashMap<>();
		code.put('I', 1);
		code.put('V', 5);
		code.put('X', 10);
		code.put('L', 50);
		code.put('C', 100);
		code.put('D', 500);
		code.put('M', 1000);
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			Integer a = code.get(s.charAt(i));
			Integer b = i < s.length() - 1 ? code.get(s.charAt(i + 1)) : 0;
			if (a < b) {
				total += (b - a);
				i++;
			} else {
				total += a;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int romantoInt = new Solution().romantoInt("MCMXCIV");
		System.out.println(romantoInt);
	}
}
